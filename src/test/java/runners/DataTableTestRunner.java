package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "featureFiles/Data_Table.feature",
		glue = "stepsDefinitions"
		)

public class DataTableTestRunner extends AbstractTestNGCucumberTests{

}
