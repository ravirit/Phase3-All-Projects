package com.simplilearn.ems.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.simplilearn.ems.exception.EmployeeNotFoundExp;

@ControllerAdvice
public class GlobalExceptionController {
	
	
	@ExceptionHandler(Exception.class)
	//@ResponseStatus(reason = "Sorry Employee for given ID Not found")
	public   ResponseEntity<String>  handleExp(){  // local handler

		
		return new ResponseEntity<String>("Sorry Some Exception occur at application level",HttpStatus.NOT_FOUND);
		
	}
	
	
	



	
	
	

}
