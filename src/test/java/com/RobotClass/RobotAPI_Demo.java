package com.RobotClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotAPI_Demo {

	static WebDriver driver;
	
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\geckodriver.exe");
		
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("https://www.edureka.co/");
	driver.findElement(By.linkText("Courses")).click();
	
	Robot robot = new Robot();
	Thread.sleep(3000);
	
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	
	System.out.println("a");
  
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	System.out.println("b");
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	System.out.println("c");
	robot.mouseMove(30, 100);
	System.out.println("d");
	
	Thread.sleep(3000);
	driver.quit();
	
}
}
