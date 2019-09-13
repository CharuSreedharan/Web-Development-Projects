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
@Table(name = "item")
public class ItemDetailsEntity {
	
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
	@Column(name="item_id")
	private int itemId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cuisine_id", nullable = false)
	private CuisineDetailsEntity cuisineDetailsEntity;
	@Column(name="item_name", unique=true, nullable = false)
	private String itemName;
	@Column(name="description")
	private String description;
	@Column(name="price", nullable = false)
	private double price;
	
	public ItemDetailsEntity() {
		super();
	}
	
	public ItemDetailsEntity(int itemId) {
		super();
		this.itemId = itemId;
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public CuisineDetailsEntity getCuisineDetailsEntity() {
		return cuisineDetailsEntity;
	}
	public void setCuisineDetailsEntity(CuisineDetailsEntity cuisineDetailsEntity) {
		this.cuisineDetailsEntity = cuisineDetailsEntity;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
