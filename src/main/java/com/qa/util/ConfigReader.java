package com.qa.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigReader 
{
	public static String browser_key;
	public static Properties prop=new Properties();
	public static FileReader fr;
	public static String config_path="src/test/resources/Config_Files/config1.properties";
	
	public static String init_Reader()
	{
		try 
		{
			fr=new FileReader(config_path);
			prop.load(fr);
			browser_key=prop.getProperty("browser");
			return browser_key;
			 } 
	catch (IOException e) 
		{
				e.printStackTrace();
			return "chrome";
		}
	}
		public static String launch_Web(String url)
		{
		 return prop.getProperty(url);
		 
		
		/*
		 * Constants.home_url=prop.getProperty("home_url");
		 * Constants.reg_url=prop.getProperty("reg_url");
		 * Constants.signin_url=prop.getProperty("singin_url");
		 * 
		 * Constants.ds_url=prop.getProperty("ds_url");
		 * Constants.linklist_url=prop.getProperty("ll_url");
		 * Constants.graph_url=prop.getProperty("graph_url");
		 * Constants.stack_url=prop.getProperty("stack_url");
		 * Constants.queue_url=prop.getProperty("queue_url");
		 * Constants.arr_url=prop.getProperty("arr_url"); return
		 * Constants.tree_url=prop.getProperty("tree_url");
		 */
					
	
	}
	
	

}
