package com.DataDriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingDataFromExcel {
@Test
public static void mains() throws Exception {
	
	FileInputStream file = new FileInputStream("C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\XMLFiles\\data.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	//XSSFSheet sheet = workbook.getSheetAt(0); // proved the sheet index
	
	XSSFSheet sheet = workbook.getSheet("sheet1"); // give the particular sheet name
	
	int rowCount = sheet.getLastRowNum();  //row count the sheet
	
	int colCount= sheet.getRow(0).getLastCellNum();
	
	for(int i=0;i<rowCount;i++) {
	XSSFRow currentrow =	sheet.getRow(i);   // Focused on current row
		for(int j=0;j<colCount;j++) {
		String	value = currentrow.getCell(j).toString();
		System.out.print(" 		 "+value);
		
		}
		System.out.println(" ");
		
	}
	workbook.close();
	
}
}
