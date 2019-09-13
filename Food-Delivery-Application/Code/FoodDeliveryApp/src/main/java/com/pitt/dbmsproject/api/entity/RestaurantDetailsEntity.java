package com.pitt.dbmsproject.api.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "restaurant")
public class RestaurantDetailsEntity {

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
	@Column(name="rest_id")
	private int restaurantId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable = false)
	private UserDetailsEntity userDetailsEntity;
	@Column(name="name", nullable = false)
	private String name;
	@Column(name="city", nullable = false)
	private String city;
	@Column(name="zip_code", nullable = false)
	private int zipCode;
//	@OneToMany(mappedBy = "restaurantDetailsEntity", orphanRemoval = true, cascade = CascadeType.ALL)
//    private List<RestaurantCuisineDetailsEntity> restaurantCuisineDetailsEntities = 
//    	new ArrayList<RestaurantCuisineDetailsEntity>();
	
	public RestaurantDetailsEntity(int restaurantId) {
		super();
		this.restaurantId = restaurantId;
	}
	
	public RestaurantDetailsEntity() {
		super();
	}

	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public UserDetailsEntity getUserDetailsEntity() {
		return userDetailsEntity;
	}
	public void setUserDetailsEntity(UserDetailsEntity userDetailsEntity) {
		this.userDetailsEntity = userDetailsEntity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

//	public List<RestaurantCuisineDetailsEntity> getRestaurantCuisineDetailsEntities() {
//		return restaurantCuisineDetailsEntities;
//	}
//
//	public void setRestaurantCuisineDetailsEntities(List<RestaurantCuisineDetailsEntity> restaurantCuisineDetailsEntities) {
//		this.restaurantCuisineDetailsEntities = restaurantCuisineDetailsEntities;
//	}
	
}
