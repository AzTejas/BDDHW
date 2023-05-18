package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\tejas\\IdeaProjects\\BDDHW\\src\\test\\resources\\Features",
        glue = {"StepDefinitions"},
        format = {"pretty","html:htmlReport","json:json/cucumber.json","junit:junit/cucumber.xml"},
        dryRun = false
)
public class TestRunner {
}
