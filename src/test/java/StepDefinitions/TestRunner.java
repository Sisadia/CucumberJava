package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//RunnerClass syntax
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features",glue={"StepDefinitions"},monochrome = true,
        plugin = {"pretty","html:target/cucumber/HtmlReport/index.html","pretty","json:target/cucumber/JSONReport/index.json",
                "pretty","junit:target/cucumber/JUnitReport/index.xml"},tags = "@smoketest"
)
public class TestRunner {
}
