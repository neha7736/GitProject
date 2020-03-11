package seleniumPkg;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenBrowser {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Two options to launch browser
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");


		//Implicit wait 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.quit();
		
		String test = driver.getTitle();
		System.out.println("title is " +test);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Cricket");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		/*Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		//Explicit wait
	/*	WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		*/
		
		driver.findElement(By.xpath("//button[@type='123']"));
		if(test.equalsIgnoreCase("Google")) {
			driver.quit();
		}

		//Fluent wait
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.withMessage("Timeout after 30 sec")
				.ignoring(NoSuchFieldException.class);*/
		
	}

}
