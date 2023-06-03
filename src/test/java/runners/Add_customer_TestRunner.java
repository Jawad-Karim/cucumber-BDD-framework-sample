package runners;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./Features/add_customers.feature",
		glue = {"stepDefinitions/loginSteps", "Hooks/Hook"},
		plugin = {
				"pretty", 
				"html:target/html_report.html",
				"json:target/json_report.json",
				"junit:target/xml_report.xml"
				},
		dryRun = false,
		monochrome = true
		)
public class Add_customer_TestRunner extends AbstractTestNGCucumberTests {

}
