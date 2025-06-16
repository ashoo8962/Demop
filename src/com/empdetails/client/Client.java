package com.empdetails.client;

import java.util.List;

import com.empdetails.exception.EmployeeIsNotPresentException;
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
	System.out.println("==========================");

	System.out.println("Getting by Id----");
	try {
		List <Employee> empi= empService.getById(3);
		System.out.println("Printing employees by their id");
		System.out.println(empi);
		for(Employee empById1:empi)
		{
			System.out.println(empById1);
		}
	} catch (EmployeeIsNotPresentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("==========================");
	System.out.println("Printing all roles of employees in company");
	//List<String> rolValues= empService.getAllRoles();
	//System.out.println(rolValues);
	empService.getAllRoles()
	.forEach(rol->System.out.println(rol.toLowerCase()));
	
	
	System.out.println("==========================");
	System.out.println("Printing all domains of employees in company");
	//List<String> domainValues= empService.getAllDomain();
	//System.out.println(domainValues);
	empService.getAllDomain()
	.forEach(rol->System.out.println(rol.toUpperCase()));
	
	System.out.println("==========================");
	System.out.println("Getting names and id's of employees in company");
	
	List<Employee> empIdName;
	try {
		empIdName = empService.getByRoleId("Kamala", 4);
		System.out.println(empIdName);


	} catch (EmployeeIsNotPresentException e) {
		// TODO Autofor(Employee empById1:joinYear)
//	{
//		System.out.println(empById1);
//	}-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("==========================");
	System.out.println("Getting List of employees joined in 2020 in company");
	
	List<Employee> joinYear=empService.getByYear(2020);
	//System.out.println(joinYear);
//	
	for(Employee yr:joinYear)
	{
		System.out.println(yr);
	}
	
	
	
}
}
