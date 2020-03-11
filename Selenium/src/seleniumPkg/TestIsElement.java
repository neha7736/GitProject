package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestIsElement {
	public static WebDriver driver; 
	
	public static boolean isElementPresent(String locator)
	{
		try {
			driver.findElement(By.xpath(locator));
			return true;
			
		}catch(Throwable t){
			
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\chromedriver_win\\chromedriver.exe");

    driver = new ChromeDriver();
	
	driver.get("https://www.wikipedia.org/");
	driver.manage().window().maximize();
	System.out.println(isElementPresent("//*[@id='searchLanguage']"));
}

}