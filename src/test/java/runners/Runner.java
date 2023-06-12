package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:src/test/resources/reports/cucumberReport.html"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@SC05",
        dryRun = false
)
public class Runner {


}
