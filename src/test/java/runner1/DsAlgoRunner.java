package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:taget/Html.html",
		"json:taget/DS.json",
		"junit:taget/DSAlgo.xml",
		"rerun:taget/rerun.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome=true,
dryRun=false,
features={"src/test/resources/FeatureFiles"},
glue={"stepDefinition","appHooks"})


public class DsAlgoRunner extends AbstractTestNGCucumberTests
{
	
	

}
