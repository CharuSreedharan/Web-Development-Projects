package com.pitt.dbmsproject.api.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.pitt.dbmsproject.api.entity.OrderSuborderDetailsEntity;

public interface OrderSuborderDetailsDAO extends CrudRepository<OrderSuborderDetailsEntity, Integer> {

	public List<OrderSuborderDetailsEntity> findByOrderDetailsEntityOrderId(int orderId);
	
	
	

}
