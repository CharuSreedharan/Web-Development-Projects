package com.pitt.dbmsproject.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.pitt.dbmsproject.api.entity.SuborderDetailsEntity;

public interface SuborderDetailsDAO extends CrudRepository<SuborderDetailsEntity, Integer> {
	
//	@Query(value = "SELECT so.so_id, u.user_id, so.rest_id, so.cuisine_id, so.item_id, so.quantity, so.total_price,"
//			+ "so.spice_level, so.comment FROM user_login u "
//			+ "JOIN subordr_new so ON u.user_id=so.user_id WHERE LOWER(u.user_name) = ?1 AND so.so_status=0", 
//			nativeQuery = true)
//	public List<SuborderDetailsEntity> findSuborderDetailsByUserNameIgnoreCase(String userName);
	
	public List<SuborderDetailsEntity> findByUserDetailsEntityUserNameIgnoreCase(String userName);

}
