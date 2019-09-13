package com.pitt.dbmsproject.api.model;

import java.util.List;

public class CuisineAndItemDetailsVO {
	
	private int restaurantId;
	private List<CuisineDetailsVO> cuisineDetailsList;
	
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public List<CuisineDetailsVO> getCuisineDetailsList() {
		return cuisineDetailsList;
	}
	public void setCuisineDetailsList(List<CuisineDetailsVO> cuisineDetailsList) {
		this.cuisineDetailsList = cuisineDetailsList;
	}

}
