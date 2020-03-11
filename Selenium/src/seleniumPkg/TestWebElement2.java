package seleniumPkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebElement2 {

	public static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");

	    driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("http://way2automation.com/way2auto_jquery/index.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Neha");
		driver.findElement(By.xpath("//div[@class='span_1_of_4']//input[@xpath='1']")).click();
		
	
		
		
	}

}
