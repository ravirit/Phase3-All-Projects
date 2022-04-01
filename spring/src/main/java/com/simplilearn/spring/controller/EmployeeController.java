package com.simplilearn.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.simplilearn.spring.service.EmployeeService;

@Controller
public class EmployeeController {

	
		@Autowired
		EmployeeService service;
		
		
		public String getController() {
			
			System.out.println(service);
			
				System.out.println(service.getService());
			
				return "This is Controller call..";
			
		}
		
	
	
}
