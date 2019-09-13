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
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "restaurant_cuisine", uniqueConstraints = { @UniqueConstraint( columnNames = 
	{ "rest_id", "cuisine_id" } ) })
public class RestaurantCuisineDetailsEntity {
	
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
	@Column(name="rest_cuisine_id")
	private int restaurantCuisineId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="rest_id", nullable = false)
	private RestaurantDetailsEntity restaurantDetailsEntity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cuisine_id", nullable = false)
	private CuisineDetailsEntity cuisineDetailsEntity;
	
	public int getRestaurantCuisineId() {
		return restaurantCuisineId;
	}
	public void setRestaurantCuisineId(int restaurantCuisineId) {
		this.restaurantCuisineId = restaurantCuisineId;
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

}
