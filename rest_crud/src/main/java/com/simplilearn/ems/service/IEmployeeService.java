package com.simplilearn.ems.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.simplilearn.ems.entity.Employee;

public interface IEmployeeService {
	
	
	public Employee   addEmployee(Employee employee);  // insert
	
	public Employee   updateEmployee(Employee employee);  // update
	
	
	public Employee   getEmployeeById(int id);  // select by id
	
	public  ResponseEntity<String>  deleteById(int id); // delete by id
	
	
	public  List<Employee>  getAllEmployees();
	
	public  List<Employee>  getAllByName(String name);
	
	
	public  List<Employee>  getBySalaryGT(double salary);
	
	public  List<Employee>  getBySortedSalary(double salary);
	
}
