package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Queue_Page extends Base_Page{

	public Queue_Page(WebDriver driver) {
		super(driver);
	}
	
	
	 @FindBy(xpath="(//a[text()='Get Started'])[5]") WebElement quGetstart;
	 @FindBy(xpath="//a[text()='Implementation of Queue in Python']") WebElement impQuePython;
		
		  @FindBy(xpath="//a[text()='Implementation using collections.deque']") WebElement impcollect; 
		  
		  @FindBy(xpath="//a[text()='Implementation using array']") WebElement impUsingArr;
		  
		  @FindBy(xpath="//a[text()='Queue Operations']") WebElement queOper;
		  
		 





public void queueGetStart() {
	quGetstart.click();
}

public void implementQueuePython() {
	impQuePython.click();
}

public void implementCollection() {
	impcollect.click();
}
public void impUsingArray() {
	impUsingArr.click();
}
public void queueOperations() {
	queOper.click();
}
}