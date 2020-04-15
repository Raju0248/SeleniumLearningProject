package com.inetBanking_Testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking_pageObjects.LoginPage;

public class TC_LoginTest_001 extends Tc_BaseClass {
	
@Test
public void loginTest() throws Exception {	
driver.get(baseURL);
logger.info("URL is opened");
Thread.sleep(3000);

LoginPage lp= new LoginPage(driver);

lp.setUserName("username");
logger.info("Enter userName");
Thread.sleep(3000);
lp.setPassword("password");
logger.info("Enter password");
Thread.sleep(3000);
lp.ClickSubmit();
Thread.sleep(3000);
if(driver.getTitle().equals(" Guru99 Bank Home Page ")) {
Assert.assertTrue(true);
logger.info("Login test passed");
Thread.sleep(3000);
}
else {
	Assert.assertTrue(false);
	logger.info("Login test faild");
	Thread.sleep(3000);
}
Alert alert =driver.switchTo().alert();
String alertText = alert.getText();
System.out.println("Alert data: " + alertText);
alert.accept();
}



}
