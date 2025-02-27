package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks_Sample {
	
	// note: import cucumber.api.java.After; & import cucumber.api.java.Before;
	
	@Before
    public void beforeScenario(){
		//startBrowser();
        System.out.println("This will run before every Scenario");
    }	
	
	@After
    public void afterScenario(){
		//takeScreenshot();
	    //closeBrowser();
        System.out.println("This will run after every Scenario");
    }
	
	@BeforeStep
	public void beforeStep() {
	    //takeScreenshot();
		System.out.println("This will run before every Step");
	}
	
	@AfterStep
	public void afterStep() {
	    //takeScreenshot();
		System.out.println("This will run after every Step");
	}
	
	// hooks with tag **************************************************
	@Before("@Smoke")
    public void beforeSmokeScenatio(){
        System.out.println("This will run only before every Smoke Scenarios");
    }

	@After("@Smoke")
    public void afterSmokeScenario(){
        System.out.println("This will run only after every Smoke Scenarios");
	}
	
	@After("@SignUp_feature and not @Smoke")
	public void doSomethingAfter(Scenario scenario){
		//Scenario as parameter
		System.out.println("this will run after all tests of the feature but skip Smoke tests");
	}
	
	// hooks with order *****(order runs- before: 1, 2, 3.  after: 3, 2, 1 ******
	@Before(order=1)
    public void beforeScenario_1(){
        System.out.println("order 1 will run before the every Scenario ");
    }	
	
	@Before(order=2)
    public void beforeScenario_2(){
        System.out.println("after order 1 order 2 will run before the every Scenario ");
    }	
	
	@After(order=2)
    public void afterScenario_2(){
        System.out.println("order 2 will run after the every Scenario");
    }	
	
	@After(order=1)
    public void afterScenario_1(){
        System.out.println("after order 2 order 1  will run after the every Scenario");
    }	
	
	

}
