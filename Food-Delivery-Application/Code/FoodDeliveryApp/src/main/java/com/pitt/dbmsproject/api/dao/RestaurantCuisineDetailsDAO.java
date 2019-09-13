package com.pitt.dbmsproject.api.dao;

import org.springframework.data.repository.CrudRepository;
import com.pitt.dbmsproject.api.entity.RestaurantCuisineDetailsEntity;

public interface RestaurantCuisineDetailsDAO extends CrudRepository<RestaurantCuisineDetailsEntity, Integer> {

}
