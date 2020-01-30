package TestingSudameris.TestingSudameris;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/Destination"},
		features="src/test/resources/features",
		glue= {"stepDefinition"}, strict = true)
public class RunCucumberTest {
}
