package com.empdetails.service;

import java.util.List;

import com.empdetails.exception.EmployeeIsNotPresentException;
import com.empdetails.model.Employee;

public interface IEmployee {

	List<Employee> getAllEmployees();
 List<Employee>	 getById(int empId) throws EmployeeIsNotPresentException;
List<String> getAllRoles();
List<String> getAllDomain();
List<Employee> getByRoleId(String name,int id) throws EmployeeIsNotPresentException;
	
};
