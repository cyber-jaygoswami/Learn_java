package com.learnJava.setterInjection;

public class Bike implements Vehicle{
	public void drive() {
		System.out.println("You are driving bike :)");
	}
	
	String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Bike [brand=" + brand + "]";
	}
	
	

}
