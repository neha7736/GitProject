package seleniumPkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	
		//Two options to launch browser
		//driver.get("https://www.google.com/");
		//driver.navigate().to("https://www.google.com/");

		//Implicit wait 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");

		driver.findElement(By.xpath(".//*[@id=’menu1′]")).click();

				List dd_menu= driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
				WebElement element ;
						for(int i=0;i<dd_menu.size();i++)
						{
						   element =(WebElement) dd_menu.get(i);

							String innerhtml=element.getAttribute("innerHTML");

							if(innerhtml.contentEquals("JavaScript"))
							{
								element.click();
								break;
							}

							System.out.println("valur from drop is"+innerhtml);

						}
		
	
	}

}
