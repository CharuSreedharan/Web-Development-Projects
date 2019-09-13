package com.pitt.dbmsproject.api.model;

import java.sql.Timestamp;

public class UserDetailsVO {
	
	private int userId;
	private String userName;
	private String password;
	private String fullName;
	private int memberType;
	private int userType;
	private String email;
	private String contactNumber;
    private String joinedOn;
	private AddressVO addressDetails;
	private int loginStatus;
	
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
	public int getMemberType() {
		return memberType;
	}
	public void setMemberType(int memberType) {
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
	public String getJoinedOn() {
		return joinedOn;
	}
	public void setJoinedOn(String joinedOn) {
		this.joinedOn = joinedOn;
	}
	public AddressVO getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(AddressVO addressDetails) {
		this.addressDetails = addressDetails;
	}
	public int getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}
	
}
