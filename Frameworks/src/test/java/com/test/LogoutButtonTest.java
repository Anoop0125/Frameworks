package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.AutomationBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.LogoutButton;
import com.utils.WebbrowserUtils;

public class LogoutButtonTest extends AutomationBase{

	WebDriver driver;
	LoginPage login;
	HomePage home;
	LogoutButton logout;
	
	WebbrowserUtils webbrowser = new WebbrowserUtils();
	@BeforeMethod
	public void preRun() throws Exception {
		driver=getDriver();
		login = new LoginPage(driver);
		webbrowser.launchUrl(driver, "https://qalegend.com/restaurant/login");
		home = login.login("admin", "password");
		logout = home.navigateToLogoutBtn();
	}
	
	@Test(priority=1, enabled=true)
	public void clickOnLogoutButton() {
		logout.navigateToLogoutButton();
	}
}
