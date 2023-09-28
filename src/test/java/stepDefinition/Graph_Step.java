package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.pages.Graph_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.*;

public class Graph_Step {
	
	WebDriver driver =Launch_Browser.launch_browser();
	Graph_Page gp = new Graph_Page(driver);
	ElementUtil eu = new ElementUtil();
	
	
	//User navigates to Graph module
	@Given("User is on Graph module")
	public void user_is_on_graph_module() {
		Launch_Browser.driver.get(ConfigReader.launch_Web("graph_url")); 
	}
	@When("User clicks on Graph modules Get Start button")
	public void user_clicks_on_graph_modules_get_start_button() {
	   gp.getstarted();
	}
	@Then("User launches on Graph page")
	public void user_launches_on_graph_page() {
		 String title= eu.TitleGet();
			System.out.println("User is on Graph Page"+title);
			eu.EqualAssert(title,"Graph") ;
	}
	
	//User clicks on Graphs representation
	@Given("User is on representation on graph")
	public void user_is_on_representation_on_graph() {
	   
	}
	@When("User clicks on representation in graph button")
	public void user_clicks_on_representation_in_graph_button() {
		 gp.representations();
	}
	@Then("User launches on representation in graph page")
	public void user_launches_on_representation_in_graph_page() {
		 String title= eu.TitleGet();
			System.out.println("User is on Graph Representations Page"+title);
			eu.EqualAssert(title,"Graph Representations") ;
	}
}
