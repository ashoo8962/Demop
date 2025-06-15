package com.empdetails.model;

public class Employee {

	private String name;
	private int empid;
	private String role;
	private int joiningyear;
	private String domain;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getJoiningyear() {
		return joiningyear;
	}
	public void setJoiningyear(int joiningyear) {
		this.joiningyear = joiningyear;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", role=" + role + ", joiningyear=" + joiningyear
				+ ", domain=" + domain + "]";
	}
	public Employee(String name, int empid, String role, int joiningyear, String domain) {
		super();
		this.name = name;
		this.empid = empid;
		this.role = role;
		this.joiningyear = joiningyear;
		this.domain = domain;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
