package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.WebbrowserUtils;

public class HomePageTest extends AutomationBase{

	WebDriver driver;
	LoginPage login;
	HomePage home;
	
	WebbrowserUtils webbrowser = new WebbrowserUtils();
	@BeforeMethod
	public void preRun() throws Exception {
		driver=getDriver();
		login = new LoginPage(driver);
		webbrowser.launchUrl(driver, "https://qalegend.com/restaurant/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		home = login.login("admin", "password");
	}
	
	@Test(priority=1, enabled=true)
	public void validateMenuIsDisplayyedOnHomePage() 
	{
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(home.isPosLinkIsDisplayed(), "Failure messege : Pos link is not displayed");
		soft.assertTrue(home.isProductLinkIsDisplayed(), "Failure messege : Product link is not displayed");
		soft.assertTrue(home.isStoresLinkIsDisplayed(), "Failure messege : Stores link is not displayed");
		soft.assertTrue(home.isPeopleLinkIsDisplayed(), "Failure messege : People link is not displayed");
		soft.assertTrue(home.isSalesLinkIsDisplayed(), "Failure messege : Sales link is not displayed");
		soft.assertTrue(home.isExpenseLinkIsDisplayed(), "Failure messege : Expense link is not displayed");
		soft.assertTrue(home.isCategoriesLinkIsDisplayed(), "Failure messege : Categories link is not displayed");
		soft.assertTrue(home.isSettingLinkIsDisplayed(), "Failure messege : Setting link is not displayed");
		soft.assertTrue(home.isReportsLinkIsDisplayed(), "Failure messege : RFeports link is not displayed");
		home.isLanguageIsDisplayed();
		home.isLogoutButtonIsDisplayed();
	}
	
	@Test(priority=2, enabled=true)
	public void validateTheMenuIsClickableOnHomePage() {
		home.navigateToPosLink();
		home.navigateToProductLink();
		home.navigateToStoresLink();
		home.navigateToPeopleLink();
		home.navigateToSalesLink();
		home.navigateToExpenseLink();
		home.navigateToCategoriesLink();
		home.navigateToSettingLink();
		home.navigateToReportsLink();
		home.navigateToLanguage();
		//home.navigateToLogoutButton();
	}
}
