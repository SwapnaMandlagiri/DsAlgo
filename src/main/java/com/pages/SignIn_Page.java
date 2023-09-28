package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn_Page extends Base_Page {

	public SignIn_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//a[text()='Sign in']")  WebElement sign;
	@FindBy(xpath = "//input[@name='username']") WebElement usrnme;
	@FindBy(xpath="//input[@name='password']") WebElement lstnme;
	@FindBy(xpath="//input[@type='submit']") WebElement lgn;
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement alrtmsg;
	@FindBy(xpath="//a[@href='/logout']") WebElement signout;

	

		 public void signin()
		 {
		 sign.click();
		 }
		 
		 public void username(String uname) 
		 { 
			 usrnme.sendKeys(uname);
		  }
		  public void password(String pword)
		  { 
			 lstnme.sendKeys(pword);
		  }

		  public void login() 
		  {
		  lgn.click(); 
		  }
		 public void alertmessage() 
		 
		 {
			String AlertMessage =  alrtmsg.getText();
			System.out.println(AlertMessage);
		 }
		 public void signOut() {
			 signout.click();
		 }
}
