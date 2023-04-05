package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.WebActionUtils;

public class LoginPage {
	WebDriver driver;
	
	WebActionUtils webaction = new WebActionUtils();
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement loginbutton;
	
	public LoginPage(WebDriver  driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterValueToUserName(String name) {	
		webaction.enterTheValue(driver, username, name);
		//System.out.println("username"+name);	
	}
	
	public void enterValueToPassword(String pswd) {	
		webaction.enterTheValue(driver, password, pswd);	
	}
	
	public void clickOnLoginButton()  {
		webaction.clickOnTheElement(driver, loginbutton);
	}
	
	public HomePage login(String username, String password) throws Exception{
		enterValueToUserName("admin");
		enterValueToPassword("password");
		clickOnLoginButton();
		return new HomePage(driver); 
	}
}
	
