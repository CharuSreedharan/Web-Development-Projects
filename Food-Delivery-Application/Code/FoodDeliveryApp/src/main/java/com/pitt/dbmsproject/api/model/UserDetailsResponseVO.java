package com.pitt.dbmsproject.api.model;

public class UserDetailsResponseVO {
	
	private String userNameMessage;
	private String passwordMessage;
	private String userTypeMessage;
	
	public String getUserNameMessage() {
		return userNameMessage;
	}
	public void setUserNameMessage(String userNameMessage) {
		this.userNameMessage = userNameMessage;
	}
	
	public String getPasswordMessage() {
		return passwordMessage;
	}
	public void setPasswordMessage(String passwordMessage) {
		this.passwordMessage = passwordMessage;
	}
	public String getUserTypeMessage() {
		return userTypeMessage;
	}
	public void setUserTypeMessage(String userTypeMessage) {
		this.userTypeMessage = userTypeMessage;
	}
	
}
