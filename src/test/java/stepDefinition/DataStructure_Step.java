package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.DataStructure_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructure_Step {
	
	WebDriver driver =Launch_Browser.launch_browser();
	DataStructure_Page dsp = new DataStructure_Page(driver);
	ElementUtil eu = new ElementUtil();
	Logger logger = LogManager.getLogger();
	
	
	//Data structure module
	@Given("User is on  data structure module")
	public void user_is_on_data_structure_module() {
		Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));
	}

	@When("User clicks data structure get start button")
	public void user_clicks_data_structure_get_start_button() throws InterruptedException {
		Thread.sleep(2000);
		dsp.DSstart();
	}

	@Then("User launches data structure page")
	public void user_launches_data_structure_page() {
		 String title= eu.TitleGet();
			System.out.println("User is on Data Structures-Introduction Page"+title);
			eu.EqualAssert(title,"Data Structures-Introduction") ;
			
	}
   
	//Time complexity link
	@Given("user is on datasturcture introduction page")
	public void user_is_on_datasturcture_introduction_page() {
		
	}
	
	@When("user clicks on TimeComplexity")
	public void user_clicks_on_time_complexity() {
		dsp.TimeComplexity();
    }

	@Then("user launches on TimeComplexity page")
	public void user_launches_on_time_complexity_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Time Complexity Page"+title);
		eu.EqualAssert(title,"Time Complexity") ;
	}
     //positive
	@Given("user clicks on TryHere button")
	public void user_clicks_on_try_here_button() {
		dsp.DSTryHere(); 
	}

	@Given("user navigated to Tryeditor page to write a Python code")
	public void user_navigated_to_tryeditor_page_to_write_a_python_code() {
		 String title= eu.TitleGet();
			System.out.println("User is on Assessment Page"+title);
			eu.EqualAssert(title,"Assessment");
     }
	
	@When("user is writing Python code")
	public void user_is_writing_python_code() {
		dsp.TextBox();
	}

	@When("user clicks on Run button")
	public void user_clicks_on_run_button() {
		dsp.Run(); 
		
	}

	@Then("user can see the Output of Python code")
	public void user_can_see_the_output_of_python_code() {
		dsp.outputofpythoncd();
		logger.info("Entered code is Valid");
	    }
	
	//@Negative
	@Given("user navigates back to click TryHere button")
	public void user_navigates_back_to_click_try_here_button() {
	   eu.NavigateBack();
	}

	@When("user is entering Invalid Python code")
	public void user_is_entering_invalid_python_code() throws InterruptedException {
		Thread.sleep(1000);
		dsp.InvalidTextBox();
	   Thread.sleep(1000);
	}

	@Then("user is capturing Alert message")
	public void user_is_capturing_alert_message() {
		eu.HandleAlert();   
		logger.warn("Throws Alert Window");
	}
	
	@Then("user navigates back to previous page")
	public void user_navigates_back_to_previous_page() {
		eu.NavigateBack();
	}

	//practice questions
	@Given("user clicks on Practice Questions")
	public void user_clicks_on_practice_questions() throws InterruptedException
	{
		Thread.sleep(2000);
	    dsp.practicequestion();
	}

	@When("user navigates to practice Questions")
	public void user_navigates_to_practice_questions() throws InterruptedException {
		Thread.sleep(2000);
		 String title= eu.TitleGet();
			System.out.println("User is on Practice Questions Page"+title);
			eu.EqualAssert(title,"Practice Questions");
			logger.info("Expected Title");
	}

	@Then("user navigates back to HomePage")
	public void user_navigates_back_to_home_page() throws InterruptedException {
		Thread.sleep(2000);
		//eu.NavigateTo("home_url");
		driver.navigate().to(ConfigReader.launch_Web("home_url"));
	}
}
