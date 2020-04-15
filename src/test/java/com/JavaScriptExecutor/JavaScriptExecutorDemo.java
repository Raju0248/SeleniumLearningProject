package com.JavaScriptExecutor;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
			
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("http://www.twoplugs.com/");
//	Flashing
//	WebElement joinfree=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
//	JavaScriptUtil.flash(joinfree, driver);
	
	//Drawing border & screenshot
//	JavaScriptUtil.drawBorder(joinfree, driver);
//	
//	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File target = new File("C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Screenshot\\twoplugs.png");
//	FileUtils.copyFile(src, target);
	
	//Capture title of page
	//System.out.println(driver.getTitle());
	
	// other way to write to get the title - javascriptExecutor
//	String title=JavaScriptUtil.getTitleByJS(driver);
//	System.out.println(title);
	
	//clicking on element
//WebElement loginBtn =	driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a"));
//JavaScriptUtil.clickElementByJS(loginBtn, driver);

//create our own alert by using javaScript
//JavaScriptUtil.generetAlert(driver,"you clicked on login button ...");

//Refresh page
//  driver.navigate().refresh();

//JavaScriptUtil.refreshBrowserByJS(driver);

//scrolling down the page by till  find element

//WebElement img = driver.findElement(By.xpath("//*[@id='comment-thumbs']/li[1]/a/img"));
//Thread.sleep(3000);
//JavaScriptUtil.scrollIntoView(img, driver);

	JavaScriptUtil.scrollPageDown(driver);






	Thread.sleep(3000);
	driver.quit();
	}
}
