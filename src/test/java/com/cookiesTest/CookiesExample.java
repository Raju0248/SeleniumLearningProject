package com.cookiesTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
			
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("http://www.amazon.in/");
	
	Set<Cookie> cookies = driver.manage().getCookies(); // capture all the cookies in browser
	System.out.println("size of the cookies : "+cookies.size());
	
//	for(Cookie cookie:cookies) {   // read and print all the cookies
//		System.out.println(cookie.getName()+" : "+cookie.getValue());
//	}
	
  //    System.out.println(driver.manage().getCookieNamed("session-id-time"));
	
	Cookie cookieObj = new Cookie("mycookie123","12345");
	driver.manage().addCookie(cookieObj);
	cookies=driver.manage().getCookies();
	System.out.println("size of the cookies : "+cookies.size());
	
	for(Cookie cookie:cookies) {   // read and print all the cookies
		System.out.println(cookie.getName()+" : "+cookie.getValue());
	}
	
	
	driver.manage().deleteAllCookies();
	
	
	
	
	
	
	
	Thread.sleep(2000);
		driver.quit();
		
	}
}
