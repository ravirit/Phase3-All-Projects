package com.simplilearn.spring.repository;

import org.springframework.stereotype.Repository;

//@Repository  
public class EmployeeDAO { // repository or DAO class

	
	// jdbc or hibernate or jpa to talk DB
	
	public String  getDAO() {
		
		return "This is DAO method() called..";
		
	}
	
}
