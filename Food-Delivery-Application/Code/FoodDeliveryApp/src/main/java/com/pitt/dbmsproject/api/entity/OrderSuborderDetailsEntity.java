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
@Table(name = "ordr_suborder", uniqueConstraints = { @UniqueConstraint( columnNames = 
{ "ordr_id", "so_id" } ) })
public class OrderSuborderDetailsEntity {

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
	@Column(name="ordr_suborder_id")
	private int orderSuborderId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ordr_id", nullable = false)
	private OrderDetailsEntity orderDetailsEntity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="so_id", nullable = false)
	private SuborderDetailsEntity suborderDetailsEntity;
	
	public int getOrderSuborderId() {
		return orderSuborderId;
	}
	public void setOrderSuborderId(int orderSuborderId) {
		this.orderSuborderId = orderSuborderId;
	}
	public OrderDetailsEntity getOrderDetailsEntity() {
		return orderDetailsEntity;
	}
	public void setOrderDetailsEntity(OrderDetailsEntity orderDetailsEntity) {
		this.orderDetailsEntity = orderDetailsEntity;
	}
	public SuborderDetailsEntity getSuborderDetailsEntity() {
		return suborderDetailsEntity;
	}
	public void setSuborderDetailsEntity(SuborderDetailsEntity suborderDetailsEntity) {
		this.suborderDetailsEntity = suborderDetailsEntity;
	}
	
}
