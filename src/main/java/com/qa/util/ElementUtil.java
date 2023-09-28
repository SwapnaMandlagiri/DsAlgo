package com.qa.util;

import org.testng.Assert;

import com.qa.factory.Launch_Browser;

public class ElementUtil {
	
    public void HandleAlert() 
    {
		
		Launch_Browser.driver.switchTo().alert().accept();

	}

	public void EqualAssert(String expected,String actual) 
	{
		
		Assert.assertEquals(expected, actual);
	}

	public void NavigateBack() 
	{
		
		Launch_Browser.driver.navigate().back();

	}

	public void NavigateTo(String tourl) 
	{

		Launch_Browser.driver.navigate().to(tourl);
	}

   public String TitleGet() {
		
        String  title = Launch_Browser.driver.getTitle();
        return title;
	}
	


}


