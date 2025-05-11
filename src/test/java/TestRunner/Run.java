package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features =  "Features\\TotalElement.feature" ,
    	glue =    "StepDefnition" ,
		monochrome = true ,
		dryRun =   false,
	    tags =  "@Sanity"
	    
	//	plugin =  {"pretty","html:target/cucumber-reports.html"} 
	    
		)
public class Run extends AbstractTestNGCucumberTests {
	

	}


