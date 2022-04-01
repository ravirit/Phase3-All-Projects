package com.simplilearn.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simplilearn.ems.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {

			
			public List<Employee>  findByName(String name);
			
			public List<Employee>  findBySalaryGreaterThan(double salary);  
			
			@Query("select  e from Employee e  where e.salary > ?1  order by name")
			public List<Employee>  findBySortedSalary(double salary);								//JPQL 
	
} 


//CrudRepository
//JpaRespository
