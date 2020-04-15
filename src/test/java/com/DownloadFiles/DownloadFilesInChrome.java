package com.DownloadFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFilesInChrome {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("http://demo.automationtesting.in/FileDownload.html");

driver.findElement(By.id("textbox")).sendKeys("Hi, I am Raju.I learned Automation Testing");;
driver.findElement(By.id("createTxt")).click();// generate the text file
driver.findElement(By.id("link-to-download")).click(); // display download

Thread.sleep(3000);

driver.findElement(By.id("pdfbox")).sendKeys("Hi, I am Raju. I learned Automation Testing");
driver.findElement(By.id("createPdf")).click(); // display download link
driver.findElement(By.id("pdf-link-to-download")).click(); //Download the file

//driver.quit();

	}
	
}
