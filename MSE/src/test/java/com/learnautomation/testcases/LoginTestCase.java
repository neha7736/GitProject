package com.learnautomation.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class LoginTestCase extends BaseClass{
	
	
	@Test
	public void loginApp() throws InterruptedException, IOException
	{
		ExcelDataProvider excel = new ExcelDataProvider();
 		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.loginToApp(excel.getStringData("loginsheet",0,0));
	  

	}

	


}
