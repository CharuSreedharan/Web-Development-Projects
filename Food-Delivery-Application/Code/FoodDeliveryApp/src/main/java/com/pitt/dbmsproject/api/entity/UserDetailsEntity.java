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

import java.sql.Timestamp;

@Entity
@Table(name = "user_login")
public class UserDetailsEntity {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(
		    strategy= GenerationType.AUTO,
		    generator="native"
		)
		@GenericGenerator(
		    name = "native",
		    strategy = "native"
		)
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name", unique=true, nullable = false)
	private String userName;
	@Column(name="password", nullable = false)
	private String password;
	@Column(name="full_name", nullable = false)
	private String fullName;
	@Column(name="member_type")
	private Integer memberType;
	@Column(name="user_type", nullable = false)
	private int userType;
	@Column(name="email", unique=true, nullable = false)
	private String email;
	@Column(name="contact_number", unique=true, nullable = false)
	private String contactNumber;
	@Column(name="joined_on", nullable = false)
    private Timestamp joinedOn;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="address_id", nullable = false)
	private AddressEntity addressEntity;
	@Column(name="login_status", nullable = false)
	private int loginStatus;
	
	public UserDetailsEntity() {
		super();
	}
	
	public UserDetailsEntity(int userId) {
		super();
		this.userId = userId;
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

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Integer getMemberType() {
		return memberType;
	}
	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Timestamp getJoinedOn() {
		return joinedOn;
	}
	public void setJoinedOn(Timestamp joinedOn) {
		this.joinedOn = joinedOn;
	}
	public AddressEntity getAddressEntity() {
		return addressEntity;
	}
	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}
	public int getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}
	
}
