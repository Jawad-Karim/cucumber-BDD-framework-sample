package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./Features/login_page.feature",
		glue = {"stepDefinitions/loginPageSteps", "Hooks/Hook"},
		plugin = {
				"pretty", 
				"html:target/html_report.html",
				"json:target/json_report.json",
				"junit:target/xml_report.xml"
				},
		dryRun = false,
		monochrome = true
		)

public class LoginPageTestRunnerTestng extends AbstractTestNGCucumberTests {

}
