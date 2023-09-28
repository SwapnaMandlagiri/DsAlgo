package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_Page extends Base_Page {
	
	public Register_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(partialLinkText="Register")
	WebElement reg;
	
	@FindBy(xpath="//input[@id='id_username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='id_password1']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='id_password2']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement registerbutton;
	
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement alrtmsg;
	
	 @FindBy(linkText="Sign out")
	 WebElement sgnot;
	
	
	
	public void clickOnReg() throws InterruptedException
	{
		Thread.sleep(1000);
		reg.click();
	}
	
	public void sendValues(String UserName, String Password, String ConfirmPassword)
	{
		userName.sendKeys(UserName);
		password.sendKeys(Password);
		confirmPassword.sendKeys(ConfirmPassword);
	}
	
	public void regButton()
	{
		registerbutton.click();
	}
	
	public void alertmsg()
	{
		String sm = alrtmsg.getText();
		System.out.println(sm);
	}
  
	public void signout()
	  {
	  	  sgnot.click();
	  	  }


	

}
