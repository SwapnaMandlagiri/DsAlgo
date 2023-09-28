package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageNegative_Page extends Base_Page {
	
	public HomePageNegative_Page(WebDriver driver) 
		{
			super(driver);
			
		}
		
		@FindBy(xpath="(//a[text()='Get Started'])[1]") WebElement ds_getstart;
		@FindBy(xpath="(//a[text()='Get Started'])[2]") WebElement arr_getstart;
		
		@FindBy(xpath= "//div[@class='alert alert-primary']") WebElement errormsg;
		
		public void ds_Start()
		{
			ds_getstart.click();
		}
		public void arr_Start()
		{
			arr_getstart.click();
		}
		public void error()
		{
			String e=errormsg.getText();
			System.out.println(e);
		}
	}
