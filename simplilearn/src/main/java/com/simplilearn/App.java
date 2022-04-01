package com.simplilearn;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.simplilearn.bean.Person;
import com.simplilearn.configuration.ApplicationConfig;
import com.simplilearn.services.PersonService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        PersonService personService = (PersonService) context.getBean("personService");
 
        Person yashwant = new Person(4, "RAvi", "Chavan", 32);
        Person mahesh = new Person(5, "Madhu", "Patil", 25);
        Person vishal = new Person(6, "rahul", "Naik", 40);
 
        personService.addPerson(yashwant);
        personService.addPerson(mahesh);
        personService.addPerson(vishal);
 
        System.out.println("Find All");
        List < Person > persons = personService.findAll();
        for (Person person: persons) {
            System.out.println(person);
        }
 
        System.out.println("Delete person Id = 3");
        int deleteMe = 3;
        personService.deletePerson(deleteMe);
 
        yashwant.setFirstName("Yashwant - Updated");
        yashwant.setLastName("Chavan - Updated");
        yashwant.setAge(40);
 
        System.out.println("Update person Id = 1");
        int updateMe = 1;
        personService.editPerson(yashwant, updateMe);
 
        System.out.println("Find person Id = 2");
        Person person = personService.find(2);
        System.out.println(person);
 
        System.out.println("Find All Again");
        persons = personService.findAll();
        for (Person p: persons) {
            System.out.println(p);
        }
 
        context.close();
    }
    
}
