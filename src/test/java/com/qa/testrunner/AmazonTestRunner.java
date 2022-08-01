package com.qa.testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(		
		features="D:\\Selenium Training\\HyDigit - Batch 3 - FY'23\\IBM.Batch3.BDDFramework\\src\\test\\java\\com\\qa\\features\\AmazonFeatures.feature",
		glue="com.qa.stepdef",
		monochrome=true,
		tags= "@UITest",
		plugin = {"pretty", "json:target/cucumber.json"}
		)


public class AmazonTestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
