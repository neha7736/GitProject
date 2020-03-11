package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SmokeTest {
	public static WebDriver driver; 
	
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		
	//	driver.getWindowHandles();
	   
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Neha");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	
	
}
