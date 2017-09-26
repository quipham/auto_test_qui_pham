package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features/sample.feature",
        plugin = {"json:target/sample.json", "pretty"},
        glue = {"stepdefination"})
public class SampleCucumberRunner extends AbstractTestNGCucumberTests {
}
