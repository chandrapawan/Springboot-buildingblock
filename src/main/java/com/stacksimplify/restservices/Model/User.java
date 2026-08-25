package com.stacksimplify.restservices.Model;

public class User {
	
	private String userName;
	private String lastName;
	private String city;
	
	public User() {
		
	}
	
	
	public User(String userName, String lastName, String city) {
		super();
		this.userName = userName;
		this.lastName = lastName;
		this.city = city;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", lastName=" + lastName + ", city=" + city + "]";
	}
	
	
	

}
