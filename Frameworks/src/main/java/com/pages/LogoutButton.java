package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.WebActionUtils;

public class LogoutButton {

WebDriver driver;
	
	WebActionUtils webaction = new WebActionUtils();
	
	@FindBy(xpath="(//li[@class='flat-box waves-effect waves-block'])[22]")
	WebElement logoutbtn;
	
	public LogoutButton(WebDriver  driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToLogoutButton() {
		webaction.clickOnTheElement(driver, logoutbtn);
	}
	
}
