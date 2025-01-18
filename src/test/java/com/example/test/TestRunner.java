package com.example.test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // Path to feature files
		glue = "com.example.stepdefenitions", // Path to step definition classes
		tags = "@Smoke", // List of test cases to be executed
		plugin = { "pretty", "html:target/cucumber-reports.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }) // Type and Path of reports
public class TestRunner {

}
