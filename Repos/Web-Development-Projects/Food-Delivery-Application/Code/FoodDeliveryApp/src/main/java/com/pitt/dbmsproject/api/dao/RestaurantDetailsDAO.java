package com.pitt.dbmsproject.api.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import com.pitt.dbmsproject.api.entity.RestaurantDetailsEntity;
import org.springframework.data.jpa.repository.Query;

public interface RestaurantDetailsDAO extends CrudRepository<RestaurantDetailsEntity, Integer> {

	@Query(value = "SELECT r.rest_id, r.user_id, r.name, r.city, r.zip_code FROM restaurant r "
			+ "JOIN user_login u ON r.user_id=u.user_id WHERE LOWER(u.user_name) = ?1", 
			nativeQuery = true)
	public List<RestaurantDetailsEntity> findRestaurantsByUserName(String userName);

	@Query(value = "SELECT r.rest_id, r.user_id, r.name, r.city, r.zip_code FROM restaurant r "
			+ "JOIN user_login u ON r.user_id=u.user_id "
			+ "JOIN ordr o ON r.rest_id=o.rest_id WHERE LOWER(u.user_name) = ?1 GROUP BY r.rest_id",
			nativeQuery = true)
	public List<RestaurantDetailsEntity> findRestaurantsByUserNameJoinOrders(String userName);

	@Query(value = "SELECT DISTINCT city FROM restaurant",
			nativeQuery = true)
	public Set<String> findDistinctCityNames();

	public Set<RestaurantDetailsEntity> findByCityIgnoreCase(String cityName);

	@Query(value = "SELECT r.rest_id, r.user_id, r.name, r.city, r.zip_code, AVG(rv.stars) FROM review rv JOIN restaurant r "
			+ "ON rv.rest_id=r.rest_id " 
			+ "WHERE LOWER(r.city) = ?1 GROUP BY r.rest_id ORDER BY AVG(rv.stars) DESC",
			nativeQuery = true)
	public List<RestaurantDetailsEntity> findTopRatedRestaurantsByCityNameIgnoreCase(String cityName);
	
}
