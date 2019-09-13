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
@Table(name = "restaurant_item", uniqueConstraints = { @UniqueConstraint( columnNames = 
	{ "rest_id", "item_id" } ) })
public class RestaurantItemDetailsEntity {
	
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
	@Column(name="rest_item_id")
	private int restaurantItemId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="rest_id", nullable = false)
	private RestaurantDetailsEntity restaurantDetailsEntity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="item_id", nullable = false)
	private ItemDetailsEntity itemDetailsEntity;
	
	public int getRestaurantItemId() {
		return restaurantItemId;
	}
	public void setRestaurantItemId(int restaurantItemId) {
		this.restaurantItemId = restaurantItemId;
	}
	public RestaurantDetailsEntity getRestaurantDetailsEntity() {
		return restaurantDetailsEntity;
	}
	public void setRestaurantDetailsEntity(RestaurantDetailsEntity restaurantDetailsEntity) {
		this.restaurantDetailsEntity = restaurantDetailsEntity;
	}
	public ItemDetailsEntity getItemDetailsEntity() {
		return itemDetailsEntity;
	}
	public void setItemDetailsEntity(ItemDetailsEntity itemDetailsEntity) {
		this.itemDetailsEntity = itemDetailsEntity;
	}

}
