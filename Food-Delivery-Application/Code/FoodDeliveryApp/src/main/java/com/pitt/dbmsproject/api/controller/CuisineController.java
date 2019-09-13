 package com.pitt.dbmsproject.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pitt.dbmsproject.api.model.CuisineDetailsVO;
import com.pitt.dbmsproject.api.service.CuisineService;

@RestController
public class CuisineController {
	
	@Autowired
	private CuisineService cuisineService;
	
	// GET Method
	@RequestMapping("/restaurant/{restId}/cuisine/getCuisine")
	public List<CuisineDetailsVO> getCuisinesByRestaurantId(@PathVariable int restId) {
		return cuisineService.getCuisinesByRestaurantId(restId);
	}
	
	// GET Method
	@RequestMapping("/restaurant/{restId}/cuisine/getCuisinesAndItemsByRestID")
	public List<CuisineDetailsVO> getCuisinesAndItemsByRestID(@PathVariable int restId) {
		return cuisineService.getCuisinesAndItemsByRestID(restId);
	}
	
	// GET Method
	@RequestMapping("/restaurant/{restId}/cuisine/getTopCuisinesByRestID")
	public List<CuisineDetailsVO> getTopCuisinesByRestID(@PathVariable int restId) {
		return cuisineService.getTopCuisinesByRestID(restId);
	}
	
	// POST Method
	@RequestMapping(method=RequestMethod.POST, value="/restaurant/{restId}/cuisine/addCuisine")
	public void createCuisine(@PathVariable int restId, 
			@RequestBody CuisineDetailsVO cuisineDetailsVO) {
		cuisineService.createCuisine(restId, cuisineDetailsVO);
	}
	
	// PUT Method
	@RequestMapping(method=RequestMethod.PUT, value="/cuisine/updateCuisine/cuisineID={cuisineId}")
	public void updateCuisine(@PathVariable int cuisineId, 
			@RequestBody CuisineDetailsVO cuisineDetailsVO) {
		cuisineService.updateCuisine(cuisineId, cuisineDetailsVO);
	}

	// DELETE method
	@RequestMapping(method=RequestMethod.DELETE, value="/cuisine/deleteCuisine/cuisineID={cuisineId}")
	public void deleteCuisine(@PathVariable int cuisineId) {
		cuisineService.deleteCuisine(cuisineId);
	}
}
