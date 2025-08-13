package com.learnJava.listSetMapInjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	public String name;
	public List<String> phones;
	public Set<String> address;
	public Map<String,String> courses;
	
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses + "]";
	}
	
	
	

}
