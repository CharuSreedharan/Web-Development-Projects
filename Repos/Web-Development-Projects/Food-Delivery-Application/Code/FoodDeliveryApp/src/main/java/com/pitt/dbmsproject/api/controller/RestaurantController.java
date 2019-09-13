package com.pitt.dbmsproject.api.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pitt.dbmsproject.api.model.RestaurantDetailsVO;
import com.pitt.dbmsproject.api.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	// GET Method
	@RequestMapping("/getAllRestaurants")
	public List<RestaurantDetailsVO> getAllRestaurants() {
		return restaurantService.getAllRestaurants();
	}
	
	// GET Method
	@RequestMapping("/getRestaurant/uname={uname}")
	public List<RestaurantDetailsVO> getRestaurantsByUserName(@PathVariable String uname) {
		return restaurantService.getRestaurantsByUserName(uname);
	}
	
	// GET Method
	@RequestMapping("/getRestaurantsSortedBySales/uname={uname}") 
	public List<RestaurantDetailsVO> getRestaurantsSortedBySales(@PathVariable String uname) {
		return restaurantService.getRestaurantsSortedBySales(uname);
	}
	
	// GET Method
	@RequestMapping("/city/getDistinctCityNames")
	public Set<String> getDistinctCityNames() {
		return restaurantService.getDistinctCityNames();
	}
	
	// GET Method
	@RequestMapping("/getRestaurantsByCityName/cityName={cityName}")
	public Set<RestaurantDetailsVO> getRestaurantsByCityNames(@PathVariable String cityName) {
		return restaurantService.getRestaurantsByCityNames(cityName);
	}
	
	// GET Method
	@RequestMapping("/getTopRatedRestaurantsByCityName/cityName={cityName}")
	public List<RestaurantDetailsVO> getTopRatedRestaurantsByCityName(@PathVariable String cityName) {
		return restaurantService.getTopRatedRestaurantsByCityName(cityName);
	}
}
