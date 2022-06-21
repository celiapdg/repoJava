package com.main;

public class Car {
	private String company;
	private int speed;
	
	// Constructor
	public Car(String company, int speed) {
		this.company = company;
		this.speed = speed;
	}
	
	// Getters and Setters
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void getSpeed() {
		System.out.println(this.company + " car's speed is " + this.speed + " Km/h");
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
