package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.pages.Queue_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Queue_Step {
	
	WebDriver driver=Launch_Browser.launch_browser();
	 ElementUtil eu = new ElementUtil();
	 Queue_Page qp=new Queue_Page(driver);
	 
	@Given("user is on Queue Module")
	public void user_is_on_queue_module() {
		 Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));  
	}

	@When("user clicks  getstarted button of Queue Module")
	public void user_clicks_getstarted_button_of_queue_module() {
	   qp.queueGetStart();
	}

	@Then("user launchs Queue page")
	public void user_launchs_queue_page() {
		 String title= eu.TitleGet();
			System.out.println("User is on Queue Module"+title);
			eu.EqualAssert(title,"Queue") ;
			  
	}
	
	//Implementation of Queue in Python
	
	@Given("user is on Implementation of Queue in Python Page")
	public void user_is_on_implementation_of_queue_in_python_page() {
	  System.out.println("User is on Implementation of Queue in Python");  
	}

	@When("user clicks on Implementation of Queue in Python link")
	public void user_clicks_on_implementation_of_queue_in_python_link() {
	   qp.implementQueuePython();
	}

	@Then("user launches on Implementation of Queue in Python page")
	public void user_launches_on_implementation_of_queue_in_python_page() {
		 String title= eu.TitleGet();
			System.out.println("User is on Implementation of Queue in Python"+title);
			eu.EqualAssert(title,"Implementation of Queue in Python") ;
			   
	}
	
	//Implementation using collections.deque
	
	@Given("user is on Implementation using collections Page")
	public void user_is_on_implementation_using_collections_page() {
	   System.out.println("User is on Implementation using collections Page");
	}

	@When("user clicks on Implementation using collections link")
	public void user_clicks_on_implementation_using_collections_link() {
	   qp.implementCollection();
	}

	@Then("user launches on Implementation using collections page")
	public void user_launches_on_implementation_using_collections_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Implementation using collections"+title);
		eu.EqualAssert(title,"Implementation using collections.deque") ;
	}
	
	//Implementation using array 
	
	@Given("user is on Implementation using array Page")
	public void user_is_on_implementation_using_array_page() {
	  System.out.println("User is on Implementation using array");  
	}

	@When("user clicks on Implementation using array link")
	public void user_clicks_on_implementation_using_array_link() {
	  qp.impUsingArray(); 
	}

	@Then("user launches on Implementation using array page")
	public void user_launches_on_implementation_using_array_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Implementation using array"+title);
		eu.EqualAssert(title,"Implementation using array") ;
	   
	}
    //Queue Operations
	


	@Given("user is on  Page Queue Operations")
	public void user_is_on_page_queue_operations() {
	   System.out.println("User is on Queue Operations");
	}

	@When("user clicks onlink Queue Operations")
	public void user_clicks_onlink_queue_operations() {
	  qp.queueOperations();
	}

	@Then("user launches on  page Queue Operations")
	public void user_launches_on_page_queue_operations() {
		String title= eu.TitleGet();
		System.out.println("User is on Queue Operations"+title);
		eu.EqualAssert(title,"Queue Operations") ;
	   
	}
	
	//Practice Questions
	
	
}
