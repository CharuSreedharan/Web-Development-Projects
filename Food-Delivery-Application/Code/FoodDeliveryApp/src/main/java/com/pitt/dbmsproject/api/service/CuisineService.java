package com.pitt.dbmsproject.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pitt.dbmsproject.api.dao.CuisineDetailsDAO;
import com.pitt.dbmsproject.api.dao.RestaurantCuisineDetailsDAO;
import com.pitt.dbmsproject.api.entity.CuisineDetailsEntity;
import com.pitt.dbmsproject.api.entity.RestaurantCuisineDetailsEntity;
import com.pitt.dbmsproject.api.entity.RestaurantDetailsEntity;
import com.pitt.dbmsproject.api.model.CuisineDetailsVO;
import com.pitt.dbmsproject.api.model.ItemDetailsVO;
import com.pitt.dbmsproject.api.model.TestVO;

@Service
public class CuisineService {
	
	@Autowired
	private CuisineDetailsDAO cuisineDetailsDAO;
	
	@Autowired
	private RestaurantCuisineDetailsDAO restaurantCuisineDetailsDAO;
	
	@Autowired
	private ItemService itemService;
	
	public void createCuisine(int restaurantId, CuisineDetailsVO cuisineDetailsVO) {
		CuisineDetailsEntity cde = null;
		CuisineDetailsEntity cuisineDetailsEntity= new CuisineDetailsEntity();
		BeanUtils.copyProperties(cuisineDetailsVO, cuisineDetailsEntity);
		cde = cuisineDetailsDAO.findByCuisineNameIgnoreCase(cuisineDetailsVO.getCuisineName());
		if(null==cde) {
			cde = cuisineDetailsDAO.save(cuisineDetailsEntity);
		}	
		RestaurantCuisineDetailsEntity restaurantCuisineDetailsEntity = 
				new RestaurantCuisineDetailsEntity();
		restaurantCuisineDetailsEntity.setRestaurantDetailsEntity(
				new RestaurantDetailsEntity(restaurantId));
		restaurantCuisineDetailsEntity.setCuisineDetailsEntity(
				new CuisineDetailsEntity(cde.getCuisineId()));
		restaurantCuisineDetailsDAO.save(restaurantCuisineDetailsEntity);
	}
	
	public List<CuisineDetailsVO> getCuisinesByRestaurantId(int restaurantId){
		List<CuisineDetailsVO> cuisineDetailsVOs = new ArrayList<CuisineDetailsVO>();
		for(CuisineDetailsEntity cde: cuisineDetailsDAO.findCuisinesByRestaurantId(restaurantId)) {
			CuisineDetailsVO cuisineDetailsVO = new CuisineDetailsVO();
			BeanUtils.copyProperties(cde, cuisineDetailsVO);
			cuisineDetailsVOs.add(cuisineDetailsVO);
		}	
		return cuisineDetailsVOs;
	}
	
	public List<CuisineDetailsVO> getCuisinesAndItemsByRestID(int restaurantId){
		List<CuisineDetailsVO> cuisineDetailsVOs = new ArrayList<CuisineDetailsVO>();
		for(CuisineDetailsEntity cde: cuisineDetailsDAO.findCuisinesByRestaurantId(restaurantId)) {
			CuisineDetailsVO cuisineDetailsVO = new CuisineDetailsVO();
			List<ItemDetailsVO> itemDetailsVOs = itemService.getItemsByRestaurantIdAndCuisineId(restaurantId, cde.getCuisineId());
			BeanUtils.copyProperties(cde, cuisineDetailsVO);
			cuisineDetailsVO.setItemDetailsList(itemDetailsVOs);
			cuisineDetailsVOs.add(cuisineDetailsVO);
		}	
		return cuisineDetailsVOs;
	}
	
	public List<CuisineDetailsVO> getTopCuisinesByRestID(int restaurantId){
		List<CuisineDetailsVO> cuisineDetailsVOs = new ArrayList<CuisineDetailsVO>();
		for(CuisineDetailsEntity cde: cuisineDetailsDAO.findTopCuisinesByRestaurantId(restaurantId)) {
			CuisineDetailsVO cuisineDetailsVO = new CuisineDetailsVO();
			List<ItemDetailsVO> itemDetailsVOs = itemService.getItemsByRestaurantIdAndCuisineId(restaurantId, cde.getCuisineId());
			BeanUtils.copyProperties(cde, cuisineDetailsVO);
			cuisineDetailsVO.setItemDetailsList(itemDetailsVOs);
			cuisineDetailsVOs.add(cuisineDetailsVO);
		}	
		return cuisineDetailsVOs;
	}
	
	public void updateCuisine(int cuisineId, CuisineDetailsVO cuisineDetailsVO){
		CuisineDetailsEntity cuisineDetailsEntity = cuisineDetailsDAO.findById(cuisineId).get();
		BeanUtils.copyProperties(cuisineDetailsVO, cuisineDetailsEntity);
		cuisineDetailsEntity.setCuisineId(cuisineId);
		cuisineDetailsDAO.save(cuisineDetailsEntity);
	}
	
	@Transactional
	public void deleteCuisine(int cuisineId){
		cuisineDetailsDAO.deleteById(cuisineId);
	}
}

