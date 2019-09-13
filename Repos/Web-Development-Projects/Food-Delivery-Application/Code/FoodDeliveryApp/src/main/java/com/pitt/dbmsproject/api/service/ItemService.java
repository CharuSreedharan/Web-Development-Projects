package com.pitt.dbmsproject.api.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pitt.dbmsproject.api.dao.ItemDetailsDAO;
import com.pitt.dbmsproject.api.dao.RestaurantItemDetailsDAO;
import com.pitt.dbmsproject.api.entity.CuisineDetailsEntity;
import com.pitt.dbmsproject.api.entity.ItemDetailsEntity;
import com.pitt.dbmsproject.api.entity.RestaurantDetailsEntity;
import com.pitt.dbmsproject.api.entity.RestaurantItemDetailsEntity;
import com.pitt.dbmsproject.api.model.ItemDetailsVO;

@Service
public class ItemService {
	
	@Autowired
	private ItemDetailsDAO itemDetailsDAO;
	
	@Autowired
	private RestaurantItemDetailsDAO restaurantItemDetailsDAO;
	
	public List<ItemDetailsVO> getItemsByRestaurantIdAndCuisineId(int restId, int cuisineId){
		List<ItemDetailsVO> itemDetailsVOs = new ArrayList<ItemDetailsVO>();
		for(ItemDetailsEntity ide: itemDetailsDAO.findByItemsByRestaurantIdAndCuisineId(restId, cuisineId)) {
			ItemDetailsVO itemDetailsVO = new ItemDetailsVO();
			BeanUtils.copyProperties(ide, itemDetailsVO);
			itemDetailsVO.setCuisineId(ide.getCuisineDetailsEntity().getCuisineId());
			itemDetailsVOs.add(itemDetailsVO);
		}	
		return itemDetailsVOs;
	}
	
	public List<ItemDetailsVO> getMostEconomicalItemsUnderPriceByRestId(int restId, int price) {
		List<ItemDetailsVO> itemDetailsVOs = new ArrayList<ItemDetailsVO>();
		for(ItemDetailsEntity ide: itemDetailsDAO.findMostEconomicalItemsUnderPriceByRestId(restId, price)) {
			ItemDetailsVO itemDetailsVO = new ItemDetailsVO();
			BeanUtils.copyProperties(ide, itemDetailsVO);
			itemDetailsVO.setCuisineId(ide.getCuisineDetailsEntity().getCuisineId());
			itemDetailsVOs.add(itemDetailsVO);
		}	
		return itemDetailsVOs;
	}
	
	public void createItem(int restaurantId, int cuisineId, ItemDetailsVO itemDetailsVO) {
		itemDetailsVO.setCuisineId(cuisineId);
		ItemDetailsEntity itemDetailsEntity= new ItemDetailsEntity();
		BeanUtils.copyProperties(itemDetailsVO, itemDetailsEntity);
		itemDetailsEntity.setCuisineDetailsEntity(new CuisineDetailsEntity(cuisineId));
		itemDetailsDAO.save(itemDetailsEntity);
		ItemDetailsEntity ide = itemDetailsDAO.findByItemNameIgnoreCase(
				itemDetailsVO.getItemName()); 
		RestaurantItemDetailsEntity restaurantItemDetailsEntity = 
				new RestaurantItemDetailsEntity();
		restaurantItemDetailsEntity.setRestaurantDetailsEntity(
				new RestaurantDetailsEntity(restaurantId));
		restaurantItemDetailsEntity.setItemDetailsEntity(
				new ItemDetailsEntity(ide.getItemId()));
		restaurantItemDetailsDAO.save(restaurantItemDetailsEntity);
	}
	
	public void updateItem(int itemId, ItemDetailsVO itemDetailsVO){
		ItemDetailsEntity itemDetailsEntity = itemDetailsDAO.findById(itemId).get();
		if(null!=itemDetailsVO.getItemName() && !itemDetailsVO.getItemName().isEmpty())
			itemDetailsEntity.setItemName(itemDetailsVO.getItemName());
		if(null!=itemDetailsVO.getDescription() && !itemDetailsVO.getDescription().isEmpty())
			itemDetailsEntity.setDescription(itemDetailsVO.getDescription());
		if(itemDetailsVO.getPrice()>=0)
			itemDetailsEntity.setPrice(itemDetailsVO.getPrice());
		
		itemDetailsDAO.save(itemDetailsEntity);
	}
	
	@Transactional
	public void deleteItem(int itemId){
		itemDetailsDAO.deleteById(itemId);
	}

}


