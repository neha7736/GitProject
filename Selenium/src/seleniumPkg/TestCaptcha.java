package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaptcha {

	public static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\chromedriver_win\\chromedriver.exe");

	    driver = new ChromeDriver();
		
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		int result = 0 ;
		driver.manage().window().maximize();
		String captchString = driver.findElement(By.xpath("//td//span[@id='mathq2']")).getText();
		String firstnum= captchString.substring(0, 1);
		int firsttoadd = Integer.parseInt(firstnum);
		String operator = captchString.substring(2, 3);
		//int ope = Integer.parseInt(operator);
		String secondnum = captchString.substring(4, 5);
		int secondtoadd = Integer.parseInt(secondnum);
		if(operator.equalsIgnoreCase("+")) {
		 result = firsttoadd +  secondtoadd;
		}
		else
			if(operator.equalsIgnoreCase("-")) {
				 result = firsttoadd -  secondtoadd;
		}
		
			else
				if(operator.equalsIgnoreCase("*")) {
					 result = firsttoadd *  secondtoadd;
			}
		String res = String.valueOf(result);
		driver.findElement(By.xpath("//td//input[@id='mathuserans2']")).sendKeys(res);
		System.out.println("captchString"+captchString);
		System.out.println("firstnum :: "+firstnum+ " "+ "operator ::"+operator +" "+"second num :: "+secondnum);
		Thread.sleep(3000);

}
}
