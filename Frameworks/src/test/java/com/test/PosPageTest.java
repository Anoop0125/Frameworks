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
import com.pages.PosPage;
import com.utils.ExcelUtils;
import com.utils.WebbrowserUtils;

public class PosPageTest extends AutomationBase {
	
	ExcelUtils excel;
	WebDriver driver;
	LoginPage login;
	HomePage home;
	PosPage ppage;
	
	WebbrowserUtils webbrowser = new WebbrowserUtils();
	@BeforeMethod
	public void preRun() throws Exception{
		excel = new ExcelUtils("testdataframe.xlsx");
		driver=getDriver();
		login = new LoginPage(driver);
		webbrowser.launchUrl(driver, "https://qalegend.com/restaurant/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		home = login.login("admin", "password");
		ppage = home.navigateToPosPage();
	}
	
	@Test(priority=1, enabled=true)
	public void validateMenuIsDisplayedOnPosPage() {	
		ppage.clickOnTheStore();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(ppage.isCashinHandisDisplayed(), "Failure messege : Cash in hand is not displayed");
		soft.assertTrue(ppage.isCloseButtonIsDisplayed(), "Failure messege : Close button is not displayed");
		soft.assertTrue(ppage.isSubmitButtonIsDisplayed(), "Failure messege : Submit button is not displayed");	
	}
	
	@Test(priority=2, enabled=true)
	public void validateValueOnPosStore() throws IOException {
		ppage.clickOnTheStore();
		String cashinhand = excel.readStringData("pos", 1, 2);
		ppage.enterValueOnCashInHand(cashinhand);
		ppage.clickOnSubmitButton();
	}
}
