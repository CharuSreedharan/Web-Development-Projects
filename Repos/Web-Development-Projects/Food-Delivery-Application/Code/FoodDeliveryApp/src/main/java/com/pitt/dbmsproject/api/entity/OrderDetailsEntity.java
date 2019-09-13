package com.pitt.dbmsproject.api.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.pitt.dbmsproject.api.model.AddressVO;

@Entity
@Table(name = "ordr")
public class OrderDetailsEntity {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(
		    strategy= GenerationType.AUTO,
		    generator="native"
	)
	@GenericGenerator(
	    name = "native",
	    strategy = "native"
	)
	@Column(name="ordr_id")
	private int orderId;
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn(name="user_id", nullable = false)
	private UserDetailsEntity userDetailsEntity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="rest_id", nullable = false)
	private RestaurantDetailsEntity restaurantDetailsEntity;
	@Column(name="total_price", nullable = false)
	private double totalPrice;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="address_id", nullable = false)
	private AddressEntity deliveryAddressDetails;
	@Column(name="estimated_delivery_time", nullable = false)
	private Timestamp estimatedDeliveryTime;
	@Column(name="delivery_flag", nullable = false)
	private int deliveryFlag;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public UserDetailsEntity getUserDetailsEntity() {
		return userDetailsEntity;
	}
	public void setUserDetailsEntity(UserDetailsEntity userDetailsEntity) {
		this.userDetailsEntity = userDetailsEntity;
	}
	public RestaurantDetailsEntity getRestaurantDetailsEntity() {
		return restaurantDetailsEntity;
	}
	public void setRestaurantDetailsEntity(RestaurantDetailsEntity restaurantDetailsEntity) {
		this.restaurantDetailsEntity = restaurantDetailsEntity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public AddressEntity getDeliveryAddressDetails() {
		return deliveryAddressDetails;
	}
	public void setDeliveryAddressDetails(AddressEntity deliveryAddressDetails) {
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
