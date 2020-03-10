package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
//import com.learnautomation.utility.ExcelDataProvider;

public class LoginTestCase extends BaseClass{


	@Test(priority=1)
	public void loginApp()
	{
	//	ExcelDataProvider excel = new ExcelDataProvider();
		logger = report.createTest("login to app");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting Application");

		//loginpage.loginToApp(excel.getStringData("loginsheet",0,0));
		loginpage.loginToApp("neha");
		logger.pass("login Success");


	}

	@Test(priority=2)
	public void logoutApp()
	{
	//	ExcelDataProvider excel = new ExcelDataProvider();
		logger = report.createTest("logout to app");
		logger.fail("logout failed");


	}


}
