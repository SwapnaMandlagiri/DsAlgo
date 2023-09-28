package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.pages.Tree_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree_Step {
	
	WebDriver driver=Launch_Browser.launch_browser();
	Tree_Page tp = new Tree_Page(driver);
	ElementUtil eu=new ElementUtil(); 
	
	@Given("user is on Tree Module")
	public void user_is_on_tree_module() {
		 Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));    
	}

	@When("user clicks  getstarted button of Tree Module")
	public void user_clicks_getstarted_button_of_tree_module() {
	    tp.getstarted();
	}

	@Then("user launchs Tree page")
	public void user_launchs_tree_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Tree Module"+title);
		eu.EqualAssert(title,"Tree") ; 
	}
	
	//Overview of Trees

	@Given("user is on Overview of Trees")
	public void user_is_on_overview_of_trees() {
		System.out.println("User is on Overview of Trees");  

	}

	@When("user clicks on Overview of Trees")
	public void user_clicks_on_overview_of_trees() {
	    tp.overtrees();
	}

	@Then("user launches on Overview of Trees")
	public void user_launches_on_overview_of_trees() {
		String title= eu.TitleGet();
		System.out.println("User is on Overview of Trees"+title);
		eu.EqualAssert(title,"Overview of Trees") ; 
	}

	//Terminologies
	
	@Given("user is on Terminologies")
	public void user_is_on_terminologies() {
		System.out.println("User is on Terminologies");  
	}

	@When("user clicks on Terminologies link")
	public void user_clicks_on_terminologies_link() {
	   tp.Terminologies();
	}

	@Then("user launches on Terminologies page")
	public void user_launches_on_terminologies_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Terminologies"+title);
		eu.EqualAssert(title,"Terminologies") ;  
	}
	
	//Types of Trees
	
	@Given("user is on Types of Trees")
	public void user_is_on_types_of_trees() {
		System.out.println("User is on Types of Trees");  
	}

	@When("user clicks on Types of Trees link")
	public void user_clicks_on_types_of_trees_link() {
	   tp.TypesofTrees();
	}

	@Then("user launches on Types of Trees page")
	public void user_launches_on_types_of_trees_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Types of Trees"+title);
		eu.EqualAssert(title,"Types of Trees") ;  
	}

//Tree Traversals
	
	@Given("user is on Tree Traversals")
	public void user_is_on_tree_traversals() {
		System.out.println("User is on Tree Traversals");  
	}

	@When("user clicks on Tree Traversals link")
	public void user_clicks_on_tree_traversals_link() {
	    tp.TreeTraversals();
	}

	@Then("user launches on Tree Traversals page")
	public void user_launches_on_tree_traversals_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Tree Traversals"+title);
		eu.EqualAssert(title,"Tree Traversals") ;  
	}
	
	//Traversals-Illustration
	
	@Given("user is on Traversals-Illustration")
	public void user_is_on_traversals_illustration() {
		System.out.println("User is on Traversals-Illustration");  
	}

	@When("user clicks on Traversals-Illustration link")
	public void user_clicks_on_traversals_illustration_link() {
	    tp.TraversalsIllustration();
	}

	@Then("user launches on Traversals-Illustration page")
	public void user_launches_on_traversals_illustration_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Traversals-Illustration"+title);
		eu.EqualAssert(title,"Traversals-Illustration") ;  
	}

