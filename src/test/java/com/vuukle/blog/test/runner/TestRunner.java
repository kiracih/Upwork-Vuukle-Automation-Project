package com.vuukle.blog.test.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.vuukle.blog.framework.driver.Driver;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.DriverManagerType;

@CucumberOptions(features = "src/test/resources/features", glue = { "com.vuukle.blog.test.stepDefinitions" }, tags = {
		"@AcceptanceTest" })
public class TestRunner extends AbstractTestNGCucumberTests {

	@Parameters({ "driverType" })
	@BeforeClass
	public void initializeTest(DriverManagerType driverType) {

		Driver.initiliaze(driverType);

	}

	@AfterClass
	public void cleanUp() {

		if (Driver.instance != null) {
			Driver.close();
		}
	}
}
