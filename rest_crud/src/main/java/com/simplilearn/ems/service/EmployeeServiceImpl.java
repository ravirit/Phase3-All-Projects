package com.simplilearn.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.simplilearn.ems.entity.Employee;
import com.simplilearn.ems.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl  implements IEmployeeService{

		@Autowired
		EmployeeRepository repo;
	
	// interact with dao layer
		// if any server side validation required can be implemented
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return  repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public ResponseEntity<String> deleteById(int id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		 
		return new ResponseEntity<String>("Record deleted successfully",HttpStatus.OK);
		 
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Employee> getAllByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

	@Override
	public List<Employee> getBySalaryGT(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getBySortedSalary(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySortedSalary(salary);
	}
	
	
	/*
	 * public static boolean isValidUser() {
	 * 
	 * return true; }
	 */

}
