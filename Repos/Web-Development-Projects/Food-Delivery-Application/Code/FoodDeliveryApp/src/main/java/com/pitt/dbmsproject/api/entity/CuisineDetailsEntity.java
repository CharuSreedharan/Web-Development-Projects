package com.pitt.dbmsproject.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "cuisine")
public class CuisineDetailsEntity {

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
	@Column(name="cuisine_id")
	private int cuisineId;
	@Column(name="name", unique=true, nullable = false)
	private String cuisineName;
	//@Transient
	//private int rowCount;
	//@OneToMany(mappedBy = "cuisineDetailsEntity", orphanRemoval = true, cascade = CascadeType.ALL)
    //private List<RestaurantCuisineDetailsEntity> restaurantCuisineDetailsEntities = 
    	//new ArrayList<RestaurantCuisineDetailsEntity>();

	public CuisineDetailsEntity() {
		super();
	}

	public CuisineDetailsEntity(int cuisineId) {
		super();
		this.cuisineId = cuisineId;
	}
	
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

//	public int getRowCount() {
//		return rowCount;
//	}
//
//	public void setRowCount(int rowCount) {
//		this.rowCount = rowCount;
//	}
	
	//public List<RestaurantCuisineDetailsEntity> getRestaurantCuisineDetailsEntities() {
		//return restaurantCuisineDetailsEntities;
	//}

	//public void setRestaurantCuisineDetailsEntities(List<RestaurantCuisineDetailsEntity> restaurantCuisineDetailsEntities) {
		//this.restaurantCuisineDetailsEntities = restaurantCuisineDetailsEntities;
	//}
}
