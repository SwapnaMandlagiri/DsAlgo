package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataStructure_Page extends Base_Page{
	
	public DataStructure_Page(WebDriver driver)
	{
		super(driver);
}
	  @FindBy(xpath="//a[@href='data-structures-introduction']") WebElement started;
	  @FindBy(xpath = "//a[@class= 'list-group-item']") WebElement tcmplxty;
	  @FindBy(linkText = "Data Structures-Introduction") WebElement DSIntro;
	  @FindBy(xpath = "//a[@href='/tryEditor']") WebElement DSTryHr;
	  @FindBy(linkText="Time Complexity") WebElement DSTMCmp;
	  @FindBy(xpath="//form/div/div/div/textarea") WebElement Txtbx;
	  @FindBy(xpath="//button[text()='Run']") WebElement Rn;
	  @FindBy(xpath="//div//pre[@id='output']") WebElement output;
	  @FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']") WebElement pracque;
/*
 * @FindBy(xpath =
 * "(//a[@class='align-self-end btn btn-lg btn-block btn-primary'])[1]")
 * WebElement started;
 * 
 * @FindBy(xpath = "//a[@class= 'list-group-item']") WebElement tcmplxty;
 * 
 * @FindBy(linkText = "Data Structures-Introduction") WebElement DSIntro;
 * 
 * @FindBy(xpath = "//a[@href='/tryEditor']") WebElement DSTryHr;
 * 
 * @FindBy(linkText="Time Complexity") WebElement DSTMCmp;
 * 
 * @FindBy(xpath="//form/div/div/div/textarea") WebElement Txtbx;
 * 
 * @FindBy(xpath="//button[@type='button']") WebElement Rn;
 * 
 * @FindBy(xpath="//div//pre[@id='output']")WebElement oppytcd;
 */
	  
  public void DSstart()
  {
	  started.click();
  }
  public void TimeComplexity() {
	  tcmplxty.click();
  }
  public void DSIntroduction() {
	  DSIntro.click();
  }
  public void DSTryHere()
  {
	  DSTryHr.click();
  }
  public void TextBox()
  {
	  Txtbx.sendKeys("print('Hi')");
  }
  public void InvalidTextBox() 
  {
		   Txtbx.sendKeys("Hello"); 
  }
  public void Run()
    {
	  Rn.click();
	  }
  public void outputofpythoncd() 
  {
	  output.getText();
   }
 
public void practicequestion() 
{
		 pracque.click();
}
 
}
