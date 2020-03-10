package com.learnautomation.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learnautomation.utility.BrowserFactory;
/*import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.ExcelDataProvider;*/
import com.learnautomation.utility.Helper;


public class BaseClass {
public static ExtentReports report;
public static ExtentTest logger;
	 protected WebDriver driver; 
	/* ExcelDataProvider excel;
	 ConfigDataProvider config;*/
	 
	 @BeforeSuite
		public void setUpSuite()
		{
		/*excel= new ExcelDataProvider();
		config = new ConfigDataProvider();*/
		 ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/login"+ Helper.getDateFormat()+".html"));
		 report = new ExtentReports();
		 report.attachReporter(extent);
		 
		// logger=report.createTest("setup suite");
		}

	 
	 
	 
	@BeforeClass
	public void setup()
	{
		//logger.info("Setup started");
		//driver = BrowserFactory.startApp(driver,config.getBrowser(),config.getStagingUrl());
		driver = BrowserFactory.startApp(driver,"Chrome","http://way2automation.com/way2auto_jquery/index.php");
		//System.out.println("page title is :"+driver.getTitle());
		
	}
	
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}

	
	//To be executed after every method from where it is called
	
	@AfterMethod
	public void teardownMethod(ITestResult result) throws IOException
	{
		//System.out.println("Entered into after method");
		System.out.println("username is----- ");
		System.out.println("Entered into after method..");
		//System.out.println(excel.getStringData("loginsheet",0,0));
		if(result.getStatus()==ITestResult.FAILURE) {
		//  Helper.captureScreenshot(driver,"loginpage");
		
		logger.fail("login failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver,"login fail")).build());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			logger.pass("login failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver,"login fail")).build());

		}
		report.flush();
	}

	
}
