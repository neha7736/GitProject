package seleniumPkg;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
	public static void captureScreenshot(WebDriver driver , String image) 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		 File source= ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(source, new File("./Screenshots/"+image+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Screenshot captured");
	
	}
}
