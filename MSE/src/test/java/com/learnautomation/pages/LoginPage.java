package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
			Thread.sleep(2000);
			uname.sendKeys(username);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

