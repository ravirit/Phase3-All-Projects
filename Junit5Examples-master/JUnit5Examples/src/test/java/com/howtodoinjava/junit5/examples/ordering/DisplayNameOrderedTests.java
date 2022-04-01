package com.howtodoinjava.junit5.examples.ordering;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class DisplayNameOrderedTests
{
	@DisplayName("zain")
	@Test
	void testE() {
		assertTrue(true);
	}

	@DisplayName("3")
	@Test
	void testA() {
		assertTrue(true);
	}

	@DisplayName("javeed")
	@Test
	void testD() {
		assertTrue(true);
	}

	@DisplayName("2")
	@Test
	void testC() {
		assertTrue(true);
	}

	@DisplayName("rahul")
	@Test
	void testB() {
		assertTrue(true);
	}
}
