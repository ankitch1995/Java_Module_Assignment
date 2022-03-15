package com.cybage.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

@Component
public class User {

	@NotEmpty
	private String userName;
	@NotEmpty
	private  String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
}
