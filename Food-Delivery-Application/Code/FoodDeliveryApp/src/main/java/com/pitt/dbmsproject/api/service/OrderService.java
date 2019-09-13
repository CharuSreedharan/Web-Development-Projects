package com.pitt.dbmsproject.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pitt.dbmsproject.api.controller.DistanceCalculatorControllerInterface;
import com.pitt.dbmsproject.api.dao.OrderDetailsDAO;
import com.pitt.dbmsproject.api.dao.OrderSuborderDetailsDAO;
import com.pitt.dbmsproject.api.dao.RestaurantDetailsDAO;
import com.pitt.dbmsproject.api.dao.SuborderDetailsDAO;
import com.pitt.dbmsproject.api.entity.AddressEntity;
import com.pitt.dbmsproject.api.entity.CuisineDetailsEntity;
import com.pitt.dbmsproject.api.entity.ItemDetailsEntity;
import com.pitt.dbmsproject.api.entity.OrderDetailsEntity;
import com.pitt.dbmsproject.api.entity.OrderSuborderDetailsEntity;
import com.pitt.dbmsproject.api.entity.RestaurantDetailsEntity;
import com.pitt.dbmsproject.api.entity.SuborderDetailsEntity;
import com.pitt.dbmsproject.api.entity.UserDetailsEntity;
import com.pitt.dbmsproject.api.model.AddressVO;
import com.pitt.dbmsproject.api.model.DistanceVO;
import com.pitt.dbmsproject.api.model.OrderDetailsVO;
import com.pitt.dbmsproject.api.model.SuborderDetailsVO;
import java.sql.Timestamp;
import com.pitt.dbmsproject.api.dao.AddressDetailsDAO;

@Service
public class OrderService {
	
	@Autowired
	private OrderDetailsDAO orderDetailsDAO;
	
	@Autowired
	private RestaurantDetailsDAO restaurantDetailsDAO;
	
	@Autowired
	private OrderSuborderDetailsDAO orderSuborderDetailsDAO;
	
	@Autowired
    private DistanceCalculatorControllerInterface distanceCalculatorControllerInterface;
	
	@Autowired
	private AddressDetailsDAO addressDetailsDAO;
	
	@Autowired
	private SuborderService suborderService;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	private static final int speed_milesperhour = 30;
	
	private static final int min = 0;
	
	private static final int max = 1;
	
	private int deliveryFlag = 0;
	
	public List<OrderDetailsVO> getAllOrders(){
		List<OrderDetailsVO> orderDetailsVOs = new ArrayList<OrderDetailsVO>();
		for(OrderDetailsEntity ode: orderDetailsDAO.findAll()) {
			OrderDetailsVO orderDetailsVO = new OrderDetailsVO();
			AddressVO addressVO = new AddressVO();
			BeanUtils.copyProperties(ode.getDeliveryAddressDetails(), addressVO);
			BeanUtils.copyProperties(ode, orderDetailsVO);
			List<SuborderDetailsVO> suborderDetailsVOs = new ArrayList<SuborderDetailsVO>();
			for(OrderSuborderDetailsEntity osde: orderSuborderDetailsDAO.findByOrderDetailsEntityOrderId(ode.getOrderId())) {
				SuborderDetailsVO suborderDetailsVO = new SuborderDetailsVO();
				populateSuborderDetailsVO(suborderDetailsVOs, osde.getSuborderDetailsEntity(), suborderDetailsVO);
			}
			orderDetailsVO.setSuborderDetailsVO(suborderDetailsVOs);
			orderDetailsVO.setUserId(ode.getUserDetailsEntity().getUserId());
			orderDetailsVO.setRestaurantId(ode.getRestaurantDetailsEntity().getRestaurantId());
			orderDetailsVO.setDeliveryAddressDetails(addressVO);
			orderDetailsVOs.add(orderDetailsVO);
		}	
		return orderDetailsVOs;
	}
	
