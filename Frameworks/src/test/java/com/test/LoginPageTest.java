package com.test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.PropertyUtils;

import com.base.AutomationBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.WebbrowserUtils;

public class LoginPageTest extends AutomationBase
{
	WebDriver driver;
	WebbrowserUtils webbrowser;
	LoginPage login;
	HomePage home;
	PropertyUtils propertyutil;
	Properties prop;
	
	@BeforeMethod
	public void preRun() throws IOException
	{
		driver=getDriver();
		login = new LoginPage(driver);
		webbrowser = new WebbrowserUtils();
		home = new HomePage(driver);
		propertyutil = new PropertyUtils();
		//prop = propertyutil.
		webbrowser.launchUrl(driver, prop.getProperty("url"));
	}
	
	@Test(priority=1, enabled=true)
	public void validateLogin() throws IOException 
	{
		login.enterValueToUserName("username");
		login.enterValueToPassword("password");
		login.clickOnLoginButton();
	}	
}
