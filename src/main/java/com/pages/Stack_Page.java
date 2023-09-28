package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Stack_Page extends Base_Page{

	public Stack_Page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy (xpath = "//a[@href='stack']")
	WebElement stackstrt;
	@FindBy (xpath ="//a[@href='operations-in-stack']")
	WebElement stckoper;
	@FindBy (xpath = "//a[@href='implementation']")
	WebElement stckimpli;
	@FindBy (xpath = "//a[@href='stack-applications']")
	WebElement stckapp;
	@FindBy (xpath = "//a[text()='Operations in Stack']")
	WebElement oprtn;
	@FindBy (xpath ="//a[@href='/stack/implementation/']")
	WebElement implmntn; 
	@FindBy (xpath ="//a[@href='/stack/stack-applications/']")
	WebElement applctn;
	@FindBy (xpath = "//form/div/div/div/textarea")
	WebElement  TxtBx;
	@FindBy (xpath = "//a[@class='btn btn-info']")
	WebElement tryhr;  // same for application and implementation
	@FindBy (xpath ="//button[@type='button']")
	WebElement rn;
	
	public void StackGetStart()
	{
		stackstrt.click();
	}
	public void StackOperation()
	{
	stckoper.click();
	}
	public void StackImplimentation() 
	{
		stckimpli.click();
	}
	public void StackApplication() 
	{
		stckapp.click();
	}
	public void operation()
	{
		oprtn.click();
	}
	public void implementation()
	{
	implmntn.click();
	}
	public void application()
	{
		applctn.click();
	}
	public void TextBox() 
	{
	TxtBx.getText();
    }
	public void run() 
	{
	rn.click();
	}
	
}
