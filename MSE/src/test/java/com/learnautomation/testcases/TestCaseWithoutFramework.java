package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {
	public static WebDriver driver; 
	
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
			
			driver.get("http://way2automation.com/way2auto_jquery/index.php");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("http://way2automation.com/way2auto_jquery/index.php");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Neha");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//div[@class='span_1_of_4']//input[@value='Submit']")).click();
			driver.quit();
	}
	
}
