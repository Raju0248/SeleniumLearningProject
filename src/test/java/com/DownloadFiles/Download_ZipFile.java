package com.DownloadFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Download_ZipFile {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\geckodriver.exe");
		
// create browser profile
FirefoxProfile profile = new FirefoxProfile();

profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip"); // set mime type is different
profile.setPreference("browser.download.manager.showWhenStarting", false);

FirefoxOptions options = new FirefoxOptions();
options.setProfile(profile);

WebDriver driver = new FirefoxDriver(options);
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("http://testingmasters.com/student-corner/downloads/");
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[2]/a")).click();
Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[4]/a")).click();

driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[2]/a")).click();





	}
}
