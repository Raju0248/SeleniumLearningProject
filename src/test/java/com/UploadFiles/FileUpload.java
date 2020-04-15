package com.UploadFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static WebDriver driver;
	
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("https://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	
	driver.findElement(By.xpath("//*[@id='ng-app']/body/div/div[2]/div[1]/input[1]")).click();
	
	Runtime.getRuntime().exec("C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\FileUpload\\file1.exe");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='ng-app']/body/div/div[2]/div[2]/table/tbody/tr/td[5]/button[1]")).click();
	
	Thread.sleep(3000);
	driver.quit();
	
}
}
