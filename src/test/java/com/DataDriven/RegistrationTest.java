package com.DataDriven;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Thread.sleep(3000);

driver.get("http://newtours.demoaut.com/mercurysignon.php");

//getting data from excel sheet
FileInputStream file = new FileInputStream("C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\XMLFiles\\RegistrationData.xlsx");

//get the workbook instance for XSL file

XSSFWorkbook workbook = new XSSFWorkbook(file);

//get first sheet from the workbook
XSSFSheet sheet = workbook.getSheet("sheet1"); // give the particular sheet name

int noOfRows = sheet.getLastRowNum();  //row count the sheet
System.out.println("No of Records in the Excel sheet : "+noOfRows);

for(int row=1;row<noOfRows; row++) {
	XSSFRow current_row = sheet.getRow(row);
	
	String FIRST_NAME = current_row.getCell(0).getStringCellValue();
	String LAST_NAME = current_row.getCell(1).getStringCellValue();
	String PHONE = current_row.getCell(2).getStringCellValue();
	String EMAIL = current_row.getCell(3).getStringCellValue();
	String ADDRESS = current_row.getCell(4).getStringCellValue();
	String CITY = current_row.getCell(5).getStringCellValue();
	String STATE = current_row.getCell(6).getStringCellValue();
	String POSTEL_CODE = current_row.getCell(7).getStringCellValue();
	String COUNTRY = current_row.getCell(8).getStringCellValue();
	String USERNAME = current_row.getCell(9).getStringCellValue();
	String PASSWORD = current_row.getCell(10).getStringCellValue();
	
	//Registration process
	driver.findElement(By.linkText("REGISTER")).click();
	
	//Enter content information
	
	 driver.findElement(By.name("firstName")).sendKeys("FIRST_NAME");
	 driver.findElement(By.name("lastName")).sendKeys("LAST_NAME");
	 driver.findElement(By.name("phone")).sendKeys("PHONE");
	 driver.findElement(By.name("userEmail")).sendKeys("EMAIL");
	 
	 // Enter mailing information
	 driver.findElement(By.name("address")).sendKeys("ADDRESS");
	 driver.findElement(By.name("city")).sendKeys("CITY");
	 driver.findElement(By.name("state")).sendKeys("STATE");
	 driver.findElement(By.name("postalcode")).sendKeys("POSTEL_CODE");
	 
	 //country selection
	 Select dropcountry = new Select(driver.findElement(By.name("country")));
	 dropcountry.selectByVisibleText("COUNTRY");
	 
	// Enter user information
	 driver.findElement(By.name("userNmae")).sendKeys("USERNAME");
	 driver.findElement(By.name("password")).sendKeys("PASSWORD");
	 
	 //submitting form
	 driver.findElement(By.name("register")).click();
	 
	 if(driver.getPageSource().contains("Thank you for registration")) {
		 System.out.println("Registration completed for "+row+"record");
	 }
	 else {
		 System.out.println("Registration faild for "+row+"record");
		 
		 
	 }
	 
	
}
System.out.println("Data driven test completed");
file.close();
//driver.close();
driver.quit();


	}
}
