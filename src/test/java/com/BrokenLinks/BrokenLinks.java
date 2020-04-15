package com.BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("http://newtours.demoaut.com/");

Thread.sleep(3000);

//all the links in application
List<WebElement> links = (List<WebElement>) driver.findElements(By.tagName("a"));

//number of links
System.out.println(links.size());
Thread.sleep(3000);
for(int i=0;i< links.size();i++) {
	//by using href attribute we can get URL of required links
	WebElement element = links.get(i);
	String url=element.getAttribute("href");

	URL link= new URL(url);
	
	//creating a connection using URL object 'links'
	HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
	
	Thread.sleep(3000);
	//establish connection
	httpConn.connect();
	
	int resCode=httpConn.getResponseCode(); // return response code if res code is 404:broken links
	
	if(resCode>=400) {
		System.out.println(url+" - "+"broken links");
		Thread.sleep(3000);
	}
	else {
		System.out.println(url+" - "+"is valid links");
	}
	
	
	
}


Thread.sleep(3000);
driver.quit();
	}
}
