package testrunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features= {".//Features/"},
                glue="stepDefinitions",
                dryRun = false,
                plugin= {"pretty","html:test-output"},
                monochrome = true

        )
public class runner {

}
