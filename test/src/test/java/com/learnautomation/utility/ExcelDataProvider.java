/*package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelDataProvider {
	XSSFWorkbook wb;
	
	public ExcelDataProvider(){
	
	File file= new File("E:\\hibernateWork\\SelTest\\test\\TestData\\login.xlsx");
	try {
		FileInputStream input = new FileInputStream(file);
		wb = new XSSFWorkbook(input);
		} catch (IOException e) {
			 System.out.println("Unable to read excel file"+e.getMessage());
			e.printStackTrace();
		}				
	}
	
	public String getStringData(int sheetIndex,int row,int col)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
				
	}
	
	public String getStringData(String sheetname,int row,int col)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
				
	}
	
	public Double getNumericData(String sheetname)
	{
		return wb.getSheetName(sheetname);
	}
}
*/