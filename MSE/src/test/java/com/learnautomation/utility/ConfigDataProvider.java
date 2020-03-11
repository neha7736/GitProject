package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigDataProvider {

		Properties pro;
		
		public ConfigDataProvider() {
		
		File file= new File("./Config/Config.properties");
		try {
			FileInputStream input = new FileInputStream(file);
			pro= new Properties();
			pro.load(input);
		}
			 catch (IOException e) {
				 System.out.println("Unable to read config file"+e.getMessage());
				e.printStackTrace();
			}
								
		}
		
		public String getDataFromConfig(String keytosearch)
		{
			return pro.getProperty(keytosearch);
					
		}
		
		public String getBrowser()
		{
			return pro.getProperty("Browser");
					
		}
		
		public String getStagingUrl()
		{
			return pro.getProperty("qaUrl");
					
		}
}
