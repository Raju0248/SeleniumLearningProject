package com.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	public static void flash(WebElement element, WebDriver driver) {
		
		
		String bgcolor= element.getCssValue("backgroundColor");
		
		for(int i=0; i<500; i++) {
			changeColor("#000000",element,driver); //1
			changeColor(bgcolor,element,driver);//2
		}
			
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("arguments[0].style.backgroundColor= '"+color+"'", element);
		
		try {
			Thread.sleep(30);
			
		}catch(Exception e) {
			
		}
	}
	public static void  drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		String title=js.executeScript("return document.title;").toString();
		
		return title;
	}
	
	public static void  clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("arguments[0].click();",element);
	}
	
	public static void generetAlert(WebDriver driver,String message) {
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("alert('"+ message +" ')");
		
	}
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("history.go(0)");
	}
	
	public static void  scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
	}
	public static void  scrollPageDown( WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	
	
	
	
	
	
	
	
	
}
