package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		features="C:\\Dev\\Repos\\NoCommers_Cucumber\\Features",
		glue="stepDefinitations",
		dryRun= true,
		monochrome = true,
		plugin= {"pretty", "html: test-output"}
		)

public class TestRun {

}
