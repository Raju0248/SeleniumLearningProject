package com.AuthenticationPOPup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPups_in_Selenium {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//driver.get("https://the-internet.herokuapp.com/basic_auth");
driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
Thread.sleep(3000);
String text = driver.findElement(By.cssSelector("p")).getText();
System.out.println(text);

Thread.sleep(3000);
driver.quit(); 


	}
}
