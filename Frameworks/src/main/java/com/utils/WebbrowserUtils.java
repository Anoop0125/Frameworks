package com.utils;

import org.openqa.selenium.WebDriver;

public class WebbrowserUtils {

	
	/**
	 *  this method is for launching the given url 
	 *  
	 * @param driver
	 * @param Url
	 */
	public void launchUrl(WebDriver driver, String Url) {
		
		try {
			driver.get(Url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		
	}
	
	public String getTheWebPageTitle(WebDriver driver) {
		
	String title = null;
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());	
		}
		return title;
	}
	
	public String getTheCurrentUrl(WebDriver driver) {
		
		String current = null;
			try {
				current = driver.getCurrentUrl();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());	
			}
			return current;
		}
	
	public String getThePageSource(WebDriver driver) {
		
		String page = null;
			try {
				page = driver.getPageSource();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());	
			}
			return page;
		}
	
	/**
	 *  this method is for navigate to next page
	 * 
	 */
	public void navigateToNextPage(WebDriver driver) {
		
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * this method is for navigate to previous page
	 * 
	 */
	public void navigateToPreviousPage(WebDriver driver) {
		
		try {
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * this method is for navigate to refresh the page
	 * 
	 */
	public void navigateToRefreshPage(WebDriver driver) {
		
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	
	/**
	 * this method is for maximize the browsing webpage
	 * 
	 */
	public void browserMaximize(WebDriver driver) {
		
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	
	/**
	 * this method is for minimize the browsing webpage
	 * 
	 */
	public void browserMinimize(WebDriver driver) {
		
		try {
			driver.manage().window().minimize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	
	/**
	 * this method makes the browsing webpage in fullscreen
	 * 
	 */
	public void browserFullScreen(WebDriver driver) {
		
		try {
			driver.manage().window().fullscreen();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	

	/**
	 * this method is for close the browsing webpage
	 * 
	 */
	public void browserClosePage(WebDriver driver) {
		
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	
	/**
	 * this method is for quit the browsing webpage
	 * 
	 */
	public void browserQuitPage(WebDriver driver) {
		
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
}
