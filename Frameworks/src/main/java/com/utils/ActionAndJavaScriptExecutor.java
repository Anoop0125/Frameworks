package com.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionAndJavaScriptExecutor {

	WebDriver driver;
	JavascriptExecutor js =  (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	
	public void toScrollUpThePage(WebDriver driver) {
		
		try {
			js.executeScript("window.scrollBy(0, 0)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void toScrollDownThePage(WebDriver driver) {
		
		try {
			js.executeScript("window.scrollBy(0, -0)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickTheElement(WebDriver driver, WebElement element) {
		
		try {
			js.executeScript("arguments[0].click()", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void scrollToElement(WebDriver driver, WebElement element) {
		
		try {
			js.executeScript("arguments[0].scrollIntoView(true)", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickMethodOnWebElement(WebDriver driver, WebElement element) {
		
		try {
			action.moveToElement(element).click().build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void rightClickOnWebElement(WebDriver driver, WebElement element) {
		try {
			action.contextClick(element).click().build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void toMoveMousePointerToTheElement(WebDriver driver, WebElement element) {
		try {
			action.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void toDoubleClickTheElement(WebDriver driver, WebElement element) {
		try {
			action.doubleClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void toClickAndHoldTheElement(WebDriver driver, WebElement element) {
		try {
			action.clickAndHold(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void moveCursorByXandYCoordinate(WebDriver driver, int coordinateX, int coordinateY) {
		try {
			action.moveByOffset(coordinateX, coordinateY).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void toDragAndDropTheElement(WebDriver driver, WebElement drag, WebElement drop) {
		try {
			action.dragAndDrop(drag, drop).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
