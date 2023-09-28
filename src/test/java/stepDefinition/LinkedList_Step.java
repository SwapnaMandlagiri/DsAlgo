
package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.Graph_Page;
import com.pages.LinkedList_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList_Step



{
	
	WebDriver driver =Launch_Browser.launch_browser();
	ElementUtil eu = new ElementUtil();
	Logger logger = LogManager.getLogger();
	LinkedList_Page linkedlist = new LinkedList_Page(Launch_Browser.driver);


	@Given("user is in LinkeList page after logged In")
	public void user_is_in_linke_list_page_after_logged_in() 
	{
		

		Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));
		linkedlist.Click_on_getStart();
	}

	@When("user clicks on introduction link")
	public void user_clicks_on_introduction_link() 
	{
		linkedlist.Click_on_intro();
	}

	@Then("user is directed to introduction page of linked list")
	public void user_is_directed_to_introduction_page_of_linked_list() 
	{
		
	}

	@Given("user is on the creating  list after logged in")
	public void user_is_on_the_creating_list_after_logged_in() {

	}

	@Then("user navigates back to previous page")
	public void user_navigates_back_to_previous_page() 
	{
	    eu.NavigateBack();
	}

	@Given("user is in the linked list page after logged In")
	public void user_is_in_the_linked_list_page_after_logged_in()
	{
		
	}
	@When("user clicks on the creating a linked list button")
	public void user_clicks_on_the_creating_a_linked_list_button() throws InterruptedException {
		
		Launch_Browser.driver.get(ConfigReader.launch_Web("ll_url"));
		
		Thread.sleep(2000);
		linkedlist.create_linkedList();
	}

	@Then("user should be directed to creating a linked list page")
	public void user_should_be_directed_to_creating_a_linked_list_page() {

		
	}
	
	
	@When("user clicks on the insert button")
	public void user_clicks_on_the_insert_button()
	{
		Launch_Browser.driver.get(ConfigReader.launch_Web("ll_url"));
		
	  linkedlist.Insert_linkedList();
	}
	
	@When("user clicks on the Impliment linked button")
	public void user_clicks_on_the_impliment_linked_button() 
	{
		Launch_Browser.driver.get(ConfigReader.launch_Web("ll_url"));
		
	   linkedlist.Impliment_linkedList();
	}
	@When("user clicks on the Types of linked list button")
	public void user_clicks_on_the_types_of_linked_list_button() 
	{
		Launch_Browser.driver.get(ConfigReader.launch_Web("ll_url"));
		
		linkedlist.Types_linkedList();
	   
	}
	
	@When("user clicks on the Traversal button")
	public void user_clicks_on_the_traversal_button() {
		
		Launch_Browser.driver.get(ConfigReader.launch_Web("ll_url"));
		
	   linkedlist.Traverse_linkedList();
	}


}
