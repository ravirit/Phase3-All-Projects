package com.simplilearn.ems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Repeat;

import com.simplilearn.ems.entity.Employee;
import com.simplilearn.ems.service.IEmployeeService;

@SpringBootTest
class EmployeeServiceImplTest {

	@Autowired
	IEmployeeService service;
	
		
	static	Employee employee;
	
		@BeforeAll
		public static void   beforAll() {
			
			employee = new Employee(0, "smith walker", 45000);
		
			//service = new EmployeeServiceImpl();
			
			System.out.println("Once Before all test cases ");
			
		}
		
		@AfterAll
		public static void afterAll() {
			
			System.out.println("After all test cases");
			
		}
		
		@BeforeEach
		public void   beforeEach() {
			
			System.out.println("Before each test case");
			
		}
		
		@AfterEach
		public void afterEach() {
			
			System.out.println("After Each");
			
		}
	
	@Test
	@DisplayName("AddTest")
	@Repeat(value = 3)
	void testAddEmployee() {
		
				System.out.println("add test case");
		
		Employee addedEmployee	=	service.addEmployee(employee);
		
				assertTrue(addedEmployee.getName().length() > 8);
				
				assertNotNull(addedEmployee);
	}

	@Test
	@Disabled
	void testUpdateEmployee() {
		
	}

	@Test
	void testGetEmployeeById() {
		
			Employee emp =		service.getEmployeeById(2);
		
			assertEquals(30000, emp.getSalary());
		
			
			System.out.println("get test case");
		
	}

	@Test
	@Disabled
	void testDeleteById() {
		
	}

}
