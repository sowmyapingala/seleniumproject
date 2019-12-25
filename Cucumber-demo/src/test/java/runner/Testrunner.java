package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.junit.Cucumber;	
//import io.cucumber.junit.CucumberOptions;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java", tags= {"@Requests"}
,glue= {"seleniumgluecode"},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
monochrome = true
)

public class Testrunner {
	@AfterClass
	 public static void writeExtentReport() {
	        Reporter.loadXMLConfig(new File("config.xml"));
	    
	    }
	

		
	
}
