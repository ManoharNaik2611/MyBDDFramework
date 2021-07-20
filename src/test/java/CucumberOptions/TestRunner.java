package CucumberOptions;

import org.junit.runner.RunWith;
//import io.cucumber.core.options.CucumberOptionsAnnotationParser.CucumberOptions;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.*;
//import io.cucumber.core.options.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features",
		glue="stepDefination",monochrome=true,
		dryRun=true, 
		tags= "@seleniumTests",
		plugin= {"pretty","html:target/cucumber2.html","json:target/cucumber1.json"})

public class TestRunner {

}
