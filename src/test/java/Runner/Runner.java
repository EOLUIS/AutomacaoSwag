package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = "Steps", tags = "@Alll", plugin = { "pretty",
		"html:target/luisteste.html" }, monochrome = true, dryRun = true)

public class Runner {

}