	public List<OrderDetailsVO> getOrdersByUserName(String userName) {
		List<OrderDetailsVO> orderDetailsVOs = new ArrayList<OrderDetailsVO>();
		for(OrderDetailsEntity ode: orderDetailsDAO.findOrderDetailsByUserNameIgnoreCase(userName.toLowerCase())) {
			OrderDetailsVO orderDetailsVO = new OrderDetailsVO();
			AddressVO addressVO = new AddressVO();
			BeanUtils.copyProperties(ode.getDeliveryAddressDetails(), addressVO);
			BeanUtils.copyProperties(ode, orderDetailsVO);
			List<SuborderDetailsVO> suborderDetailsVOs = new ArrayList<SuborderDetailsVO>();
			for(OrderSuborderDetailsEntity osde: orderSuborderDetailsDAO.findByOrderDetailsEntityOrderId(ode.getOrderId())) {
				SuborderDetailsVO suborderDetailsVO = new SuborderDetailsVO();
				populateSuborderDetailsVO(suborderDetailsVOs, osde.getSuborderDetailsEntity(), suborderDetailsVO);
			}
			orderDetailsVO.setSuborderDetailsVO(suborderDetailsVOs);
			orderDetailsVO.setUserId(ode.getUserDetailsEntity().getUserId());
			orderDetailsVO.setRestaurantId(ode.getRestaurantDetailsEntity().getRestaurantId());
			orderDetailsVO.setDeliveryAddressDetails(addressVO);
			orderDetailsVOs.add(orderDetailsVO);
		}	
		return orderDetailsVOs;
	}

	private void populateSuborderDetailsVO(List<SuborderDetailsVO> suborderDetailsVOs, SuborderDetailsEntity sde,
			SuborderDetailsVO suborderDetailsVO) {
		BeanUtils.copyProperties(sde, suborderDetailsVO);
		suborderDetailsVO.setUserId(sde.getUserDetailsEntity().getUserId());
		suborderDetailsVO.setRestaurantId(sde.getRestaurantDetailsEntity().getRestaurantId());
		suborderDetailsVO.setCuisineId(sde.getCuisineDetailsEntity().getCuisineId());
		suborderDetailsVO.setItemId(sde.getItemDetailsEntity().getItemId());
		suborderDetailsVO.setUserName(sde.getUserDetailsEntity().getUserName());
		suborderDetailsVO.setRestaurantName(sde.getRestaurantDetailsEntity().getName());
		suborderDetailsVO.setCuisineName(sde.getCuisineDetailsEntity().getCuisineName());
		suborderDetailsVO.setItemName(sde.getItemDetailsEntity().getItemName());
		suborderDetailsVOs.add(suborderDetailsVO);
	}
	
	public void createOrder(OrderDetailsVO orderDetailsVO) throws Exception {
		OrderDetailsEntity orderDetailsEntity = new OrderDetailsEntity();
		double time = computeEstimatedDeliveryTime(orderDetailsVO);
		Timestamp estimatedDeliveryTimestamp = new Timestamp(System.currentTimeMillis());
		//Timestamp oldTimestamp = new Timestamp(System.currentTimeMillis());
		estimatedDeliveryTimestamp.setTime(System.currentTimeMillis() + (long)time);
		int userId = userDetailsService.getUserDetailsByUserName(orderDetailsVO.getUserName()).getUserId();
		populateOrderDetailsVO(orderDetailsVO, orderDetailsEntity, estimatedDeliveryTimestamp, userId);
		AddressEntity addressEntity = addressDetailsDAO.findByAddressIgnoreCase(orderDetailsVO.getDeliveryAddressDetails().getAddress());
		if(null==addressEntity) 
			addressEntity = new AddressEntity();
		addressEntity.setAddress(orderDetailsVO.getDeliveryAddressDetails().getAddress());
		addressEntity.setZipCode(orderDetailsVO.getDeliveryAddressDetails().getZipCode());
		AddressEntity ae = addressDetailsDAO.save(addressEntity);
		orderDetailsEntity.setDeliveryAddressDetails(ae);
		OrderDetailsEntity ode = orderDetailsDAO.save(orderDetailsEntity);
		for(SuborderDetailsVO suborderDetailsVO: orderDetailsVO.getSuborderDetailsVO()) {
			OrderSuborderDetailsEntity osde = new OrderSuborderDetailsEntity();
			osde.setOrderDetailsEntity(ode);
			osde.setSuborderDetailsEntity(new SuborderDetailsEntity(suborderDetailsVO.getSuborderId()));
			orderSuborderDetailsDAO.save(osde);
			SuborderDetailsEntity sde = suborderService.retrieveEntityById(suborderDetailsVO.getSuborderId());
			sde.setStatus(1);
			suborderService.saveSubOrder(sde);
		}
	}

