package com.basic.annotation;

@Company
public class Employee {

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee Id: " + id);
		System.out.println("Employee Name: " + name);
	}
}
