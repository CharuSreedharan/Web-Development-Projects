package com.pitt.dbmsproject.api.dao;

import org.springframework.data.repository.CrudRepository;
import com.pitt.dbmsproject.api.entity.RestaurantItemDetailsEntity;

public interface RestaurantItemDetailsDAO extends CrudRepository<RestaurantItemDetailsEntity, Integer> {

}
