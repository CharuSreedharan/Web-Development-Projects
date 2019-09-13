package com.pitt.dbmsproject.api.model;

import java.util.List;

public class CuisineDetailsVO {
	
	private int cuisineId;
	private String cuisineName;
	private List<ItemDetailsVO> itemDetailsList;
	
	public int getCuisineId() {
		return cuisineId;
	}
	public void setCuisineId(int cuisineId) {
		this.cuisineId = cuisineId;
	}
	public String getCuisineName() {
		return cuisineName;
	}
	public void setCuisineName(String cuisineName) {
		this.cuisineName = cuisineName;
	}
	public List<ItemDetailsVO> getItemDetailsList() {
		return itemDetailsList;
	}
	public void setItemDetailsList(List<ItemDetailsVO> itemDetailsList) {
		this.itemDetailsList = itemDetailsList;
	}
	
}
