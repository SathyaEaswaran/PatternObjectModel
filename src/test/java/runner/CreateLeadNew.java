package runner;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)

	@CucumberOptions(features= {"src/test/java/features/POMLogin.feature"},glue= {"pages","createleadsteps"},

	monochrome=true)

	public class CreateLeadNew {

	}


