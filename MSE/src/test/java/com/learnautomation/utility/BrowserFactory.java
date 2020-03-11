package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	public static WebDriver driver; 
	public static WebDriver startApp(WebDriver driver, String browserName , String appURL )
	{
		if(browserName.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\driver\\chromedriver80\\chromedriver.exe");
		
			driver = new ChromeDriver();
		}

		if(browserName.equals("FireFox")) {

			//System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		if(browserName.equals("IE")) {

			//System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\iedriver\\iedriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		return driver;
	}

	public static void quitBrowser(WebDriver qdriver)
	{
		qdriver.quit();
	
	}
}
