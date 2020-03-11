package seleniumPkg;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\chromedriver_win\\chromedriver.exe");
		driver.get("https://www.google.com/");
		 Utility.captureScreenshot(driver,"typegoogle");

		driver.manage().window().maximize();
		 Utility.captureScreenshot(driver,"max");

		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Learn Automation");
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
				 withTimeout(10, TimeUnit.SECONDS)
				 .pollingEvery(2,TimeUnit.SECONDS)
				 .withMessage("TimeOut after 30 sec")
				 .ignoring(NoSuchElementException.class)
			;
		 
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='qpz']")));
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Learn Automation");
		 
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='p']"))).sendKeys("Learn Automation");
		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Learn ");
		 /*TakesScreenshot ts = (TakesScreenshot)driver;
		 File source= ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("./Screenshots/google.png"));
		 System.out.println("Screenshot captured");
	*/
		 
		 Utility.captureScreenshot(driver,"typekeys");
		 
	
	}
	
}
