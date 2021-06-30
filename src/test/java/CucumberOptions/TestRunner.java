package CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.core.options.CucumberOptionsAnnotationParser.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.*;
import io.cucumber.core.options.*;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features/"},glue="stepDefinantion")

public class TestRunner {

}
