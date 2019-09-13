package com.pitt.dbmsproject.api.entity;

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

@Entity
@Table(name = "subordr_new")
public class SuborderDetailsEntity {
	
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
	@Column(name="so_id")
	private int suborderId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable = false)
	private UserDetailsEntity userDetailsEntity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="rest_id", nullable = false)
	private RestaurantDetailsEntity restaurantDetailsEntity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cuisine_id", nullable = false)
	private CuisineDetailsEntity cuisineDetailsEntity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="item_id", nullable = false)
	private ItemDetailsEntity itemDetailsEntity;
	@Column(name="quantity", nullable = false)
	private int quantity;
	@Column(name="total_price", nullable = false)
	private double totalPrice;
	@Column(name="spice_level", nullable = false)
	private int spiceLevel;
	@Column(name="comment")
	private String comment;
	@Column(name="so_status", nullable = false)
	private int status;
	
	public SuborderDetailsEntity() {
		super();
	}
	
	public SuborderDetailsEntity(int suborderId) {
		super();
		this.suborderId = suborderId;
	}

	public int getSuborderId() {
		return suborderId;
	}
	public void setSuborderId(int suborderId) {
		this.suborderId = suborderId;
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
	public CuisineDetailsEntity getCuisineDetailsEntity() {
		return cuisineDetailsEntity;
	}
	public void setCuisineDetailsEntity(CuisineDetailsEntity cuisineDetailsEntity) {
		this.cuisineDetailsEntity = cuisineDetailsEntity;
	}
	public ItemDetailsEntity getItemDetailsEntity() {
		return itemDetailsEntity;
	}
	public void setItemDetailsEntity(ItemDetailsEntity itemDetailsEntity) {
		this.itemDetailsEntity = itemDetailsEntity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getSpiceLevel() {
		return spiceLevel;
	}
	public void setSpiceLevel(int spiceLevel) {
		this.spiceLevel = spiceLevel;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
