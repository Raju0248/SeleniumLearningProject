package com.PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistationTest {
static WebDriver driver;
	@Test
	public void verifyFlightReg() {
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
						
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	RegistrationPage RGPage = new RegistrationPage(driver);
	
	driver.get("http://www.newtours.demoaut.com/");
	RGPage.clickRegLink();
	RGPage.setFirstName("Raju");
	RGPage.setLastName("kunchala");
	RGPage.setPhone("123456679");
	
					
	RGPage.setClick();		
	
	//Validation 
	if(driver.getPageSource().contains("Thank you for registration")) {
		System.out.println("your registration is completed successful");
	}
	else {
		System.out.println("your registration is faild");
	}
	driver.quit();
	
					
					
					
	}
}
