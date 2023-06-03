package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./Features/sample.feature",
		glue = {"stepDefinitions/loginPageSteps", "Hooks/Hook"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		dryRun = false,
		monochrome = true
		
		)

public class Sample_feature_Test_runner extends AbstractTestNGCucumberTests {

}
