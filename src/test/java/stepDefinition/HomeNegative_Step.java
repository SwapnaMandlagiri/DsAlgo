package stepDefinition;

import com.pages.HomePageNegative_Page;
//import com.pages.HomePageNegative_Page.HomePageNegative;
import com.qa.factory.Launch_Browser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeNegative_Step {
	
HomePageNegative_Page hpn=new HomePageNegative_Page(Launch_Browser.driver);
	
	@Given("user clicks Data Structure get start button without signingIn")
	public void user_clicks_data_structure_get_start_button_without_signing_in() throws InterruptedException {
		Thread.sleep(2000);
		hpn.ds_Start();
		 }

	@Then("displays data structure error message")
	public void displays_data_structure_error_message() throws InterruptedException {
		Thread.sleep(2000);
		hpn.error();
	  }
	
	@Given("user clicks Array get start button without signingIn")
	public void user_clicks_array_get_start_button_without_signing_in() throws InterruptedException {
		Thread.sleep(2000);
		hpn.arr_Start();
	    }

	@Then("displays array error message")
	public void displays_array_error_message() throws InterruptedException {
		 Thread.sleep(2000);
		hpn.error();
	   }

}
