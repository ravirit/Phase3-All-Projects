package com.howtodoinjava.junit5.examples.suites;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({"com.howtodoinjava.junit5.examples.packageB",
				"com.howtodoinjava.junit5.examples.packageA",
				"com.howtodoinjava.junit5.examples.packageC"

				})
@Suite
@SuiteDisplayName("A demo Test Suite")
@IncludeTags(value = {"development","production"})
//@ExcludeTags(value = {"development","production"})
public class JUnit5TestSuiteExample {

}
