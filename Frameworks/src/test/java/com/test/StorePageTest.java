package com.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.StorePage;
import com.utils.ExcelUtils;
import com.utils.WebbrowserUtils;

public class StorePageTest extends AutomationBase {

	ExcelUtils excel;
	WebDriver driver;
	LoginPage login;
	HomePage home;
	StorePage store;
	
	
	WebbrowserUtils webbrowser = new WebbrowserUtils();
	@BeforeMethod
	public void preRun() throws Exception
	{
		excel = new ExcelUtils("testdataframe.xlsx");
		driver = getDriver();
		login = new LoginPage(driver);
		webbrowser.launchUrl(driver, "https://qalegend.com/restaurant/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		home = login.login("admin", "password");
		store = home.navigateToStoresPage();
	}

	@Test(priority=1, enabled=true)
	public void validateMenuIsDisplayedOnStorePage() 
	{
		store.clickOnAddStoreButton();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(store.isAddStoreIsDisplayed(), "Failure messege : Add store is not displayed");
		soft.assertTrue(store.isStoreNameIsDisplayed(), "Failure messege  : Store name is not displayed");
		soft.assertTrue(store.isStoreEmailIsDisplayed(), "Failure mesege : Store email is not displayed");
		soft.assertTrue(store.isStorePhoneIsDisplayed(), "Failure messege : Store phone number is not displayed");
		soft.assertTrue(store.isStoreCountryIsDisplayed(), "Failure messege : Store country is not displayed");
		soft.assertTrue(store.isStoreCityIsDisplayed(), "Failure messege : Store city is not displayed");
		soft.assertTrue(store.isStoreAddressIsDisplayed(), "Failure messege : Store address is not displayed");
		soft.assertTrue(store.isStoreCustomeFooterReceiptIsDisplayed(), "Failure messege : Store customer footer receipt is not displayed");
		soft.assertTrue(store.isCloseButtonIsDisplayed(), "Failure messege : Close button is not displayed");
		soft.assertTrue(store.isSubmitButtonIsDisplayed(), "Failure messege : Submit button is not displayed");
		soft.assertTrue(store.isEditStoreIsDisplayed(), "Failure messege : Edit store button is not displayed");
		soft.assertTrue(store.isDeleteStoreIsDisplayed(), "Failue messege : Delete store button is not displayed");
		//soft.assertTrue(store.isSearchStoreIsDisplayed(), "Failure messege : Search store is not displayed");
	}
	
	@Test(priority=2, enabled=true)
	public void validationToEnterValueToStorePage() throws IOException 
	{	
		store.clickOnAddStoreButton();
		String sname = excel.readStringData("store", 1, 2);
		store.enterStoreName(sname);
		String smail = excel.readStringData("store", 2, 2);
		store.enterStoreEmail(smail);
		String sphone = excel.readStringData("store", 3, 2);
		store.enterStorePhoneNumber(sphone);
		String scountry = excel.readStringData("store", 4, 2);
		store.enterStoreCountryName(scountry);
		String scity = excel.readStringData("store", 5, 2);
		store.enterStoreCityName(scity);
		String saddress = excel.readStringData("store", 6, 2);
		store.enterStoreAddress(saddress);
		String sfooter = excel.readStringData("store", 7, 2);
		store.enterCustomeFooterreceipt(sfooter);
		store.clickOnSubmitButton();
	}
	
	@Test
	public void validateT0EditStoreInStorePage() throws IOException
	{
		store.clickOnEditStoreButton();
		String ename = excel.readStringData("store", 12, 2);
		store.enterStoreName(ename);
		String email = excel.readStringData("store", 13, 2);
		store.enterStoreEmail(email);
		String enumber = excel.readStringData("store", 14, 2);
		store.enterStorePhoneNumber(enumber);
		String ecountry = excel.readStringData("store", 15, 2);
		store.enterStoreCountryName(ecountry);
		String ecity = excel.readStringData("store", 16, 2);
		store.enterStoreCityName(ecity);
		String eaddress = excel.readStringData("store", 17, 2);
		store.enterStoreAddress(eaddress);
		String efooter = excel.readStringData("store", 18, 2);
		store.enterCustomeFooterreceipt(efooter);
		store.clickOnSubmitButton();
	}
	
	public void validationToDeleteTheStoreInStorePage()
	{
		store.clickOnDeleteStoreButton();
	}
}
