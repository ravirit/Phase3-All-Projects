package com.simplilearn.ems.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

	@GetMapping("/getbill")
	public void getTotalBill() {

	
				
				throw new ArithmeticException();

		

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exceptionHandler() {

		return new ResponseEntity<String>("Some Exception occured ", HttpStatus.BAD_REQUEST);

	}

}
