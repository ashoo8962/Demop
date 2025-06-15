package com.empdetails.service;

import java.util.List;

import com.empdetails.exception.EmployeeIsNotPresentException;
import com.empdetails.model.Employee;
import com.empdetails.util.EmpoyeeUtil;

public class EmployeeImpl implements IEmployee{

	@Override
	public List<Employee> getAllEmployees() {
		List <Employee> emps=EmpoyeeUtil.showAllEmployee();
		return emps;
	}

	@Override
	public List<Employee> getById(int empId) throws EmployeeIsNotPresentException {
		List <Employee> emps=EmpoyeeUtil.showAllEmployee();

		//
		
		
		return null;	
		
	}

	@Override
	public List<String> getAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByRoleId(String name, int id) throws EmployeeIsNotPresentException {
		// TODO Auto-generated method stub
		return null;
	}

}
