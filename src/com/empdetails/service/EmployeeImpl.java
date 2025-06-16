package com.empdetails.service;

import java.util.List;
import java.util.stream.Collectors;

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

		//convert emp to stream and filter by id in parameter
		List<Employee> empById=emps.stream()
		.filter(emp1->emp1.getEmpid()==empId)
		.collect(Collectors.toList());
			if(empById.isEmpty())
			{
				throw new EmployeeIsNotPresentException("Employee is not present for given id");
			}
		
		return empById;	
		
	}

	@Override
	public List<String> getAllRoles() {
		List <Employee> emps=EmpoyeeUtil.showAllEmployee();
		List<String > roleValues=
		emps.stream()
		.map(emp->emp.getRole())
		.distinct()
		.collect(Collectors.toList());
		return roleValues ;
	}

	@Override
	public List<String> getAllDomain() {
		List <Employee> emps=EmpoyeeUtil.showAllEmployee();
		List<String > empDomains=
		emps.stream()
		.map(emp->emp.getDomain())
		.distinct()
		.collect(Collectors.toList());
		return empDomains ;
	
	}

	@Override
	public List<Employee> getByRoleId(String name, int id) throws EmployeeIsNotPresentException {
		List <Employee> emps=EmpoyeeUtil.showAllEmployee();
		List<Employee> empNameId=emps.stream()
		.filter(emp->emp.getName().contains(name))
		.filter(emp->emp.getEmpid()==id)
		.collect(Collectors.toList());
		if(emps.isEmpty())
		{
			throw new EmployeeIsNotPresentException("Employee is not present for given id");
		}
		
		return empNameId;
	}

}
