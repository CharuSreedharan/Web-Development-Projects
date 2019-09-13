package com.pitt.dbmsproject.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.pitt.dbmsproject.api.entity.ReviewDetailsEntity;

public interface ReviewDetailsDAO extends CrudRepository<ReviewDetailsEntity, Integer> {
	
	@Query(value = "SELECT rv.review_id, rv.user_id, rv.rest_id, rv.stars,"
			+ "rv.description FROM review rv JOIN user_login u "
			+ "ON rv.user_id=u.user_id WHERE u.user_name = ?1", 
			nativeQuery = true)
	public List<ReviewDetailsEntity> findReviewDetailsByUserName(String userName);
}
