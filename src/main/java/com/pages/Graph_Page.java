package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Graph_Page extends Base_Page
{
  public Graph_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[@href='graph']")  WebElement started;
	//@FindBy(xpath="//a[@href='/graph/graph-representations/']") WebElement Graph;
	@FindBy(xpath="//a[@class='list-group-item']") WebElement Graph;
	@FindBy(xpath="//a[@href='/graph/graph-representations/']") WebElement represent;
	//@FindBy(xpath="//a[@href='graph-representations']") WebElement represent;
	
	public void getstarted() {
		started.click();
	}
	public void graph() {
		Graph.click();
	}
	public void representations() {
		represent.click();
	}
}
