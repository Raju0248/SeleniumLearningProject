package com.DropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownShortList {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Thread.sleep(3000);

driver.get("http://testautomationpractice.blogspot.com/");

WebElement element= driver.findElement(By.id("animals"));

Select s=new Select(element);

List originalList= new ArrayList();
List tempList= new ArrayList();
List<WebElement> options = s.getOptions();
for(WebElement e: options) {
	originalList.add(e.getText());
	tempList.add(e.getText());
}
Thread.sleep(3000);
System.out.println("Original list"+originalList);
System.out.println("--------------------------------");


//tempList=originalList;  // i will change add another list

System.out.println("Before sorting tem list : "+originalList);
System.out.println("Before sorting tem list : "+tempList);
System.out.println("--------------------------------");
Thread.sleep(3000);
Collections.sort(tempList);
System.out.println("After sorting original list: "+originalList);
System.out.println("After sorting temp list: "+tempList);
System.out.println("--------------------------------");

if(originalList==tempList) {
	System.out.println("Dropdown shorted");
}
else {
	System.out.println("Dropdown not sorted");
}

driver.quit();
	}
}
