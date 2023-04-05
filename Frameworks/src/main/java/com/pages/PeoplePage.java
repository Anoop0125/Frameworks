package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.WebActionUtils;
import com.utils.WebbrowserUtils;

public class PeoplePage {

WebDriver driver;
	
	WebActionUtils webaction = new WebActionUtils();
	WebbrowserUtils webbrowser = new WebbrowserUtils();
	
	@FindBy(xpath="//span[text()='Waiters']")
	WebElement peoplewaiter;
	
	@FindBy(xpath="//span[text()='Customers']")
	WebElement peoplecustomer;
	
	@FindBy(xpath="//span[text()='Suppliers']")
	WebElement peoplesuppliers;
	
	@FindBy(xpath="//button[@class='btn btn-add btn-lg']")
	WebElement addwaiterbtn;
	
	@FindBy(xpath="//input[@id='WaiterName']")
	WebElement waitername;
	
	@FindBy(xpath="//input[@id='WaiterPhone']")
	WebElement waiterphone;
	
	@FindBy(xpath="//input[@id='WaiterEmail']")
	WebElement waiteremail;
	
	@FindBy(xpath="//select[@id='WaiterStore']")
	WebElement waiterstore;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement closebtn;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitbtn;
	
	@FindBy(xpath="//button[@class='btn btn-add btn-lg']")
	WebElement addcustomer;
	
	@FindBy(xpath="//input[@id='CustomerName']")
	WebElement customername;
	
	@FindBy(xpath="//input[@id='CustomerPhone']")
	WebElement customerphone;
	
	@FindBy(xpath="//input[@id='CustomerEmail']")
	WebElement customeremail;
	
	@FindBy(xpath="//input[@id='CustomerDiscount']")
	WebElement customerdiscount;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement customerclosebtn;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement customersubmitbtn;
	
	@FindBy(xpath="//button[@class='btn btn-add btn-lg']")
	WebElement addsupplier;
	
	@FindBy(xpath="//input[@id='SupplierName']")
	WebElement suppliername;
	
	@FindBy(xpath="//input[@id='SupplierPhone']")
	WebElement supplierphone;
	
	@FindBy(xpath="//input[@id='SupplierEmail']")
	WebElement supplieremail;	
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement supplierclosebtn;	
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement suppliersubmitbtn;	
	
	public PeoplePage(WebDriver  driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isPeopleWaiterIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, peoplewaiter);
		return flag;
	}
	
	public boolean isPeopleCustomerIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, peoplecustomer);
		return flag;
	}
	
	public boolean isPeopleSupplierIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, peoplesuppliers);
		return flag;
	}
	
	public void clickOnWaiterPeople() {
		webaction.clickOnTheElement(driver, peoplewaiter);
		//webbrowser.navigateToPreviousPage(driver);
	}
	
	public void clickOnAddWaiterButton() {
		webaction.clickOnTheElement(driver, addwaiterbtn);
	}
	
	public boolean isWaiterNameIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, waitername);
		return flag;
	}
	
	public boolean isWaiterPhoneIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, waiterphone);
		return flag;
	}
	
	public boolean isWaiterEmailIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, waiteremail);
		return flag;
	}
	
	public boolean isWaiterStoreIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, waiterstore);
		return flag;
	}
	
	public boolean isWaiterCloseBtnIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, closebtn);
		return flag;
	}
	
	public boolean isWaiterSubmitBtnIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, submitbtn);
		return flag;
	}
	
	public void clickOnCustomerPeople()  {
		webaction.clickOnTheElement(driver, peoplecustomer);
		//webbrowser.navigateToPreviousPage(driver);
	}
	
	public void clickOnAddCustomerButton() {
		webaction.clickOnTheElement(driver, addcustomer);
	}
	
	public boolean isCustomerNameISDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, customername);
		return flag;
	}
	
	public boolean isCustomerPhoneISDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, customerphone);
		return flag;
	}
	
	public boolean isCustomerEmailISDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, customeremail);
		return flag;
	}
	
	public boolean isCustomerDiscountISDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, customerdiscount);
		return flag;
	}
	
	public boolean isCustomerCloseBtnISDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, customerclosebtn);
		return flag;
	}
	
	public boolean isCustomerSubmitBtnISDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, customersubmitbtn);
		return flag;
	}
	
	public void clickOnSupplierPeople() {
		webaction.clickOnTheElement(driver, peoplesuppliers);
	}
	
	public void clickOnAddSupplierButton() {
		webaction.clickOnTheElement(driver, addsupplier);
	}
	
	public boolean isSupplierNameIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, suppliername);
		return flag;
	}
	
	public boolean isSupplierPhoneIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, supplierphone);
		return flag;
	}
	
	public boolean isSupplierEmailIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, supplieremail);
		return flag;
	}
	
	public boolean isSupplierCloseBtnIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, supplierclosebtn);
		return flag;
	}
	
	public boolean isSupplierSubmitBtnIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, suppliersubmitbtn);
		return flag;
	}
	
	public void enterValueInWaiterName(String wname) {
		webaction.enterTheValue(driver, waitername, wname);
	}
	
	public void enterValueInWaiterPhone(String wphone) {
		webaction.enterTheValue(driver, waiterphone, wphone);
	}
	
	public void enterValueInWaiterEmail(String wemail) {
		webaction.enterTheValue(driver, waiteremail, wemail);
	}
	
	public void enterValueInWaiterStore(String wstore) {
		webaction.enterTheValue(driver, waiterstore, wstore);
	}
	
	public void enterValueInCustomerName(String cname) {
		webaction.enterTheValue(driver, customername, cname);
	}
	
	public void enterValueInCustomerPhone(String cphone) {
		webaction.enterTheValue(driver, customerphone, cphone);
	}
	
	public void enterValueInCustomerEmail(String cemail) {
		webaction.enterTheValue(driver, customeremail, cemail);
	}
	
	public void enterValueInCustomerDsicount(String cdiscount) {
		webaction.enterTheValue(driver, customerdiscount, cdiscount);
	}
	
	public void enterValueInSupplierName(String sname) {
		webaction.enterTheValue(driver, suppliername, sname);
	}
	
	public void enterValueInSupplierPhone(String sphone) {
		webaction.enterTheValue(driver, supplierphone, sphone);
	}
	
	public void enterValueInSupplierEmail(String semail) {
		webaction.enterTheValue(driver, supplieremail, semail);
	}
	
	public void clickOnWaiterSubmitBtn() {
		webaction.clickOnTheElement(driver, submitbtn);
	}
	
	public void clickOnCustomerSubmitBtn() {
		webaction.clickOnTheElement(driver, customersubmitbtn);
	}
	
	public void clickOnSupplierSubmitBtn() {
		webaction.clickOnTheElement(driver, suppliersubmitbtn);
	}
}
