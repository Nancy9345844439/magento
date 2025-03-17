package org.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.steps",
				monochrome = true, dryRun = false,
				plugin = {"html:target\\HtmlReports"})
public class TestRunner {

}

