package com.inetBanking_Testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Tc_BaseClass {
public static WebDriver driver;
public String baseURL="http://demo.guru99.com/v4/";
public String username="mngr252204";
public String password="hUdedum";
public static Logger logger;	
@BeforeClass
public void setup() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();

Logger logger = Logger.getLogger("eBanking");
PropertyConfigurator.configure("log4j.Properties");


	}


	
@AfterClass
public void tearDown() {
driver.quit();
	}
	
	
}
