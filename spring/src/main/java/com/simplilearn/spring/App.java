package com.simplilearn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.simplilearn.spring.controller.EmployeeController;
import com.simplilearn.spring.entity.Employee;
import com.simplilearn.spring.repository.EmployeeDAO;

/**
 * Hello world!
 *
 */
@ComponentScan("com.simplilearn.spring.*")

@Configuration
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
     ApplicationContext context =new AnnotationConfigApplicationContext(App.class);
        
		
		  Employee employee = context.getBean(Employee.class);
		  
		  System.out.println(employee);
		  
		  Employee employee2 =(Employee) context.getBean("emp");
		  
		  System.out.println(employee2);
		 
     
     
     EmployeeController  controller =		context.getBean(EmployeeController.class);
     		
     		System.out.println(controller.getController());
     		
     		
     		System.out.println(context.getBean("dao1"));
     		
    }
    
    
    @Bean("dao1")
    public  EmployeeDAO   getDaoObject() {
    	System.out.println("Bean Annotation getting DAO object");
    	
    	return new EmployeeDAO();
    	
    }
    
    
    
}
