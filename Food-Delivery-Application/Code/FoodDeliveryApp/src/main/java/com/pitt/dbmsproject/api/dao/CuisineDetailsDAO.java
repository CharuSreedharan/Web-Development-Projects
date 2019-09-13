package com.pitt.dbmsproject.api.dao;

import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.pitt.dbmsproject.api.entity.CuisineDetailsEntity;
import com.pitt.dbmsproject.api.model.TestVO;

public interface CuisineDetailsDAO extends CrudRepository<CuisineDetailsEntity, Integer> {
	
	public CuisineDetailsEntity findByCuisineNameIgnoreCase(String cuisineName);
	
//	@Query(value = "SELECT c.cuisine_id, c.name, count(*), 'cuisine' FROM cuisine c JOIN restaurant_cuisine rc "  
//			+ "ON c.cuisine_id=rc.cuisine_id GROUP BY rc.rest_id order by count(*) DESC", 
//			nativeQuery = true)
//	public List<CuisineDetailsEntity> findCuisinesByRestaurantId(int restaurantId);
	
	@Query(value = "SELECT c.cuisine_id, c.name FROM cuisine c JOIN restaurant_cuisine rc "
			+ "ON c.cuisine_id=rc.cuisine_id WHERE rc.rest_id = ?1", 
			nativeQuery = true)
	public List<CuisineDetailsEntity> findCuisinesByRestaurantId(int restaurantId);

	@Query(value = "SELECT c.cuisine_id, c.name FROM ordr o JOIN ordr_suborder os ON o.ordr_id=os.ordr_id "
			+ "JOIN suborder s ON os.so_id=s.so_id JOIN cuisine c ON c.cuisine_id=s.cuisine_id " 
			+ "WHERE o.rest_id = ?1 GROUP BY s.cuisine_id ORDER BY count(*) DESC", 
			nativeQuery = true)		
	public List<CuisineDetailsEntity> findTopCuisinesByRestaurantId(int restaurantId);

	
	
}
