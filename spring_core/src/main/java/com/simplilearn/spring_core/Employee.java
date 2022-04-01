package com.simplilearn.spring_core;

public class Employee {  // POJO , BEAN , ENTITY
	
	
	private int eid;
	private String ename;
	private Address address;
	
	public Employee() {
		
		System.out.println("Employee object is created...");
	}
	
	public Employee(int eid, String ename) {
		super();
		
		System.out.println("param employe() is called..");
		this.eid = eid;
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
