package seleniumPkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWebElement {

	public static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\chromedriver\\chromedriver.exe");

	    driver = new ChromeDriver();
	    driver.get("https://xerox.service-now.com/nav_to.do?uri=%2Fhome.do");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("50004258");
	     driver.findElement(By.id("password")).sendKeys("Pandey@123"+Keys.ENTER);
	     Thread.sleep(5000);
	    
		/*driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("way2Automation");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);*/
	//	Thread.sleep(20000);
		//driver.findElement(By.xpath("//div[@class='g']//div//div//div[@class='rc']//h3[@class='LC20lb']//span[contains(text(),'Way2Automation')]")).click();
		
		//driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']//ul[@class='nav navbar-nav']//li)]"));
		System.out.println("going to print elemenet......");
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			int size = driver.findElements(By.tagName("iframe")).size();
			
			System.out.println("frames::"+size);
			driver.switchTo().frame("gsft_main");
			
			WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='s2id_page_selector']")));
			//driver.switchTo().frame(el);
			boolean check = driver.findElement(By.xpath("//div[@id='s2id_page_selector']")).isDisplayed();
			System.out.println("element text is "+el.getText() );
			System.out.println("check value is "+check);
			//driver.switchTo().frame("gsft_main");
			
			WebElement search = driver.findElement(By.xpath("//div[@id='s2id_page_selector']"));
			Select sel1 = new Select(search);
			sel1.selectByIndex(4);
			//driver.findElement(By.xpath("//a[@class='select2-choice']/span[1]")).click();
			//driver.switchTo().activeElement();
			//driver.findElement(By.xpath("//input[@id='s2id_autogen1']")).sendKeys("My Homepage 2" +Keys.ENTER);;
			Thread.sleep(8000);
			driver.switchTo().defaultContent();
			//driver.switchTo().frame("gsft_main");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		String path = "//*[@class='vt']//a[contains(text(),'RTMI')]";
		driver.switchTo().frame("javascript_debugger");
		
		System.out.println("Total links.... are ::" +driver.findElement(By.xpath(path)).getText());
		
		
		//List<WebElement> links = driver.findElements(By.partialLinkText("INC0"));
		//System.out.println("Total links are ::" + links.size());
		
		/*for(WebElement link : links) {
			
			System.out.println(link.getText() + "URL is :: "+ link.getAttribute("href"));
		}*/
	}

}
