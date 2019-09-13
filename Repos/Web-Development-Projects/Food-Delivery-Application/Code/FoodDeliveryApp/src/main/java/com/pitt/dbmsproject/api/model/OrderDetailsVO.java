package com.pitt.dbmsproject.api.model;

import java.sql.Timestamp;
import java.util.List;

public class OrderDetailsVO {
	
	private int orderId;
	private List<SuborderDetailsVO> suborderDetailsVO;
	private int userId;
	private String userName;
	private int restaurantId;
	private double totalPrice;
	private AddressVO deliveryAddressDetails;
	private Timestamp estimatedDeliveryTime;
	private int deliveryFlag;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<SuborderDetailsVO> getSuborderDetailsVO() {
		return suborderDetailsVO;
	}
	public void setSuborderDetailsVO(List<SuborderDetailsVO> suborderDetailsVO) {
		this.suborderDetailsVO = suborderDetailsVO;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public AddressVO getDeliveryAddressDetails() {
		return deliveryAddressDetails;
	}
	public void setDeliveryAddressDetails(AddressVO deliveryAddressDetails) {
		this.deliveryAddressDetails = deliveryAddressDetails;
	}
	public Timestamp getEstimatedDeliveryTime() {
		return estimatedDeliveryTime;
	}
	public void setEstimatedDeliveryTime(Timestamp estimatedDeliveryTime) {
		this.estimatedDeliveryTime = estimatedDeliveryTime;
	}
	public int getDeliveryFlag() {
		return deliveryFlag;
	}
	public void setDeliveryFlag(int deliveryFlag) {
		this.deliveryFlag = deliveryFlag;
	}

}