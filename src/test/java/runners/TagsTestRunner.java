package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TagsTestRunner {

	@CucumberOptions(
			features = "featureFiles/Tags_On_Features_&_Scenarios.feature", 
			glue = "stepsDefinitions", 
			tags = "@SmokeTest"
			)

	public class DataTableTestRunner extends AbstractTestNGCucumberTests {

	}
	/*
	// Execute all tests tagged as @SmokeTests 
	: tags = "@SmokeTest"
		 
	// Execute all tests tagged as @End2End 
	: tags = "@End2End"
		 
	// Execute all tests of a Feature tagged as @SignUp_Feature 
	: tags = "@SignUp_Feature"
		 
	// Execute all tests tagged as @SmokeTest OR @RegressionTest 
	// Note: OR means scenarios that are tagged either as @SmokeTest OR @RegressionTest.
	: tags = "@SmokeTest, @RegressionTest"
		 
	// Execute all tests tagged as both @SmokeTest AND @RegressionTest 
	: tags = "@SmokeTest", "@RegressionTest"

	// Execute all tests tagged as @SignUp_Feature but skip scenarios tagged as @SmokeTest 
	: tags = "@SignUp_Feature", "~@SmokeTest" (tilde symbol ~)

	// Execute all tests which are not tagged as @Smoke, @Regression 
	: tags = "~@Smoke", "~@Regression"

	*/

}
