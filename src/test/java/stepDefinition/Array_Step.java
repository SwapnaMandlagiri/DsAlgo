package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.Array_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array_Step {
	
	WebDriver driver=Launch_Browser.launch_browser();
	Array_Page ap = new Array_Page(driver);
	ElementUtil eu = new ElementUtil();
	
	@Given("user is on Array Module")
	public void user_is_on_array_module() {
	   Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));
	}

	@When("user clicks Array getStarted button")
	public void user_clicks_array_get_started_button() {
	    ap.arrayStart();
	}

	@Then("user launches Array Page")
	public void user_launches_array_page() {
	    String arrexpected=Launch_Browser.driver.getTitle();
	    System.out.println(arrexpected);
	    Assert.assertEquals(arrexpected, "Array");
	}
	
	//Arrays in Python

	@Given("user enters into Arrays in Python")
	public void user_enters_into_arrays_in_python() {
		System.out.println("User is on Arrays in Python");
			
	}

	@When("user clicks on Arrays in Python link")
	public void user_clicks_on_arrays_in_python_link() {
		ap.arrayPython();
	}

	@Then("user lands on Arrays in Python Page")
	public void user_lands_on_arrays_in_python_page() {
		
		  String title= eu.TitleGet();
		  System.out.println("User is on Arrays in Python"+title);
		  eu.EqualAssert(title,"Arrays in Python");
		
		
	}
	
	//Arrays Using List
	
	@Given("user enters into Arrays Using List")
	public void user_enters_into_arrays_using_list() {
		System.out.println("User is on Arrays Using List");  
	}

	@When("user clicks on Arrays Using List")
	public void user_clicks_on_arrays_using_list() {
	    ap.arrayUsingList();
	}

	@Then("user lands on Arrays Using List")
	public void user_lands_on_arrays_using_list() {
		 String title= eu.TitleGet();
		  System.out.println("User is on Arrays Using List"+title);
		  eu.EqualAssert(title,"Arrays Using List");
		}

	
	//Basic Operations in Lists
	
	@Given("user enters into Basic Operations in Lists")
	public void user_enters_into_basic_operations_in_lists() {
		
		System.out.println("User is on Basic Operations in Lists");  
 
	}

	@When("user clicks on Basic Operations in Lists")
	public void user_clicks_on_basic_operations_in_lists() {
	   ap.basicOperList();
	}

	@Then("user lands on Basic Operations in Lists")
	public void user_lands_on_basic_operations_in_lists() {
		 String title= eu.TitleGet();
		  System.out.println("User is on Basic Operations in Lists"+title);
		  eu.EqualAssert(title,"Basic Operations in Lists");
	}
	
	//Applications of Array

		@Given("user enters into Applications of Array")
		public void user_enters_into_applications_of_array() {
			System.out.println("User is on Applications of Array");
		}

		@When("user clicks on Applications of Array")
		public void user_clicks_on_applications_of_array() {
		  ap.appArray();
		}

		@Then("user lands on Applications of Array")
		public void user_lands_on_applications_of_array() {
			 String title= eu.TitleGet();
			  System.out.println("User is on Applications of Array"+title);
			  eu.EqualAssert(title,"Applications of Array");
		}


}
