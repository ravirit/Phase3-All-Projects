package com.simplilearn.ems;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

@DisplayName("JUnit 5 Dynamic Tests Example")
//@RunWith(JUnitPlatform.class)
public class DynamicTests {

        @TestFactory
    Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
            dynamicTest("simple dynamic test", () -> assertTrue(true)),
            dynamicTest("My Executable Class", new MyExecutable()),
            dynamicTest("Exception Executable", () -> {
            	try{throw new Exception("Exception Example");}
            	catch(Exception e) {System.out.println(e);}
            }),
            dynamicTest("simple dynamic test-2", () -> assertTrue(true))
        );
    }



		@TestFactory
		Collection<DynamicTest>		myTestList(){
					
					return Arrays.asList(
							
							
								dynamicTest("Test1", ()-> assertEquals(6, "javeed".length())) ,
								dynamicTest("Test2",()->assertNotNull(new String("hello"))) ,
								dynamicTest("Test3",()->{System.out.println("this is test3");  
																assertTrue(true);
														})
							
							
							);
					
					
				}

class MyExecutable implements Executable {

        @Override
        public void execute() throws Throwable {
                System.out.println("Hello World!");
        }

}

}
