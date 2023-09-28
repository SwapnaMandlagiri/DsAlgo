package com.qa.factory;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;

	public static String path = "src/test/resources/Config_Files/config1.properties";

	public DriverFactory() {

	}

	public static WebDriver driverSetup() throws IOException {

		if(driver == null) {
			fr = new FileReader(path);
			prop.load(fr);
			if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(prop.getProperty("url"));

			}

			
			  if(prop.getProperty("browser").equalsIgnoreCase("FireFox")) 
			  {
			  WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
			  driver.manage().deleteAllCookies();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver.get(prop.getProperty("url")); }
			 
			return driver;
		} else
			return driver;
	}
	public static void tearDown()
	{
		driver.quit();
		
	}
	
}
