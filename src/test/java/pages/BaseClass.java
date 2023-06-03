package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	
	public static WebDriver driver;
	
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	
	@BeforeSuite
	public void setExtentReport() {
		
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("reports/Spark.html");
		extent.attachReporter(spark);
		
		/*  test = extent.createTest("test name").assignAuthor("jawad karim")
		    .assignCategory("smoke test").assignDevice("chrome");  */
		
	}
	
	@AfterTest
	public void afterTest() {
		
		extent.flush();
		
	}
	

}
