package com.DataDriven;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalculationTest {
	static WebDriver driver;
	@Test
	public static void mains() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Thread.sleep(3000);
		FileInputStream file = new FileInputStream("C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\XMLFiles\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		//XSSFSheet sheet = workbook.getSheetAt(0); // proved the sheet index
		
		XSSFSheet sheet = workbook.getSheet("BankingData"); // give the particular sheet name
		
		int rowCount = sheet.getLastRowNum();  //row count the sheet
	
		for(int i=1; i<rowCount;i++) {
			XSSFRow row=sheet.getRow(i);
			//String var = row.getCell(0).getStringCellValue();    // this two type write
			
			int princ =(int)row.getCell(0).getNumericCellValue();// write one statement
			
			
//			XSSFCell princeplecell=row.getCell(0);
//			int princ=(int)princeplecell.getNumericCellValue();   
			
			
			XSSFCell roi=row.getCell(1);
			int rateofinterest=(int)roi.getNumericCellValue();
			
			XSSFCell period=row.getCell(0);
			int per=(int)period.getNumericCellValue();
			
			XSSFCell Frequenecy=row.getCell(0);
			int freq=(int)Frequenecy.getNumericCellValue();
			
			XSSFCell MaturityValue=row.getCell(0);
			int Exp_mvalue=(int)MaturityValue.getNumericCellValue();
			
			
			
		}
		
		
	}
}
