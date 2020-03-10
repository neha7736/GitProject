package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import freemarker.template.SimpleDate;

public class Helper {

	static String screenshotpath;
	public static String captureScreenshot(WebDriver driver,String imagename)
	{
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
			screenshotpath=System.getProperty("user.dir")+"/Screenshots"+getDateFormat()+imagename+".png" ;
			FileHandler.copy(src, new File(screenshotpath));
			
			System.out.println("Screenshot captured...");
			
		} catch (IOException e) {
			System.out.println("unable to capture screenshot"+e.getMessage());
			e.printStackTrace();
		}
		return screenshotpath;
	}
	
	
	public static String getDateFormat()
	{
		DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date customdate= new Date();
		return customformat.format(customdate);
		
	}
}
