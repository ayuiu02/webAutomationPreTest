package stepDetails;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", 
		glue= {"stepDetails"},
		tags="@allLoginFeature",
		monochrome = true,
		plugin = {"pretty","html:target/loginFeatureReports.html"}
		)
public class loginFeatureRunner {
}
