package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@AllTests",
        glue = "Steps",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:build/reports/feature.html"},
        features = {"src/main/resources/features"}
)
class CucumberRunner {


}
