package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.factory.Launch_Browser;

public class LinkedList_Page extends Base_Page
{

	public LinkedList_Page(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//a[@href='linked-list']") WebElement linklist_start;
	@FindBy(linkText="Introduction") WebElement intro;
	 @FindBy(xpath = "//a[@href='/tryEditor']") WebElement llTryHr;
	 @FindBy(linkText="Creating Linked LIst") WebElement create_linkedlist;
	 @FindBy(linkText="Types of Linked List") WebElement types_linkedlist;
	 @FindBy(linkText="Implement Linked List in Python") WebElement impliment_linkedlist;
	 @FindBy(linkText="Traversal") WebElement traversal_linkedlist;
	 @FindBy(linkText="Insertion") WebElement insert_linkedlist;
	
	public void Click_on_getStart()
	{
		linklist_start.click();
	}
	
	public void Click_on_intro()
	{
		intro.click();
		JavascriptExecutor js=(JavascriptExecutor)Launch_Browser.driver;
		js.executeScript("window.scrollBy(0,250)","");
	}
	public void try_here()
	{
		llTryHr.click();
	}
	public void create_linkedList()
	{
		create_linkedlist.click();
	}
	public void Types_linkedList()
	{
		types_linkedlist.click();
	}
	public void Impliment_linkedList()
	{
		impliment_linkedlist.click();
	}
	public void Traverse_linkedList()
	{
		traversal_linkedlist.click();
	}
	public void Insert_linkedList()
	{
		insert_linkedlist.click();
	}
	
	

}
