package com.BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksFind {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("http://www.google.co.in/");

List<WebElement> links=driver.findElements(By.tagName("a"));

System.out.println("Total links are "+links.size());

for(int i=0;i<links.size();i++)
{
	
	WebElement ele= links.get(i);
	
	String url=ele.getAttribute("href");
	
	verifyLinkActive(url);
	
}

}

public static void verifyLinkActive(String linkUrl)
{
try 
{
   URL url = new URL(linkUrl);
   
   HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
   
   httpURLConnect.setConnectTimeout(3000);
   
   httpURLConnect.connect();
   
   if(httpURLConnect.getResponseCode()==200)
   {
       System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
    }
  if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
   {
       System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
    }
} catch (Exception e) {
   
}
} 




	
}
