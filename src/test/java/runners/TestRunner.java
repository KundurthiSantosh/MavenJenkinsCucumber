package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\santo\\eclipse-workspace\\Selenium.Maven.Cucumber\\src\\test\\java\\features", glue = "stepDefinitions")
public class TestRunner {

}