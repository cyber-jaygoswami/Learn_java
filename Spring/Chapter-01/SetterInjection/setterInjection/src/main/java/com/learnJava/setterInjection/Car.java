package com.learnJava.setterInjection;

public class Car implements Vehicle{
	public void drive() {
		System.out.println("You are driving car :)");
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
		return "Car [brand=" + brand + "]";
	}
	
	
	

}
