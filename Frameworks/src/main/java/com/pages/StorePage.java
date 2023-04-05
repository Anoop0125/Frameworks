package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.WebActionUtils;
import com.utils.WebElementUtils;

public class StorePage {

WebDriver driver;
	
	WebActionUtils webaction = new WebActionUtils();
	WebElementUtils webelement = new WebElementUtils();
	
	@FindBy(xpath="//button[@class='btn btn-add btn-lg']")
	WebElement addstorebtn;
	
	@FindBy(xpath="//input[@id='StoreName']")		
	WebElement storename;
	
	@FindBy(xpath="//input[@id='email']")		
	WebElement store_email;
	
	@FindBy(xpath="//input[@id='StorePhone']")		
	WebElement store_phone;
	
	@FindBy(xpath="//input[@id='Country']")		
	WebElement store_country;
	
	@FindBy(xpath="//input[@id='City']")		
	WebElement store_city;
	
	@FindBy(xpath="//input[@id='Adresse']")		
	WebElement store_address;
	
	@FindBy(xpath="//input[@id='CustomeFooter']")		
	WebElement store_customefooterreceipt;
	
	@FindBy(xpath="//button[text()='Close']")		
	WebElement closebutton;
	
	@FindBy(xpath="//button[text()='Submit']")		
	WebElement submitbutton;
	
	@FindBy(xpath="(//a[@class='btn btn-default'])[2]")
	WebElement editstorebtn;
	
	@FindBy(xpath="(//a[@class='btn btn-default'])[1]")		
	WebElement deletestorebtn;
	
	//@FindBy(xpath="//input[@class='form-control input-sm']")		
	//WebElement searchstore;
	
	public StorePage(WebDriver  driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isAddStoreIsDisplayed() {	
		boolean flag =  webaction.checkElementisDisplayed(driver, addstorebtn);
		return flag;
	}
	
	public boolean isStoreNameIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, storename);
		return flag;
	}
	
	public boolean isStoreEmailIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, store_email);
		return flag;
	}
	
	public boolean isStorePhoneIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, store_phone);
		return flag;
	}
	
	public boolean isStoreCountryIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, store_country);
		return flag;
	}
	
	public boolean isStoreCityIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, store_city);
		return flag;
	}
	
	public boolean isStoreAddressIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, store_address);
		return flag;
	}
	
	public boolean isStoreCustomeFooterReceiptIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, store_customefooterreceipt);
		return flag;
	}
	
	public boolean isCloseButtonIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, closebutton);
		return flag;
	}
	
	public boolean isSubmitButtonIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, submitbutton);
		return flag;
	}
	
	public boolean isEditStoreIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, editstorebtn);
		return flag;
	}
	
	public boolean isDeleteStoreIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, deletestorebtn);
		return flag;
	}
	
	/*public boolean isSearchStoreIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, searchstore);
		return flag;
	}*/
	
	public void clickOnAddStoreButton() {
		webaction.clearTheElement(driver, addstorebtn);
	}
	
	public void enterStoreName(String name) {
		webaction.enterTheValue(driver, storename, name);
	}
	
	public void enterStoreEmail(String email) {
		webaction.enterTheValue(driver, store_email, email);
	}
	
	public void enterStorePhoneNumber(String phone) {
		webaction.enterTheValue(driver, store_phone, phone);
	}
	
	public void enterStoreCountryName(String country) {
		webaction.enterTheValue(driver, store_country, country);
	}
	
	public void enterStoreCityName(String city) {
		webaction.enterTheValue(driver, store_city, city);
	}
	
	public void enterStoreAddress(String address) {
		webaction.enterTheValue(driver, store_address, address);
	}
	
	public void enterCustomeFooterreceipt(String footer) {
		webaction.enterTheValue(driver, store_customefooterreceipt, footer);
	}
	
	public void clickOnEditStoreButton() {
		webaction.clearTheElement(driver, editstorebtn);
	}
	
	public void clickOnDeleteStoreButton() {
		webaction.clickOnTheElement(driver, deletestorebtn);
	}
	
	/*public void toSearchStore(String name) {
		webaction.enterTheValue(driver, searchstore, name);
	}*/
	
	public void clickOnSubmitButton() {
		webaction.clickOnTheElement(driver, submitbutton);
	}
	
	/*public String getStoreName() {
		return webaction.getTheElementText(driver, addstorebtn);
	}*/
}
