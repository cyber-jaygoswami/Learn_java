package com.learnJava.demoInject;

public class Bike implements Vehicle{
	public void drive() {
		System.out.println("You are driving Bike :)");
	}

	String brand;

	public Bike(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Bike [brand=" + brand + "]";
	}
	
	
	
	

}
