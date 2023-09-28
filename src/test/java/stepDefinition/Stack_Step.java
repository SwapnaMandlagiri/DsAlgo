package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

//import com.pages.DataStructure_Page;
import com.pages.Stack_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.*;

public class Stack_Step {
	
	WebDriver driver =Launch_Browser.launch_browser();
	Stack_Page sp = new Stack_Page(driver);
	ElementUtil eu = new ElementUtil();
	
	 //User navigates to Stack module
	@Given("User is on stack module")
	public void user_is_on_stack_module() {
		Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));
	   }

	@When("User clicks on stack module's get start button")
	public void user_clicks_on_stack_module_s_get_start_button()
	{
	    sp.StackGetStart();
	}

	@Then("User launches on stack page")
	public void user_launches_on_stack_page() throws InterruptedException 
	{
		//Thread.sleep(2000);
		 String title= eu.TitleGet();
			System.out.println("User is on Stack Page"+title);
			eu.EqualAssert(title,"Stack") ;
	}
	
	// User navigates to operations in stack
	@Given("User is on operations in stack")
	public void user_is_on_operations_in_stack() 
	{
	  
	}

	@When("User clicks on operations in stack button")
	public void user_clicks_on_operations_in_stack_button() 
	{
		 sp.StackOperation();
	}

	@Then("User launches on operations in stack page")
	public void user_launches_on_operations_in_stack_page() throws InterruptedException 
	{
		//Thread.sleep(2000);
		 String title= eu.TitleGet();
			System.out.println("User is on Operations in Stack Page"+title);
			eu.EqualAssert(title,"Operations in Stack") ;
	}
	//User clicks on Implementation
	@Given("User is on Implementations on stack")
	public void user_is_on_implementations_on_stack() {
		
	}
	@When("User clicks on Implementations in stack button")
	public void user_clicks_on_implementations_in_stack_button() {
		 sp.implementation();
	}
	@Then("User launches on Implementations in stack page")
	public void user_launches_on_implementations_in_stack_page() throws InterruptedException {
		//Thread.sleep(2000);
		 String title= eu.TitleGet();
			System.out.println("User is on Implementation Page"+title);
			eu.EqualAssert(title,"Implementation") ;
	}
	
	//User clicks on Applications
	@Given("User is on Applications on stack")
	public void user_is_on_applications_on_stack() {
		
	}
	@When("User clicks on Applications in stack button")
	public void user_clicks_on_applications_in_stack_button() {
		 sp.application();
	}
	@Then("User launches on Applications in stack page")
	public void user_launches_on_applications_in_stack_page() {
		 String title= eu.TitleGet();
			System.out.println("User is on Applications Page"+title);
			eu.EqualAssert(title,"Applications") ;
	}

	

	
	}



