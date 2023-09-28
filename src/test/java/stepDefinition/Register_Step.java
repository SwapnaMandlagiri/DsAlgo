
package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import com.pages.Register_Page;
import com.pages.SignIn_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_Step {

	WebDriver driver = Launch_Browser.launch_browser();
	Register_Page r=new Register_Page(driver);
	Logger logger = LogManager.getLogger();
	/*
	 * @Given("User clicks on register link for invalid login") public void
	 * user_clicks_on_register_link_for_invalid_login() throws InterruptedException
	 * { r.clickOnReg(); }
	 * 
	 * @When("user enters the invalid {string} {string} and {string}") public void
	 * user_enters_the_invalid_and(String UserName, String Password, String
	 * ConfirmPassword) {
	 * 
	 * System.out.println(Password); System.out.println(ConfirmPassword);
	 * r.sendValues(UserName, Password, ConfirmPassword); }
	 * 
	 * @When("User clicks on register button for invalid login") public void
	 * user_clicks_on_register_button_for_invalid_login() throws
	 * InterruptedException { Thread.sleep(2000); r.regButton(); }
	 * 
	 * @Then("Error message is displayed") public void error_message_is_displayed()
	 * { r.alertmsg(); }
	 */

	@Given("user clicks on Register link")
	public void user_clicks_cn_register_link() throws InterruptedException
	{
		r.clickOnReg();
	}

	@When("user enters the valid {string} {string} and {string}")
	public void user_enters_the_valid_and(String UserName, String Password, String ConfirmPassword) 
	{
		
		System.out.println(Password);
		System.out.println(ConfirmPassword);
		r.sendValues(UserName, Password, ConfirmPassword);
	}

	@When("user clicks on Register button")
	public void user_clicks_on_register_button() throws InterruptedException 
	{
		Thread.sleep(2000);
		r.regButton();
	}

	@Then("user navigated to NumpyNinja Home page")
	public void user_navigated_to_numpy_ninja_home_page() throws InterruptedException {
		/*
		 * Thread.sleep(2000); String expected = Launch_Browser.driver.getTitle();
		 * System.out.println(expected); Assert.assertEquals(expected, "NumpyNinja");
		 * r.signout();
		 */
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		
		Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));
		 
		   System.out.println("user is on home page");
	      
	    
	}

	
	 @When("user fills field from given {string} and rownumber {int}")
	  public void user_fills_field_from_given_and_rownumber(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException 
	 {
		  ExcelReader excelreader=new ExcelReader();
			 List<Map<String,String>> testData= excelreader.getData("src/test/resources/Dataprovider/Register.xlsx", SheetName);
			  String uname= testData.get(RowNumber).get("username");
			  String pword= testData.get(RowNumber).get("password");
			  String cp= testData.get(RowNumber).get("confirmpassword");
			 r.sendValues(uname, pword, cp);
			 Thread.sleep(1000);
			 logger.error("Invalid Register Details");
		
	  }
	 @Then("user will signout from Register page")
	 public void user_will_signout_from_register_page() {
		 r.signout();
	 }
	 
	  

}
