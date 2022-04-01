package com.simplilearn.ems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.runner.RunWith;


@DisplayName("JUnit 5 Dependency Injection Example")
//@RunWith(JUnitPlatform.class)
public class DependencyInjection {

        DependencyInjection(TestInfo testInfo) {
        assertEquals("JUnit 5 Dependency Injection Example", testInfo.getDisplayName());
    }

    @BeforeEach
    void init(TestInfo testInfo) {
        String displayName = testInfo.getDisplayName();
        assertTrue(displayName.equals("TEST 1") || displayName.equals("test2()"));
    }

    @Test
    @DisplayName("TEST 1")
    @Tag("my-tag")
    @Tag("javeed")
    @Tag("dev")
    void test1(TestInfo testInfo) {
        assertEquals("TEST 1", testInfo.getDisplayName());
        assertTrue(testInfo.getTags().contains("my-tag"));
        
        System.out.println(testInfo);
    }

    @Test
    void test2() {
    }

}
