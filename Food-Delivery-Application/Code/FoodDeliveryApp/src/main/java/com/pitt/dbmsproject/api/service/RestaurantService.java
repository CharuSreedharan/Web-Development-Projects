package com.pitt.dbmsproject.api.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pitt.dbmsproject.api.dao.OrderDetailsDAO;
import com.pitt.dbmsproject.api.dao.RestaurantDetailsDAO;
import com.pitt.dbmsproject.api.entity.OrderDetailsEntity;
import com.pitt.dbmsproject.api.entity.RestaurantDetailsEntity;
import com.pitt.dbmsproject.api.model.RestaurantDetailsVO;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantDetailsDAO restaurantDetailsDAO;
	
	@Autowired
	private OrderDetailsDAO orderDetailsDAO;
	
	public List<RestaurantDetailsVO> getAllRestaurants() {
		List<RestaurantDetailsVO> restaurantDetailsVOs = new ArrayList<RestaurantDetailsVO>();
		for(RestaurantDetailsEntity rde: restaurantDetailsDAO.findAll()) {
			RestaurantDetailsVO restaurantDetailsVO = new RestaurantDetailsVO();
			BeanUtils.copyProperties(rde, restaurantDetailsVO);
			restaurantDetailsVO.setUserId(rde.getUserDetailsEntity().getUserId());
			restaurantDetailsVOs.add(restaurantDetailsVO);
		}
		return restaurantDetailsVOs;
	}
	
	public List<RestaurantDetailsVO> getRestaurantsByUserName(String userName){
		List<RestaurantDetailsVO> restaurantDetailsVOs = new ArrayList<RestaurantDetailsVO>();
		for(RestaurantDetailsEntity rde: restaurantDetailsDAO.findRestaurantsByUserName(userName.toLowerCase())) {
			RestaurantDetailsVO restaurantDetailsVO = new RestaurantDetailsVO();
			BeanUtils.copyProperties(rde, restaurantDetailsVO);
			restaurantDetailsVO.setUserId(rde.getUserDetailsEntity().getUserId());
			restaurantDetailsVOs.add(restaurantDetailsVO);
		}	
		return restaurantDetailsVOs;
	}

	public List<RestaurantDetailsVO> getRestaurantsSortedBySales(String userName) {
		List<RestaurantDetailsVO> restaurantDetailsVOs = new ArrayList<RestaurantDetailsVO>();
		// fetch all restaurants belonging to an owner
		for(RestaurantDetailsEntity rde: restaurantDetailsDAO.findRestaurantsByUserNameJoinOrders(userName.toLowerCase())) {
			RestaurantDetailsVO restaurantDetailsVO = new RestaurantDetailsVO();
			BeanUtils.copyProperties(rde, restaurantDetailsVO);
			int totalPrice = orderDetailsDAO.findSalesByRestaurant(rde.getRestaurantId());
			restaurantDetailsVO.setUserId(rde.getUserDetailsEntity().getUserId());
			restaurantDetailsVO.setTotalPrice(totalPrice);
			restaurantDetailsVOs.add(restaurantDetailsVO);
		}
		Collections.sort(restaurantDetailsVOs, new Comparator<RestaurantDetailsVO>() {
			@Override
		    public int compare(RestaurantDetailsVO rdvo1,RestaurantDetailsVO rdvo2)
		    {
				if(rdvo2.getTotalPrice() > rdvo1.getTotalPrice())
					return 1;
				else if(rdvo1.getTotalPrice() > rdvo2.getTotalPrice())
					return -1;
		        return 0;
		    }
		});
		
		return restaurantDetailsVOs;
	}

	public Set<String> getDistinctCityNames() {
		Set<String> cityDetailsSet = new HashSet<>();
		for(String cityName: restaurantDetailsDAO.findDistinctCityNames()) {
			cityDetailsSet.add(cityName);
		}
		return cityDetailsSet;
	}

	public Set<RestaurantDetailsVO> getRestaurantsByCityNames(String cityName) {
		Set<RestaurantDetailsVO> restaurantDetailsVOSet = new HashSet<>();
		for(RestaurantDetailsEntity rde: restaurantDetailsDAO.findByCityIgnoreCase(cityName)) {
			RestaurantDetailsVO restaurantDetailsVO = new RestaurantDetailsVO();
			BeanUtils.copyProperties(rde, restaurantDetailsVO);
			restaurantDetailsVO.setUserId(rde.getUserDetailsEntity().getUserId());
			restaurantDetailsVOSet.add(restaurantDetailsVO);
		}
		return restaurantDetailsVOSet;
	}

	public List<RestaurantDetailsVO> getTopRatedRestaurantsByCityName(String cityName) {
		List<RestaurantDetailsVO> restaurantDetailsVOs = new ArrayList<RestaurantDetailsVO>();
		for(RestaurantDetailsEntity rde: restaurantDetailsDAO.findTopRatedRestaurantsByCityNameIgnoreCase(cityName.toLowerCase())) {
			RestaurantDetailsVO restaurantDetailsVO = new RestaurantDetailsVO();
			BeanUtils.copyProperties(rde, restaurantDetailsVO);
			restaurantDetailsVO.setUserId(rde.getUserDetailsEntity().getUserId());
			restaurantDetailsVOs.add(restaurantDetailsVO);
		}
		return restaurantDetailsVOs;
	}
	
}
