package com.pitt.dbmsproject.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.pitt.dbmsproject.api.entity.ItemDetailsEntity;

public interface ItemDetailsDAO extends CrudRepository<ItemDetailsEntity, Integer> {
	
	@Query(value = "SELECT i.item_id, i.cuisine_id, i.item_name, i.description, i.price FROM "
			+ "restaurant_item ri JOIN item i ON ri.item_id=i.item_id WHERE "
			+ "ri.rest_id=?1 AND i.cuisine_id=?2", 
			nativeQuery = true)
	public List<ItemDetailsEntity> findByItemsByRestaurantIdAndCuisineId(int restaurantId, 
			int cuisineId);
	
	public ItemDetailsEntity findByItemNameIgnoreCase(String itemName);

	@Query(value = "SELECT i.item_id, i.cuisine_id, i.item_name, i.description, i.price FROM restaurant_cuisine rc "
			+ "JOIN item i ON rc.cuisine_id=i.cuisine_id " 
			+ "JOIN restaurant_item ri ON i.item_id=ri.item_id "
			+ "WHERE rc.rest_id=?1 AND ri.rest_id=?1 AND i.price<=?2 ORDER BY i.price", 
			nativeQuery = true)
	public List<ItemDetailsEntity> findMostEconomicalItemsUnderPriceByRestId(int restId, int price);

}
