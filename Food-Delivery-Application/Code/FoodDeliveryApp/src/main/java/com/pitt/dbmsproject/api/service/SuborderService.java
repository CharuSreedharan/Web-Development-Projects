package com.pitt.dbmsproject.api.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pitt.dbmsproject.api.dao.SuborderDetailsDAO;
import com.pitt.dbmsproject.api.dao.UserDetailsDAO;
import com.pitt.dbmsproject.api.entity.CuisineDetailsEntity;
import com.pitt.dbmsproject.api.entity.ItemDetailsEntity;
import com.pitt.dbmsproject.api.entity.RestaurantDetailsEntity;
import com.pitt.dbmsproject.api.entity.SuborderDetailsEntity;
import com.pitt.dbmsproject.api.entity.UserDetailsEntity;
import com.pitt.dbmsproject.api.model.IDDetailsVO;
import com.pitt.dbmsproject.api.model.SuborderDetailsVO;
import com.pitt.dbmsproject.api.model.UserDetailsVO;

@Service
public class SuborderService {
	
	@Autowired
	private SuborderDetailsDAO suborderDetailsDAO;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	public List<SuborderDetailsVO> addToCart(List<SuborderDetailsVO> suborderDetailsVOs) {
		if(null==suborderDetailsVOs || suborderDetailsVOs.isEmpty())
			return null;
		
		for(SuborderDetailsVO suborderDetailsVO: suborderDetailsVOs) {
			SuborderDetailsEntity suborderDetailsEntity= new SuborderDetailsEntity();
			UserDetailsVO userDetailsVO = userDetailsService.getUserDetailsByUserName(suborderDetailsVO.getUserName());
			BeanUtils.copyProperties(suborderDetailsVO, suborderDetailsEntity);
			suborderDetailsEntity.setUserDetailsEntity(new UserDetailsEntity(userDetailsVO.getUserId()));
			suborderDetailsEntity.setRestaurantDetailsEntity(new RestaurantDetailsEntity(suborderDetailsVO.getRestaurantId()));
			suborderDetailsEntity.setCuisineDetailsEntity(new CuisineDetailsEntity(suborderDetailsVO.getCuisineId()));
			suborderDetailsEntity.setItemDetailsEntity(new ItemDetailsEntity(suborderDetailsVO.getItemId()));
			suborderDetailsEntity.setStatus(0);
			SuborderDetailsEntity sde = suborderDetailsDAO.save(suborderDetailsEntity);
			suborderDetailsVO.setSuborderId(sde.getSuborderId());
			suborderDetailsVO.setUserId(sde.getUserDetailsEntity().getUserId());
			suborderDetailsVO.setUserName(sde.getUserDetailsEntity().getUserName());
			suborderDetailsVO.setRestaurantName(sde.getRestaurantDetailsEntity().getName());
			suborderDetailsVO.setCuisineName(sde.getCuisineDetailsEntity().getCuisineName());
			suborderDetailsVO.setItemName(sde.getItemDetailsEntity().getItemName());
		}
		return suborderDetailsVOs;
	}
	
	public List<SuborderDetailsVO> viewCartBySuborderIds(List<IDDetailsVO> suborderIdList) {
		if(null==suborderIdList || suborderIdList.isEmpty())
			return null;
		
		List<SuborderDetailsVO> suborderDetailsVOs = new ArrayList<SuborderDetailsVO>();
		for(IDDetailsVO idDetailsVO: suborderIdList) {
			SuborderDetailsEntity sde = suborderDetailsDAO.findById(idDetailsVO.getId()).get();
			if(null!=sde) {
				SuborderDetailsVO suborderDetailsVO = new SuborderDetailsVO();
				BeanUtils.copyProperties(sde, suborderDetailsVO);
				suborderDetailsVO.setUserId(sde.getUserDetailsEntity().getUserId());
				suborderDetailsVO.setUserName(sde.getUserDetailsEntity().getUserName());
				suborderDetailsVO.setRestaurantId(sde.getRestaurantDetailsEntity().getRestaurantId());
				suborderDetailsVO.setRestaurantName(sde.getRestaurantDetailsEntity().getName());
				suborderDetailsVO.setCuisineId(sde.getCuisineDetailsEntity().getCuisineId());
				suborderDetailsVO.setCuisineName(sde.getCuisineDetailsEntity().getCuisineName());
				suborderDetailsVO.setItemId(sde.getItemDetailsEntity().getItemId());
				suborderDetailsVO.setItemName(sde.getItemDetailsEntity().getItemName());
				suborderDetailsVOs.add(suborderDetailsVO);
			}
		}
		return suborderDetailsVOs;
	}
	
	public List<SuborderDetailsVO> viewCartByUserName(String userName) {
		List<SuborderDetailsVO> suborderDetailsVOs = new ArrayList<SuborderDetailsVO>();
		for(SuborderDetailsEntity sde: suborderDetailsDAO.findByUserDetailsEntityUserNameIgnoreCase(userName.toLowerCase())) {
			if(sde.getStatus()==0) {
				SuborderDetailsVO suborderDetailsVO = new SuborderDetailsVO();
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
		}
		return suborderDetailsVOs;
	}

	public void deleteCart(List<IDDetailsVO> suborderIdList) {
		if(null==suborderIdList || suborderIdList.isEmpty()) {
			return;
		}
		for(IDDetailsVO idDetailsVO: suborderIdList) {
			suborderDetailsDAO.deleteById(idDetailsVO.getId());
		}
	}
	
	public SuborderDetailsEntity retrieveEntityById(int suborderId) {
		return suborderDetailsDAO.findById(suborderId).get();
	}

	public void saveSubOrder(SuborderDetailsEntity suborderDetailsEntity) {
		suborderDetailsDAO.save(suborderDetailsEntity);
	}
}
