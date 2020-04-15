package com.AuthenticationPOPup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetWeenFrames {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("http://demo.automationtesting.in/Alerts.html");

//Alert with ok button example
driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
Thread.sleep(2000);
//switch to alert box get text
System.out.println(driver.switchTo().alert().getText());
//switch to alert box
driver.switchTo().alert().accept(); // Ok button click close





	}
}
