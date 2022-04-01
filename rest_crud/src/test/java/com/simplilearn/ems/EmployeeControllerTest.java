package com.simplilearn.ems;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.ems.entity.Employee;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Log4j2
@SpringBootTest
class EmployeeControllerTest {
	
			
	Logger  log = LoggerFactory.getLogger(EmployeeControllerTest.class);

	
	
	@Autowired	
	RestTemplate restTemplate;
	

		
	

	@ParameterizedTest
	@ValueSource(ints = {12,14,16,20})
	@EnabledOnOs({OS.WINDOWS, OS.LINUX})
	void testGetEmployeeById(int id) {
		
	
			//int id = 2;
		
	ResponseEntity<Employee> response =	restTemplate.getForEntity("http://localhost:8080/api/v1/employees/get/"+id, Employee.class);
		
			Employee emp =	response.getBody();
			
				log.info("get employee by id "+id);
				
				log.debug("Employee "+emp);
			
		assertNotNull(emp);
		
	}

	@Test
	@EnabledOnJre(value = { JRE.JAVA_8 })
	void testGetAll() {
		
	}

	@Test
	void testGetBySalaryGT() {
		
	}

	
	@RepeatedTest(value = 4)
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void runOnWindows() {
            System.out.println("This runs on Windows");
    }

    @Test
    @EnabledOnOs({OS.LINUX})
    public void runOnLinux() {
            System.out.println("This runs on Linux");
    }

    
	/*
	 * @Test
	 * 
	 * @DisabledIf("Math.random() < 0.314159") void mightNotBeExecuted() {
	 * System.out.println("This may or not execute "); }
	 */
	
	
}
