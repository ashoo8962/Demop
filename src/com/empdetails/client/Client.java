package com.empdetails.client;

import java.util.List;

import com.empdetails.model.Employee;
import com.empdetails.service.EmployeeImpl;
import com.empdetails.service.IEmployee;

public class Client {
public static void main(String[] args) {
	
	
	IEmployee empService= new EmployeeImpl();
	List <Employee> emp= empService.getAllEmployees();
	System.out.println("List of employees");
	for(Employee emps: emp)
	{
		System.out.println(emps);
	}
}
}
