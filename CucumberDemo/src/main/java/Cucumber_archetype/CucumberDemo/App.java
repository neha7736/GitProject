package Cucumber_archetype.CucumberDemo;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
	static String s;
	 static String exp;
	 
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
       
  
      
        String s1="Welcome to Noida";
        String exp="";
      
        	String array[]=s1.split(" ");
        	for(int i=array.length;i>0;i--) {
        		//System.out.println(array[i-1]);
        		
        		exp+=""+array[i-1]+" ";
                		      
        	}
 
        
    System.out.println("expected string is  :"+ exp);
    }
    }

