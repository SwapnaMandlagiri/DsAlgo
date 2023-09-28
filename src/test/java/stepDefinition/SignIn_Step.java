package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.pages.SignIn_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn_Step {
	
		WebDriver driver  =Launch_Browser.launch_browser();
		SignIn_Page si=new SignIn_Page(Launch_Browser.driver);
		ElementUtil eu = new ElementUtil();
	
		
		//Invalid data	
		@Given("user enters Invalid {string} and {string}")
		public void user_enters_invalid_and(String iuname, String ipword) {
			 si.signin();
			   si.username(iuname);
			   si.password(ipword);
		}

		//valid data	
		@Given("user clicks on signIn page")
		public void user_clicks_on_sign_in_page() {
			Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));
			}

		@Given("user enters valid {string} and {string}")
		public void user_enters_valid_and(String uname, String pword) {
           si.signin();
		   si.username(uname);
		   si.password(pword);
		   }

		@When("user clicks on login button")
		public void user_clicks_on_login_button() throws InterruptedException {
			Thread.sleep(2000);
			si.login();
			}

		@Then("user navigated to home page")
		public void user_navigated_to_home_page() throws InterruptedException {
			Thread.sleep(2000);
			 String title= eu.TitleGet();
				System.out.println("User is on Sign In Page"+title);
				eu.EqualAssert(title,"NumpyNinja") ;
		
			si.alertmessage();
			  // si.signOut();
			   }
}