	private void populateOrderDetailsVO(OrderDetailsVO orderDetailsVO, OrderDetailsEntity orderDetailsEntity,
			Timestamp estimatedDeliveryTimestamp, int userId) {
		double price = 0.0;
		orderDetailsVO.setEstimatedDeliveryTime(estimatedDeliveryTimestamp);
		generateRandom();
		orderDetailsVO.setDeliveryFlag(deliveryFlag);
		if(!orderDetailsVO.getSuborderDetailsVO().isEmpty()) {
			for(SuborderDetailsVO suborderDetailsVO: orderDetailsVO.getSuborderDetailsVO())
				price+=suborderDetailsVO.getTotalPrice();
		}
		orderDetailsVO.setTotalPrice(price);
		orderDetailsVO.setUserId(userId);
		BeanUtils.copyProperties(orderDetailsVO, orderDetailsEntity);
		orderDetailsEntity.setUserDetailsEntity(new UserDetailsEntity(orderDetailsVO.getUserId()));
		orderDetailsEntity.setRestaurantDetailsEntity(new RestaurantDetailsEntity(orderDetailsVO.getRestaurantId()));
	}

	private SuborderDetailsEntity populateSuborderDetailsEntity(SuborderDetailsVO suborderDetailsVO) {
		SuborderDetailsEntity suborderDetailsEntity=null;
		if(null!=suborderDetailsVO) {
			suborderDetailsEntity = new SuborderDetailsEntity();
			populateSuborderDetailsEntity(suborderDetailsVO, suborderDetailsEntity);
		}
		return suborderDetailsEntity;
	}

	private void populateSuborderDetailsEntity(SuborderDetailsVO suborderDetailsVO, SuborderDetailsEntity suborderDetailsEntity) {
		BeanUtils.copyProperties(suborderDetailsVO, suborderDetailsEntity);
		suborderDetailsEntity.setUserDetailsEntity(new UserDetailsEntity(suborderDetailsVO.getUserId()));
		suborderDetailsEntity.setRestaurantDetailsEntity(new RestaurantDetailsEntity(suborderDetailsVO.getRestaurantId()));
		suborderDetailsEntity.setCuisineDetailsEntity(new CuisineDetailsEntity(suborderDetailsVO.getCuisineId()));
		suborderDetailsEntity.setItemDetailsEntity(new ItemDetailsEntity(suborderDetailsVO.getItemId()));
	}

	private void generateRandom() {
		Random r = new Random();
		int random = r.nextInt((max - min) + 1) + min;
		deliveryFlag = random;
	}

	private double computeEstimatedDeliveryTime(OrderDetailsVO orderDetailsVO) throws Exception {
		int restaurantZipCode = restaurantDetailsDAO.findById(orderDetailsVO.getRestaurantId()).get().getZipCode();
		int deliveryZipCode = orderDetailsVO.getDeliveryAddressDetails().getZipCode();
		if(validateZipCodes(restaurantZipCode, deliveryZipCode)) {
			DistanceVO distanceVO = distanceCalculatorControllerInterface.getDistanceBetweenTwoZipCodes(restaurantZipCode,  
					deliveryZipCode);
			double distance = distanceVO.getDistance();
			int speed = speed_milesperhour;
			// time in ms
			double time = (distance/speed)*3600*1000;
			return time;
		}
		else {
			throw new Exception("The input zip code(s) is invalid");
		}
	}
	
	private boolean validateZipCodes(int restaurantZipCode, int deliveryZipCode) {
		String regex = "^[0-9]{5}(?:-[0-9]{4})?$";
		Pattern pattern = Pattern.compile(regex);
		boolean flag1 = pattern.matcher(String.valueOf(restaurantZipCode)).matches();
		boolean flag2 = pattern.matcher(String.valueOf(deliveryZipCode)).matches();
		return flag1 && flag2;
	}
	
}
