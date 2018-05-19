package createleadsteps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import wdMethods.SeMethods;

public class Hooks extends SeMethods {
	
@Before
	public void before(Scenario sc) {
	System.out.println(sc.getName());
	startResult();
	startTestModule(sc.getName(), sc.getName());	
	test = startTestCase(sc.getName());
	test.assignCategory("smoke");
	test.assignAuthor("Sathya");
	startApp("chrome");	
	}

@After
public void after(Scenario sc) {
	System.out.println(sc.getName());
	endResult();
	closeAllBrowsers();
	
}

}
