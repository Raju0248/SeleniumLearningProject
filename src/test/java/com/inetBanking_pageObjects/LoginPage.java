package com.inetBanking_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver;

public LoginPage(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}

@FindBy(name="uid")
WebElement textUserName;

@FindBy(name="password")
WebElement textpassword;

@FindBy(name="btnLogin")
WebElement btnLogin;

@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
@CacheLookup
WebElement lnkLogout;

public void setUserName(String uname) {
	
	textUserName.sendKeys("uname");	
}
public void setPassword(String pwd) {
	
textpassword.sendKeys("pwd");	
}
public void ClickSubmit() {
btnLogin.click();
}

public void clickLogout() {
lnkLogout.click();
}



}
