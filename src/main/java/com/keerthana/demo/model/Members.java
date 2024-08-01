package com.keerthana.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Members {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userID;
	private String username;
	private String city;
	private String email;
	private int age;
	
	@ManyToOne
	private Masters masters;

	public Members() {
		super();
		
	}

	public Members(int userID, String username, String city, String email,
			int age, Masters masters) {
		super();
		this.userID = userID;
		this.username = username;
		this.city = city;
		this.email = email;
		this.age = age;
		this.masters = masters;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Masters getMasters() {
		return masters;
	}

	public void setMasters(Masters masters) {
		this.masters = masters;
	}

	
	
	
	
	
}
