package com.pitt.dbmsproject.api.dao;

import org.springframework.data.repository.CrudRepository;
import com.pitt.dbmsproject.api.entity.AddressEntity;

public interface AddressDetailsDAO extends CrudRepository<AddressEntity, Integer> {

	public AddressEntity findByAddressIgnoreCase(String lowerCase);

}
