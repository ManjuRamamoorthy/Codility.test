package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pageobjects.Setup;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

@RunWith(Cucumber.class)				
@CucumberOptions(
		features="src/test/java/features/test.feature",
		glue={"stepdefinitions"}, strict=true, monochrome=true)	
public class TestRunner {

	@BeforeClass
	public static void setupBeforeClass() {
		Setup.initiateChromeDriver();
	}
	
	@Test
	public static void test() {
	}
	@AfterClass
	public static void tearDownAferClass() {
		Setup.quitChromeDriver();
	}
}
