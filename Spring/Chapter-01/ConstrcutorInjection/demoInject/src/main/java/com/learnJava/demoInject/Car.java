package com.learnJava.demoInject;

public class Car implements Vehicle{
	public void drive() {
		System.out.println("You are driving Car :)");
	}
	
	String brand;

	public Car(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	
	

}
