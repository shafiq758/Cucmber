package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature", glue={""},
monochrome=true, 
plugin= {"pretty","junit:target/JunitReport/report.xml","json:target/JsonReport/report.json","html:target/HtmlReports/report.html", "json:target/cucumber.json"},
tags="@tag1"
)


public class Testrunnerclass {

}
