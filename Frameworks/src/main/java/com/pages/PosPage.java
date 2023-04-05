package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.WebActionUtils;

public class PosPage {

WebDriver driver;
	
	WebActionUtils webaction = new WebActionUtils();
	
	@FindBy(xpath="(//li[@class='listing clearfix'])[1]")
	WebElement store;
	
	@FindBy(xpath="//input[@id='CashinHando']")
	WebElement cashinhand;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement closebtn;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitbtn;
	
	public PosPage(WebDriver  driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTheStore() {
		webaction.clickOnTheElement(driver, store);
	}	
	
	public boolean isCashinHandisDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, cashinhand);
		return flag;
	}
	
	public boolean isCloseButtonIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, closebtn);
		return flag;
	}
	
	public boolean isSubmitButtonIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, submitbtn);
		return flag;
	}
	
	public void enterValueOnCashInHand(String cash) {
		webaction.enterTheValue(driver, cashinhand, cash);
	}	
	
	public void clickOnSubmitButton() {
		webaction.clickOnTheElement(driver, submitbtn);
	}
}

	
