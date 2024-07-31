package com.keerthana.demo.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table
public class Masters {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int masterID;
	private String name;
	private String specialist;
	private String availability;
	private String city;
	
	
	public Masters() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Masters(int masterID, String name, String specialist, String availability, String city) {
		super();
		this.masterID = masterID;
		this.name = name;
		this.specialist = specialist;
		this.availability = availability;
		this.city = city;
	}
	public int getMasterID() {
		return masterID;
	}
	public void setMasterID(int masterID) {
		this.masterID = masterID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	
}