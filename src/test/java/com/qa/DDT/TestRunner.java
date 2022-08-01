package com.qa.DDT;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="D:\\Selenium Training\\HyDigit - Batch 3 - FY'23\\IBM.Batch3.BDDFramework\\src\\test\\java\\com\\qa\\features\\AmazonDDT.feature",
		glue="com.qa.DDT",
		monochrome=true,		
		//tags= "@UITest",
		plugin = {"pretty", "json:target/cucumber.json"},		
		publish = true
		)


public class TestRunner {

}
