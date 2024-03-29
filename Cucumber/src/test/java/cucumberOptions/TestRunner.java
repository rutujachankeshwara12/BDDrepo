package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/feature/login.feature",
		glue={"stepDefination"}, 
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" } ,
		tags = "@sanity",
		monochrome = true)
public class TestRunner {
	//public class TestRunner extends AbstractTestNGCucumberTests
}
