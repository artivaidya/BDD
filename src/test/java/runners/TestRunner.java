package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "/Users/Ancha/eclipse-workspace/BDD_Framwork/src/test/resources/Features/homepage.feature" ,//path to your feature file
		glue= {"stepDefinitions"},//path to your stepdefinitions
		plugin= {"pretty" ,"html:target/cucumber-report.html"},//Report format(gg pretty and html
		monochrome= true// make console output more readable
		
		
		
		
		)

public class TestRunner {
	
	
	
	
	

}
