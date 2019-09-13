package com.pitt.dbmsproject.api.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.pitt.dbmsproject.api.entity.OrderDetailsEntity;

public interface OrderDetailsDAO extends CrudRepository<OrderDetailsEntity, Integer> {

	@Query(value = "SELECT o.ordr_id, o.user_id, o.rest_id, o.total_price, o.address_id,"
			+ "o.estimated_delivery_time, o.delivery_flag FROM ordr o JOIN user_login u "
			+ "ON o.user_id=u.user_id WHERE LOWER(u.user_name) = ?1", nativeQuery = true)
	public List<OrderDetailsEntity> findOrderDetailsByUserNameIgnoreCase(String userName);

	@Query(value = "SELECT sum(o.total_price) AS totalprice FROM ordr o WHERE o.rest_id = ?1", 
			nativeQuery = true)	
	public Integer findSalesByRestaurant(int restaurantId);

}
