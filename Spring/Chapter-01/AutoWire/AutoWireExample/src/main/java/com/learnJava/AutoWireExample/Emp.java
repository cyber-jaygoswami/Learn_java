package com.learnJava.AutoWireExample;

public class Emp {
	
	private String name;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter method for address called");
	}
	
	
	
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor method for address called");

	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + "]";
	}
	
	
	

}
