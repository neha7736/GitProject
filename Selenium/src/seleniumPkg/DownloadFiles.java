package seleniumPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
 
 
public class DownloadFiles {
 
public static void main(String[] args) {
  
// Create a profile
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win\\chromedriver.exe");

	Map prefsMap = new HashMap();
	prefsMap.put("profile.default_content_settings.popups", 0);
	prefsMap.put("browser.helperApps.neverAsk.openFile", "application/octet-stream");
	ChromeOptions option = new ChromeOptions();
	option.setExperimentalOption("prefs", prefsMap);
	WebDriver driver = new ChromeDriver(option);
 
  
// Set implicit wait
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
// Maximize window
driver.manage().window().maximize();
  
// Open APP to download application
driver.get("http://www.filehippo.com/download_adobe_reader");
  
// Click on download 
driver.findElement(By.xpath(".//*[@id='program-header']/div[4]/a[1]")).click();
    
 }
 
}