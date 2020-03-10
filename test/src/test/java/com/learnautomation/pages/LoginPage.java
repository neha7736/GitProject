package com.learnautomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.ITestResult;

import com.learnautomation.utility.Helper;

public class LoginPage {

	WebDriver driver; 
	public LoginPage(WebDriver ldriver)
	{
		this.driver= ldriver;
	}
	
	@FindBy(name="name")WebElement uname;
	
	
	public void loginToApp(String username) 
	{
		try {
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			uname.sendKeys(username);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

