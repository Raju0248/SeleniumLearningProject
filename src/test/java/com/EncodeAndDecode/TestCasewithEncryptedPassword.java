package com.EncodeAndDecode;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasewithEncryptedPassword {

static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
			
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("raju0248@gmail.com");
		driver.findElement(By.id("Password")).sendKeys(decodeString("UmFqdUAxMjM="));
		
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")).click();

	}
	static String decodeString(String password) {
		

			byte[] decodedString = Base64.decodeBase64(password);
			return(new String(decodedString));	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}