package appHooks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.Launch_Browser;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
WebDriver driver =Launch_Browser.launch_browser();
	
	
	  @After 
	  public void tearDown(Scenario scenario) {
		  if(scenario.isFailed()) {
	 // take screenschot 
		  String screenshotName =scenario.getName().replaceAll("","_"); 
	  byte[] sourcepath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	  scenario.attach(sourcepath,"image/png", screenshotName);
	  
	  }
	 
    	
	/*
	 * Logger logger = LogManager.getLogger();
	 * 
	 * @After public void takeScreenshotOnFailure(Scenario scenario) {
	 * 
	 * logger.info("<takeScreenshotOnFailure>: inside"); if (scenario.isFailed()) {
	 * 
	 * logger.info("<takeScreenshotOnFailure>: inside scenario.isFailed()");
	 * TakesScreenshot ts = (TakesScreenshot) driver;
	 * 
	 * byte[] src = ts.getScreenshotAs(OutputType.BYTES); scenario.attach(src,
	 * "image/png", "screenshot"); }
	 * 
	 * }
	 */

/*@After
public void takeScreenShotOnFailedScenario(Scenario scenario) {

	System.out.println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails");
	if ((scenario.isFailed())) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
	
}*/
}
}
