import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", // path to your feature files
        glue = "stepdefinitions", // path to your step definitions
        tags = "@cricbuzz", // specify the tags to run
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports/cucumber.json"})
public class TestNGCucumberRunner {
}
