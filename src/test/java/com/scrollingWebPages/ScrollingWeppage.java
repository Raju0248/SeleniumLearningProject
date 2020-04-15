package com.scrollingWebPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWeppage {
static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
			
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("http://www.amazon.in/");
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	// 1.scrolling by using pixel
	//js.executeScript("window.scrollBy(0,1000)", "");
	
	//2.scrolling page till we find element
	
//	WebElement target=driver.findElement(By.xpath("//*[@id=\"navBackToTop\"]/div/span"));
//	js.executeScript("arguments[0].scrollIntoView();", target);
//	
	//3.scrolling page till bottom
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	Thread.sleep(4000);
	driver.quit();
	
	
	}
}
