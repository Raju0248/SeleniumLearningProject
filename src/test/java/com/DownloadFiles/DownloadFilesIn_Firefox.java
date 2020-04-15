package com.DownloadFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFilesIn_Firefox {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\geckodriver.exe");
		
// create browser profile
FirefoxProfile profile = new FirefoxProfile();

profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain"); // set mime type is different
profile.setPreference("browser.download.manager.showWhenStarting", false);

FirefoxOptions options = new FirefoxOptions();
options.setProfile(profile);

WebDriver driver = new FirefoxDriver(options);
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://demo.automationtesting.in/FileDownload.html");

driver.findElement(By.id("textbox")).sendKeys("Hi, I am Raju");

driver.findElement(By.id("createTxt")).click();  
driver.findElement(By.id("link-to-download")).click();

Thread.sleep(3000);
//driver.findElement(By.id("pdfbox")).sendKeys("This is pdf file ");
//driver.findElement(By.id("createPdf")).click();
//driver.findElement(By.id("pdf-link-to-download")).click();


driver.quit();
	}
}
