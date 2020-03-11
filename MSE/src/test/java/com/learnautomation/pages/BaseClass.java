package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;


public class BaseClass {

	 protected WebDriver driver; 
	 ExcelDataProvider excel;
	 ConfigDataProvider config;
	 
	 @BeforeSuite
		public void setUpSuite()
		{
		excel= new ExcelDataProvider();
		config = new ConfigDataProvider();
		}

	 
	 
	 
	@BeforeClass
	public void setup()
	{
	
		driver = BrowserFactory.startApp(driver, config.getBrowser(),config.getStagingUrl());
		//System.out.println("page title is :"+driver.getTitle());
		
	}
	
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}

	
	//To be executed after every method from where it is called
	
	@AfterMethod
	public void teardownMethod(ITestResult result)
	{
		if(result.equals(ITestResult.FAILURE))
		  Helper.captureScreenshot(driver,"login");
	}

	
}
