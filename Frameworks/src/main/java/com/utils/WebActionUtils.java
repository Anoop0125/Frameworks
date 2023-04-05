package com.utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebActionUtils {

	
	/**
	 * this method is used to send the inputs like characters, numbers and symbols
	 * 
	 * @param driver
	 * @param element
	 * @param name 
	 */
	public void enterTheValue(WebDriver driver, WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
	
	/**
	 * this method is used to clear the text 
	 * 
	 * @param element
	 */
	public void clearTheElement(WebDriver driver, WebElement element) {

		try {
			element.clear();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
	
	/**
	 * this method is used to click checkboxes and radio buttons
	 * 
	 * @param element
	 */
	public void clickOnTheElement(WebDriver driver, WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
	
	/**
	 * this method is used to submit the form 
	 * 
	 * @param element
	 */
	public void submit(WebDriver driver, WebElement element) {

		try {
			element.submit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
	
	/**
	 * this method is used to verify that the element is selected
	 * 
	 * @param element
	 */
	public boolean checkElementisSelected(WebDriver driver, WebElement element) {

		boolean flag = false;
		try {
			flag = element.isSelected();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return flag;
	}
	
	/**
	 * this method is used to verify that the element is enabled
	 * 
	 * @param element
	 */
	public boolean checkElementisEnabled(WebDriver driver, WebElement element) {

		boolean flag = false;
		try {
			flag = element.isEnabled();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return flag;
	}
	
	/**
	 * this method is used to verify that the element is displayed
	 * 
	 * @param element
	 */
	public boolean checkElementisDisplayed(WebDriver driver, WebElement element) {

		Boolean flag = false;
		try {
			flag = element.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return flag;
	}
	
	/**
	 * this method returns the text 
	 * 
	 * @param element
	 * @return 
	 */
	public String getTheElementText(WebDriver driver, WebElement element) {

		String text = null;
		try {
			text = element.getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return text;
	}
	
	/**
	 * this method is used to return the tag name 
	 * 
	 * @param element
	 */
	public String getTheElementTagName(WebDriver driver, WebElement element) {

		String text = null;
		try {
			text = element.getTagName();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return text;
	}
	
	/**
	 * this element is used to return the value of attribute
	 * 
	 * @param element
	 */
	public String getTheElementAttribute(WebDriver driver, WebElement element, String attribute) {

		String text = null;
		try {
			element.getAttribute(attribute);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return text;
	}
	
	/**
	 * this method is used to return the value of color, font style
	 * 
	 * @param element
	 */
	public String getTheElementCssValue(WebDriver driver, WebElement element) {

		String text = null;
		try {
			text = element.getCssValue(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return text;
	}
	
	/**
	 * this method is used to return the width and height of the element
	 * 
	 * @param element
	 */
	public Dimension getTheElementSize(WebDriver driver, WebElement element) {

		Dimension size = null;
		try {
			size = element.getSize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return  size;
	}
	
	/**
	 * this method is used to get the location of an web element. This position is calculated by (x,y) coordinates
	 * 
	 * @param element
	 */
	public Point getTheElementLocation(WebDriver driver, WebElement element) {

		Point location = null;
		try {
			location = element.getLocation();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return location;
	}


}
