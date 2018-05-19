package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/java/features/CreateLead.feature"},glue="createleadsteps",
tags= {"@regression"},
monochrome=true)

public class RunCreateLead {

}
