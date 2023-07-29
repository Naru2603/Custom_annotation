package com.basic.annotation;

import java.lang.annotation.Annotation;

public class TestCustomAnnotation {

	public static void main(String[] args) {
		
		Employee emp = new Employee(12, "Shravani");
		
		emp.getEmployeeDetails();
		
		Annotation companyAnnotation =  emp.getClass().getAnnotation(Company.class);
		
		Company company = 	(Company) companyAnnotation;
		
		System.out.println(company.name());
		System.out.println(company.city());


	}

}
