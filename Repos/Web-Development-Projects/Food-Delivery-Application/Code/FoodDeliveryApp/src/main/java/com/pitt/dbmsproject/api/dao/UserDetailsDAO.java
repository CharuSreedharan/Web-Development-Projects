package com.pitt.dbmsproject.api.dao;

import org.springframework.data.repository.CrudRepository;
import com.pitt.dbmsproject.api.entity.UserDetailsEntity;

public interface UserDetailsDAO extends CrudRepository<UserDetailsEntity, Integer>{

	//@Query(value = "SELECT * FROM user_login WHERE user_name = ?1", nativeQuery = true)
	public UserDetailsEntity findByUserNameIgnoreCase(String userName);
	
	public void deleteByUserNameIgnoreCase(String userName);
	
}
