package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.WebActionUtils;
import com.utils.WebElementUtils;

public class HomePage {

	WebDriver driver;
	
	WebActionUtils webaction = new WebActionUtils();
	WebElementUtils webelement = new WebElementUtils();
	
	@FindBy(xpath="//span[text()='POS']")
	WebElement poslink;
	
	@FindBy(xpath="//span[text()='Product']")
	WebElement productlink;
	
	@FindBy(xpath="//span[text()='Stores']")
	WebElement storeslink;
	
	@FindBy(xpath="//span[text()='People']")
	WebElement peoplelink;
	
	@FindBy(xpath="//span[text()='Sales']")
	WebElement saleslink;
	
	@FindBy(xpath="//span[text()='Expense']")
	WebElement expenselink;
	
	@FindBy(xpath="//span[text()='Categories ']")
	WebElement categorieslink;
	
	@FindBy(xpath="//span[text()='Setting']")
	WebElement settinglink;
	
	@FindBy(xpath="//span[text()='Reports']")
	WebElement reportslink;
	
	@FindBy(xpath="(//a[@class='dropdown-toggle flat-box waves-effect waves-block'])[3]")
	WebElement language;
	
	@FindBy(xpath="(//li[@class='flat-box waves-effect waves-block'])[22]")
	WebElement logoutbtn;
	
	
	public HomePage(WebDriver  driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isPosLinkIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, poslink);
		return flag;
	}
	
	public boolean isProductLinkIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, productlink);
		return flag;
	}
	
	public boolean isStoresLinkIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, storeslink);
		return flag;
	}
	
	public boolean isPeopleLinkIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, peoplelink);
		return flag;
	}
	
	public boolean isSalesLinkIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, saleslink);
		return flag;
	}

	public boolean isExpenseLinkIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, expenselink);
		return flag;
	}
	
	public boolean isCategoriesLinkIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, categorieslink);
		return flag;
	}
	
	public boolean isSettingLinkIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, settinglink);
		return flag;
	}
	
	public boolean isReportsLinkIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, reportslink);
		return flag;
	}
	
	public void isLanguageIsDisplayed() {
		webaction.checkElementisDisplayed(driver, language);
	}
	
	public void isLogoutButtonIsDisplayed() {
		webaction.checkElementisDisplayed(driver, logoutbtn);
	}
	
	public void navigateToPosLink() {
		webaction.clickOnTheElement(driver, poslink);
	}
	
	public void navigateToProductLink() {
		webaction.clickOnTheElement(driver, productlink);
	}

	public void navigateToStoresLink() {
		webaction.clickOnTheElement(driver, storeslink);
	}
	
	public void navigateToPeopleLink() {	
		webaction.clickOnTheElement(driver, peoplelink);
	}
	
	public void navigateToSalesLink() {	
		webaction.clickOnTheElement(driver, saleslink);
	}
	
	public void navigateToExpenseLink() {
		webaction.clickOnTheElement(driver, expenselink);
	}
	
	public void navigateToCategoriesLink() {
		webaction.clickOnTheElement(driver, categorieslink);
	}
	
	public void navigateToSettingLink() {
		webaction.clickOnTheElement(driver, settinglink);
	}
	
	public void navigateToReportsLink() {
		webaction.clickOnTheElement(driver, reportslink);
	}
	
	public void navigateToLanguage() {
		webaction.clickOnTheElement(driver, language);
	}
	
	public void navigateToLogoutButton() {
		webaction.clickOnTheElement(driver, logoutbtn);
	}
	
	public PosPage navigateToPosPage() {
		navigateToPosLink();
		return new PosPage(driver);
	}
	
	public ProductPage navigateToProductPage() {
		navigateToProductLink();
		return new ProductPage(driver);
	}
	
	public StorePage navigateToStoresPage() {
		navigateToStoresLink();
		return new StorePage(driver);
	}
	
	public PeoplePage navigateToPeoplePage() {
		navigateToPeopleLink();
		return new PeoplePage(driver);
	}

	public LogoutButton navigateToLogoutBtn() {
		navigateToLogoutButton();
		return null;
		
	}
}
