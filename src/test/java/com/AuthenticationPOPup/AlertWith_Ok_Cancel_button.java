package com.AuthenticationPOPup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWith_Ok_Cancel_button {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("http://demo.automationtesting.in/Alerts.html");

driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();

driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();

Thread.sleep(3000);
System.out.println(driver.switchTo().alert().getText());

String ExpText="you pressed ok";
String ExpText2="you press cancel";
driver.switchTo().alert().accept();

String ActsText=driver.findElement(By.xpath("//div//div//div//div//div//div[2]//p[1]")).getText();
Thread.sleep(3000);
if(ExpText.equals(ActsText)==true) {
	System.out.println(ActsText);
}

//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
//driver.switchTo().alert().dismiss();
// ActsText=driver.findElement(By.xpath("//div//div//div//div//div//div[2]//p[1]")).getText();
//Thread.sleep(3000);
//if(ExpText2.equals(ActsText)==true) {
//	System.out.println(ActsText);
//}

Thread.sleep(3000);
driver.quit();


	}
}
