package com.utils;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementUtils {

	
	/**
	 * this method is for select the elemet by its value
	 * 
	 * @param driver
	 * @param element
	 * @param name
	 * @param list
	 */
	public void toSelectElementByValue(WebDriver driver, WebElement element, String value) {
		
		Select select = new Select(element);
		try {
			select.selectByValue(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
	
	/**
	 * this method is for select the element by index
	 * 
	 * @param driver
	 * @param element
	 * @param list
	 */
	public void toSelectElementByIndex(WebDriver driver, WebElement element, int index) {
		
		Select select = new Select(element);
		try {
			select.selectByIndex(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		
	}
	
	/**
	 * this method is for select the option by visible text
	 * 
	 * @param driver
	 * @param element
	 * @param name
	 * @param list
	 */
	public void toSelectByVisibleText(WebDriver driver, WebElement element,String text) {
		
		Select select = new Select(element);
		try {
			select.selectByVisibleText(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
	
	/**
	 * this method is used to get all the element option
	 * 
	 * @param driver
	 * @param element
	 * @param list
	 */
	public List<WebElement> toGetOptionOfElement(WebDriver driver, WebElement element) {
		
		List<WebElement> option = null;
		Select select = new Select(element);
		try {
			option = select.getOptions();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return option;
	}
	
	/**
	 * this method is used to get all the selected options of a drop down
	 * 
	 * @param driver
	 * @param element
	 * @param list
	 * @return 
	 */
	public List<WebElement> toGetAllSelectedOptionOfElement(WebDriver driver, WebElement element) {
		
		List<WebElement> option = null;

		Select select = new Select(element);
		try {
			option = select.getAllSelectedOptions();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return option;
	}
	
	/**
	 * this method is used to get the first selected option in the drop down
	 * 
	 * @param driver
	 * @param element
	 * @param list
	 */
	public String toGetFirstSelectedOptionOfElement(WebDriver driver, WebElement element) {
		
		String option = null;
		Select select = new Select(element);
		try {
			option = select.getFirstSelectedOption().getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return option;
	}
	
	/**
	 * this method is used to deselect the drop down element by its value
	 * 
	 * @param driver
	 * @param element
	 * @param name
	 * @param list
	 */
	public void deSelectElementByValue(WebDriver driver, WebElement element,String value) {
		
		Select select = new Select(element);
		try {
			select.deselectByValue(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
	
	/**
	 * this method is used to deselect the drop down element by its index
	 * 
	 * @param driver
	 * @param element
	 * @param list
	 */
	public void toDeSelectElementByIndex(WebDriver driver, WebElement element, int index) {
		
		Select select = new Select(element);
		try {
			select.deselectByIndex(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
	
	/**
	 * this method is used to deselect the option by visible text
	 * 
	 * @param driver
	 * @param element
	 * @param name
	 *
	 */
	public void deSelectElemenByVisibleText(WebDriver driver, WebElement element,String text) {
		
		Select select = new Select(element);
		try {
			select.deselectByVisibleText(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
	
	/**
	 * this method is used to deselect all the options in the drop down
	 * 
	 * @param driver
	 * @param element
	 * 
	 */
	public void deSelectAllTheElement(WebDriver driver, WebElement element) {
		
		Select select = new Select(element);
		try {
			select.deselectAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
	}
}
