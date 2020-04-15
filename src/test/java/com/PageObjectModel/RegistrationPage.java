package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="REGISTER")
	WebElement RegLink;
	
	@FindBy(how=How.NAME, using="firstName")   // syntax-1
	WebElement FirstName;
	
//	@FindBy(name="firstName")
//	WebElement FirstName;       // syntax-2
	
	
	@FindBy(name="lastName")
	WebElement LastName; 	
	
	@FindBy(name="phone")
	WebElement phone; 	
	
	@FindBy(name="userName")
	WebElement email; 
	
	@FindBy(name="register")
	WebElement registerBtn; 
	
	RegistrationPage(WebDriver d){
		//this.driver=driver;
		
		driver=d;
		PageFactory.initElements(d, this); // additional method
	}
	
	
	public void clickRegLink() {
		RegLink.click();	
	}
	
	public void setFirstName(String fname) {
		FirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		LastName.sendKeys(lname);
	}
	
	public void setPhone(String ph) {
		phone.sendKeys(ph);
	}
	
	
	
	public void setClick() {
		registerBtn.click();
	}
	
	
	
	
}