//Binary Trees

	@Given("user is on Binary Trees")
	public void user_is_on_binary_trees() {
		System.out.println("User is on Binary Trees");   
	}

	@When("user clicks on Binary Trees link")
	public void user_clicks_on_binary_trees_link() {
	   tp.BinaryTrees();
	}

	@Then("user launches on Binary Trees page")
	public void user_launches_on_binary_trees_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Binary Trees"+title);
		eu.EqualAssert(title,"Binary Trees") ;  
	}
	
	//Types of Binary Trees
	
	@Given("user is on Types of Binary Trees")
	public void user_is_on_types_of_binary_trees() {
		System.out.println("User is on Types of Binary Trees");   
	}

	@When("user clicks on Types of Binary Trees link")
	public void user_clicks_on_types_of_binary_trees_link() {
	   tp.TypesofBinaryTrees();
	}

	@Then("user launches on Types of Binary Trees page")
	public void user_launches_on_types_of_binary_trees_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Types of Binary Trees"+title);
		eu.EqualAssert(title,"Types of Binary Trees") ;   
	}
	
	//Implementation in Python
	
	@Given("user is on Implementation in Python")
	public void user_is_on_implementation_in_python() {
		System.out.println("User is on Implementation in Python");     
	}

	@When("user clicks on Implementation in Python link")
	public void user_clicks_on_implementation_in_python_link() {
	   tp.ImplementationinPython();
	}

	@Then("user launches on Implementation in Python page")
	public void user_launches_on_implementation_in_python_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Implementation in Python"+title);
		eu.EqualAssert(title,"Implementation in Python") ;   
	}

	// Binary Tree Traversals
	
	@Given("user is on Binary Tree Traversals")
	public void user_is_on_binary_tree_traversals() {
		System.out.println("User is on Binary Tree Traversals");        
	}

	@When("user clicks on Binary Tree Traversals")
	public void user_clicks_on_binary_tree_traversals() {
	   tp.BinaryTreeTraversals();
	}

	@Then("user launches on Binary Tree Traversals")
	public void user_launches_on_binary_tree_traversals() {
		String title= eu.TitleGet();
		System.out.println("User is on Binary Tree Traversals"+title);
		eu.EqualAssert(title,"Binary Tree Traversals") ;  
	}
	
	// Implementation of Binary Trees
	
	@Given("user is on Implimentation of Binary Trees")
	public void user_is_on_implimentation_of_binary_trees() {
		System.out.println("User is on Implementation of Binary Trees");        
	}

	@When("user clicks on Implimentation of Binary Trees")
	public void user_clicks_on_implimentation_of_binary_trees() {
	   tp.ImplementationofBinaryTrees();
	}

	@Then("user launches on Implimentation of Binary Trees")
	public void user_launches_on_implimentation_of_binary_trees() {
		String title= eu.TitleGet();
		System.out.println("User is on Implementation of Binary Trees"+title);
		eu.EqualAssert(title,"Implementation of Binary Trees") ; 
	}
	
	// Applications of Binary trees
	
	@Given("user is on Applications of Binary trees")
	public void user_is_on_applications_of_binary_trees() {
		System.out.println("User is on Applications of Binary trees");    
	}

	@When("user clicks on Applications of Binary trees link")
	public void user_clicks_on_applications_of_binary_trees_link() {
	   tp.ApplicationsofBinarytrees();
	}

	@Then("user launches on Applications of Binary trees page")
	public void user_launches_on_applications_of_binary_trees_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Applications of Binary trees"+title);
		eu.EqualAssert(title,"Applications of Binary trees") ; 
	}

	
	// Binary Search Trees
	
	@Given("user is on Binary Search Trees")
	public void user_is_on_binary_search_trees() {
		System.out.println("User is on Binary Search Trees");    
	}

	@When("user clicks on Binary Search Trees link")
	public void user_clicks_on_binary_search_trees_link() {
	  tp.BinarySearchTrees();
	}

	@Then("user launches on Binary Search Trees page")
	public void user_launches_on_binary_search_trees_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Binary Search Trees"+title);
		eu.EqualAssert(title,"Binary Search Trees") ; 
	}
	
	// Implementation Of BST
	
	@Given("user is on Implementation Of BST")
	public void user_is_on_implementation_of_bst() {
		System.out.println("User is on Implementation Of BST");       
	}

	@When("user clicks on Implementation Of BST link")
	public void user_clicks_on_implementation_of_bst_link() {
	  tp.ImplementationOfBST();
	}

	@Then("user launches on Implementation Of BST page")
	public void user_launches_on_implementation_of_bst_page() {
		String title= eu.TitleGet();
		System.out.println("User is on Implementation Of BST"+title);
		eu.EqualAssert(title,"Implementation Of BST") ; 
	}
	
}
