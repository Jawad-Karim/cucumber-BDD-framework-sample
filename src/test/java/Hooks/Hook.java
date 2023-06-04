package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hook {	

	@BeforeStep
	public void beforeStep() {		
		System.out.println("this will execute before every step");
		// take screenshot
	}
	@AfterStep
	public void afterStep() {		
		System.out.println("this will execute after every step");
		// assertions
	}
	@Before
	public void beforeScenario() {		
		System.out.println("this will execute before every scenario");
		//start browser
	}
	@After
	public void afterScenario() {		
		System.out.println("this will execute after every scenario");
		//close browser
	}
}
