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
@Table(name = "review")
public class ReviewDetailsEntity {
	
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
	@Column(name="review_id")
	private int reviewId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable = false)
	private UserDetailsEntity userDetailsEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="rest_id", nullable = false)
	private RestaurantDetailsEntity restaurantDetailsEntity;
	
	@Column(name="stars", nullable = false)
	private int stars;
	
	@Column(name="description")
	private String description;

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
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

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
