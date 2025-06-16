package com.empdetails.util;

import java.util.Arrays;
import java.util.List;

import com.empdetails.model.Employee;

public class EmpoyeeUtil {

	public static  List<Employee> showAllEmployee()
	{
		List<Employee> empnames=Arrays.asList(
				new Employee("Jaanu",3,"Full Stack Developer",2021,"Java"),
				new Employee("Raanu",7,"Tester",2020,"JUnit"),
				new Employee("Kamala",4,"Soft Developer",2000,"AWS"),
				new Employee("Radha",5,"Cloud Engineer",2004,"Azure")
				
					
				
				
				);
		return empnames;
		
	}
	
}
