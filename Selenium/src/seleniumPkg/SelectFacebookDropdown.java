package seleniumPkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class SelectFacebookDropdown {
public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver","E:\\\\New folder\\\\selenium\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
	//	driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		/*WebElement account = driver.findElement(By.xpath("//div[@class='_2aUbKa']"));
		Select select_acc = new Select(account);
		select_acc.selectByIndex(1);
		
		//http://newtours.demoaut.com/
		 //paswd: tutorial
		  //sigin
		   //https://compendiumdev.co.uk/basic_html_form.html, second checkbox, seconf radio button, submit
		
		Thread.sleep(3000);
		select_acc.selectByValue("2");
		Thread.sleep(3000);*/
		//select_acc.deselectByVisibleText("Rewards");
		
		driver.navigate().to("https://www.deal4loans.com/apply-home-loans.php");
		WebElement elem = driver.findElement(By.id("City"));
		Select select_acc = new Select(elem);
		select_acc.selectByIndex(5);
		System.out.println("title is "+driver.getTitle());
		
		
	}

}
