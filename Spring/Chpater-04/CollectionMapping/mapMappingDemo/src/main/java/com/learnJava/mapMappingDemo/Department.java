package com.learnJava.mapMappingDemo;

import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int id;
	private String name;
	
	@OneToMany
	private Map<String,Employee> employees = new HashMap<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Map<String, Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(String role, Employee emp) {
		employees.put(role, emp);
	}

}
