package com.log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Log4jExample {
	
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
	// Here we need to create logger instance so we need
		
		 // get a logger instance
		Logger logger = Logger.getLogger(Log4jExample.class);
	//	DOMConfigurator.configure("log4j.xml");
		
		//Configure in properties method
		PropertyConfigurator.configure("Log4j.properties");
		
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
								
			driver=new ChromeDriver();
			
			logger.info("browser is open");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("http://newtours.demoaut.com/");
	logger.info("Click on Register link");
	driver.findElement(By.linkText("Register here")).click();
	
	logger.info("Enter contact information");
	
	driver.findElement(By.name("firstName")).sendKeys("Raju");
	driver.findElement(By.name("lastName")).sendKeys("k");
	driver.findElement(By.name("phone")).sendKeys("7090846422");
	driver.findElement(By.name("userName")).sendKeys("Raju@gmail.com");
	driver.findElement(By.name("address1")).sendKeys("Btm Layout");
	driver.findElement(By.name("address2")).sendKeys("Bangalore");
	driver.findElement(By.name("city")).sendKeys("Bangalore");
	
	driver.findElement(By.name("state")).sendKeys("Karnataka");
	driver.findElement(By.name("postalCode")).sendKeys("560008");
	
	logger.info("select the country");
	Select dropdown = new Select(driver.findElement(By.name("country")));
	dropdown.selectByVisibleText("INDIA");
	
	logger.info("Enter user information");
	
	driver.findElement(By.name("email")).sendKeys("raju0248");
	driver.findElement(By.name("password")).sendKeys("raju@0248");
	driver.findElement(By.name("confirmPassword")).sendKeys("raju@0248");
	
	logger.info("click the submit button");
	Thread.sleep(5000);
	driver.findElement(By.name("register")).click();
	Thread.sleep(3000);
	logger.info("validation started");
	
	if(driver.getPageSource().contains("Thank you for registration")) {
		System.out.println("your registration is successful");
		logger.info("validation is done");
		Thread.sleep(3000);
	}
	else {
		System.out.println("your registration is faild");
		logger.info("validation is done");
	}
	Thread.sleep(3000);
	logger.info("Exit test");
	Thread.sleep(3000);
	driver.quit();
	
	
	
	}
}