package com.simplilearn.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.ems.entity.Employee;
import com.simplilearn.ems.exception.EmployeeNotFoundExp;
import com.simplilearn.ems.service.IEmployeeService;

import io.swagger.annotations.ResponseHeader;

@RestController
@RequestMapping("/api/v1/employees/")
public class EmployeeController {
	
		@Autowired
		IEmployeeService service;
	
		@RequestMapping(value = "/add",method = RequestMethod.POST)
		public  Employee  addEmployee(@RequestBody Employee employee) {
			
			return 	service.addEmployee(employee);
			
			
		}
		
		
		@GetMapping("/get/{id}")
		public  Employee getEmployeeById(@PathVariable int id) throws EmployeeNotFoundExp {
			
			
				Employee emp = service.getEmployeeById(id);
				
				if(emp != null) {
					
					return emp;
					
				}
				
				else {
					
					throw  new  EmployeeNotFoundExp();
					
				}
			
		}
	
		@PutMapping("/update")
		public  Employee  updateEmployee(@RequestBody Employee employee) {
			
			return service.updateEmployee(employee);
			
		}
		
		
		@DeleteMapping("/delete/{id}")
		public  ResponseEntity<String> removeById(@PathVariable int id){
			
				return  service.deleteById(id);
			
		}
		
		
		@GetMapping("/getall")
		public  List<Employee>  getAll(){
			
			return service.getAllEmployees();
		}
		
		
		@GetMapping("/getbyname/{name}")
		public List<Employee>  getAllByName(@PathVariable String name){
			
				return  service.getAllByName(name);
			
		}
		
		
		@GetMapping("/getbysalary/{salary}")
		public List<Employee>  getBySalaryGT(@PathVariable double salary){
			
			return service.getBySalaryGT(salary);
			
		}
		
		
		@GetMapping("/getsortedsalary/{salary}")
		public List<Employee>  getBySortedSalary(@PathVariable double salary){
			
			return service.getBySortedSalary(salary);
			
		}
		
		
	/*
	 * @ExceptionHandler(EmployeeNotFoundExp.class) //@ResponseStatus(reason =
	 * "Sorry Employee for given ID Not found") public ResponseEntity<String>
	 * handleExp(){ // local handler
	 * 
	 * 
	 * return new
	 * ResponseEntity<String>("Sorry Employee Not found",HttpStatus.NOT_FOUND);
	 * 
	 * }
	 */
		
		
		
	

}
