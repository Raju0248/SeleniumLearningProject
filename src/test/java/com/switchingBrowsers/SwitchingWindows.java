package com.switchingBrowsers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Thread.sleep(3000);

driver.get("http://demo.automationtesting.in/Windows.html");
driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();

driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();

//System.out.println(driver.getTitle());

Set<String> s=driver.getWindowHandles();
for(String i:s) {
	String title=driver.switchTo().window(i).getTitle();
	System.out.println(title);
	
	if(title.contains("Sakinalium | Home")) {
		driver.close();
	}
}

Thread.sleep(3000);
driver.quit();
	}
}
