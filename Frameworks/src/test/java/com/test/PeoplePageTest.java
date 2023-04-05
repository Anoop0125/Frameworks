package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.PeoplePage;
import com.utils.ExcelUtils;
import com.utils.WebbrowserUtils;

public class PeoplePageTest extends AutomationBase{

	ExcelUtils excel;
	WebDriver driver;
	LoginPage login;
	HomePage home;
	PeoplePage people;
	
	WebbrowserUtils webbrowser = new WebbrowserUtils();
	@BeforeMethod
	public void preRun() throws Exception
	{
		excel = new ExcelUtils("testdataframe.xlsx");
		driver = getDriver();
		login = new LoginPage(driver);
		webbrowser.launchUrl(driver, "https://qalegend.com/restaurant/login");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		home = login.login("admin", "password");
		people = home.navigateToPeoplePage();
	}
	
	@Test(priority=1, enabled=true)
	public void validateMenuIsDisplayedOnPeoplePage() 
	{
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(people.isPeopleWaiterIsDisplayed(), "Failure messege : Waiter is not displayed");
		soft.assertTrue(people.isPeopleCustomerIsDisplayed(), "Failure messege : Customer is not displayed");
		soft.assertTrue(people.isPeopleSupplierIsDisplayed(), "Failure messege : Supplier is ot displayed");
	}
	
	@Test(priority=2, enabled=true)
	public void validateElementIsDisplayedInAddWaiter() 
	{
		people.clickOnWaiterPeople();
		people.clickOnAddWaiterButton();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(people.isWaiterNameIsDisplayed(), "Failure messege : Waiter Name is not displayed");
		soft.assertTrue(people.isWaiterPhoneIsDisplayed(), "Failure messege : Waiter Phone is not displayed");
		soft.assertTrue(people.isWaiterEmailIsDisplayed(), "Failure messege : Waiter Email is not displayed");
		soft.assertTrue(people.isWaiterStoreIsDisplayed(), "Failure messege : Waiter Store is not displayed");
		soft.assertTrue(people.isWaiterCloseBtnIsDisplayed(), "Failure messege : Waiter Close Btn is not displayed");
		soft.assertTrue(people.isWaiterSubmitBtnIsDisplayed(), "Failure messege : Waiter Submit Btn is not displayed");
		soft.assertAll();
	}
	
	@Test(priority=4, enabled=true)
	public void validateElementIsDisplayedInAddCustomer()  
	{
		people.clickOnCustomerPeople();
		people.clickOnAddCustomerButton();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(people.isCustomerNameISDisplayed(), "Failure messege : Customer name is not displayed");
		soft.assertTrue(people.isCustomerPhoneISDisplayed(), "Failure messege : Customer Phone is not displayed");
		soft.assertTrue(people.isCustomerEmailISDisplayed(), "Failure messege : Customer Email is not displayed");
		soft.assertTrue(people.isCustomerDiscountISDisplayed(), "Failure messege : Customer Discount is not displayed");
		soft.assertTrue(people.isCustomerCloseBtnISDisplayed(), "Failure messege : Customer Close Btn is not displayed");
		soft.assertTrue(people.isCustomerSubmitBtnISDisplayed(), "Failure messege : Customer Submit Btn is not displayed");
		soft.assertAll();
	}
	
	@Test(priority=6, enabled=true)
	public void validateElementIsDisplayedInAddSupplier()  
	{
		people.clickOnSupplierPeople();
		people.clickOnAddSupplierButton();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(people.isSupplierNameIsDisplayed(), "Failure messege : Supplier Name is not displayed");
		soft.assertTrue(people.isSupplierPhoneIsDisplayed(), "Failure messege : Supplier Phone is not displayed");
		soft.assertTrue(people.isSupplierEmailIsDisplayed(), "Failure messege : Supplier Email is not displayed");
		soft.assertTrue(people.isSupplierCloseBtnIsDisplayed(), "Failure messege : Supplier Close Btn is not displayed");
		soft.assertTrue(people.isSupplierSubmitBtnIsDisplayed(), "Failure messege : Supplier Submit Btn is not displayed");
		soft.assertAll();
	}
	
	@Test(priority=3, enabled=true)
	public void validateToEnterValueInAddWaiter() throws IOException {
		String wname = excel.readStringData("people", 1, 2);
		people.enterValueInWaiterName(wname);
		String wphone = excel.readStringData("people", 2, 2);
		people.enterValueInWaiterPhone(wphone);
		String wmail = excel.readStringData("people", 3, 2);
		people.enterValueInWaiterEmail(wmail);
		String wstore = excel.readStringData("people", 4, 2);
		people.enterValueInWaiterStore(wstore);
		people.clickOnWaiterSubmitBtn();
	}
	
	@Test(priority=5, enabled=true)
	public void validateValueInAddCustomer() throws IOException {
		String cname = excel.readStringData("people", 6, 2);
		people.enterValueInCustomerName(cname);
		String cphone = excel.readStringData("people", 7, 2);
		people.enterValueInCustomerPhone(cphone);
		String cmail = excel.readStringData("people", 8, 2);
		people.enterValueInCustomerEmail(cmail);
		String cdiscount = excel.readStringData("people", 9, 2);
		people.enterValueInCustomerDsicount(cdiscount);
		people.clickOnCustomerSubmitBtn();
	}
	
	@Test(priority=7, enabled=true)
	public void validateValueInAddSupplier() throws IOException {
		String sname = excel.readStringData("people", 11, 2);
		people.enterValueInSupplierName(sname);
		String sphone = excel.readStringData("people", 12, 2);
		people.enterValueInSupplierPhone(sphone);
		String smail = excel.readStringData("people", 13, 2);
		people.enterValueInSupplierEmail(smail);
		people.clickOnSupplierSubmitBtn();
	}
}
