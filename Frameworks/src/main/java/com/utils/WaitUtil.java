package com.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

	public WebDriverWait wait;
	
	public void implicitWait(WebDriver driver, int timeOut) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	/**
	 * 
	 * @param driver
	 * @param elementlocator
	 * @return
	 * @throws Exception
	 */
	public WebElement presenceOfElementLocated(WebDriver driver, By elementlocator) throws Exception {
		
		WebElement element;
		try {
				wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				element = wait.until(ExpectedConditions.presenceOfElementLocated(elementlocator));
		} catch (Exception e) {
			throw new Exception("");
		}
		return element;
		
	}
	
	/**
	 * 
	 * @param driver
	 * @param element
	 * @param timeOut
	 */
	public void visibilityOf(WebDriver driver, WebElement element, int timeOut) {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
}
