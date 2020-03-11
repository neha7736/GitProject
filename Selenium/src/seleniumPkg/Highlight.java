package seleniumPkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Highlight {

public static void main(String []args) throws InterruptedException{

/*	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.get("http://www.google.com");

// Create the  JavascriptExecutor object
 JavascriptExecutor js=(JavascriptExecutor)driver;

// find element using id attribute
WebElement username= driver.findElement(By.xpath("//input[@name='q']")); 

// call the executeScript method
 js.executeScript("arguments[0].setAttribute('style','background: yellow;border: solid 2px red;');", username);

 Thread.sleep(3000);

 driver.quit();*/
	
	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	
	int arr[]= {1,2,3,4,5};

	List<String> filtered = strings.stream().filter(String -> !String.isEmpty()).collect(Collectors.toList());

	      System.out.println("Hello World"+filtered);
	   
	      int n=2;
	      //for right shift
	     /* for(int i=0; i<arr.length;i++) {
	    	  
	    	  for(int j=arr.length;j>=0;j--) {
	    		  arr[i]=arr[j-1];
	    	  }*/
	      
	      for(int i = 0; i < n; i++){    
	            int j, last;    
	            //Stores the last element of array    
	            last = arr[arr.length-1];    
	            
	            for(j = arr.length-1; j > 0; j--){    
	                //Shift element of array by one    
	                arr[j] = arr[j-1];    
	            }    
	            //Last element of array will be added to the start of array.    
	            arr[0] = last;    
	        }    
	        
	        System.out.println();    
	            
	        //Displays resulting array after rotation    
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        }    
	    
	    	  
	      }
	
	    
}
 
