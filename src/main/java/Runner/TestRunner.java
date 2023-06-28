package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features ="D:/QA/CucumberWorkspace/BDD_Project_01/src/main/java/Features/homePage.feature", //location of feature file
		glue= {"StepDefinition"}, //step definition Package Name
		plugin = {"pretty","html:target/cucumber-reports"}, //test report 
		monochrome = true, //display the console output in a readable format
		dryRun= false //to check the mapping(scripting is fine without running the script) is proper between feature file and step definition file
		)
public class TestRunner {

	
}