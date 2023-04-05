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
import com.pages.ProductPage;
import com.utils.ExcelUtils;
import com.utils.WebbrowserUtils;

public class ProductPageTest extends AutomationBase {
	
	ExcelUtils excel;
	WebDriver driver;
	LoginPage login;
	HomePage home;
	ProductPage product;
	
	WebbrowserUtils webbrowser = new WebbrowserUtils();
	@BeforeMethod
	public void preRun() throws Exception{
		excel = new ExcelUtils("testdataframe.xlsx");
		driver=getDriver();
		login = new LoginPage(driver);
		webbrowser.launchUrl(driver, "https://qalegend.com/restaurant/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		home = login.login("admin", "password");
		product = home.navigateToProductPage();
	}
	
	@Test(priority=1, enabled=true)
	public void validateElementsOnAddProductPage() 
	{	
		product.clickOnAddProduct();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(product.isAddProductIsDisplayed(), "Failure messege : Add product is not displayed");
		soft.assertTrue(product.isTypeIsDisplayed(), "Failure messege : Product type is not displayed");
		soft.assertTrue(product.isCodeIsDisplayed(), "Failure messege : Product code is not displayed");
		soft.assertTrue(product.isNameIsDisplayed(), "Failure messege : Product name is not displayed");
		soft.assertTrue(product.isCategoryIsDisplayed(), "Failure messege : Product category is not displayed");
		soft.assertTrue(product.isSupplierIsDisplayed(), "Failure messege : Product supplier is not displayed");
		soft.assertTrue(product.isPurchasePriceIsDisplayed(), "Failure messege : Product purchase price is not displayed");
		soft.assertTrue(product.isTaxIsDisplayed(), "Failure messege : Product tax is not displayed");
		soft.assertTrue(product.isTaxMethodIsDisplayed(), "Failure messege : Product tax method is not displayed");
		soft.assertTrue(product.isPriceIsDisplayed(), "Failure messege : Product price is not displayed");
		soft.assertTrue(product.isProductUnitIsDisplayed(), "Failure messege : Product product unit is not displayed");
		soft.assertTrue(product.isAlertQuantityIsDisplayed(), "Failure messege : Product alert quantity is not displayed");
		soft.assertTrue(product.isProductOptionsIsDisplayed(), "Failure messege : Product options is not displayed");
		soft.assertTrue(product.isInputImageIsDisplayed(), "Failure messege : Input image is not displayed");
		soft.assertTrue(product.isProductDescriptionIsDisplayed(), "Failure messege : Product description is not displayed");
		soft.assertTrue(product.isChooseColorsIsDisplayed(), "Failure messege : Choose color is not displayed");
		soft.assertTrue(product.isCloseButtonIsDisplayed(), "Failure messege : Close button is not displayed");
		soft.assertTrue(product.isSubmitButtonIsDisplayed(), "Failure messege : Submit button is not displayed");	
		soft.assertTrue(product.isDownloadCsvBtnIsDisplayed(), "Failure messege : Download CSV button is not displayed");
		soft.assertTrue(product.isUploadCsvBtnIsDisplayed(), "Failure messege : Upload CSV button is not displayed");
		soft.assertTrue(product.isPrintMenuBtnIsDisplayed(), "Failure messege : Print Menu button is not displayed");
		soft.assertAll();
	}
		
		@Test(priority=2, enabled=true)
		public void enterValueToProductPage() throws IOException
		{	
			product.clickOnAddProduct();
			String ptype = excel.readStringData("product", 1, 2);
			//System.out.println(ptype);
			product.selectProductType(ptype);
			String pcode = excel.readStringData("product", 2, 2);
			product.enterProductCode(pcode);
			String pname = excel.readStringData("product", 3, 2);
			product.enterProductName(pname);
			String pcategory = excel.readStringData("product", 4, 2);
			product.selectProductcategory(pcategory);
			String psupplier = excel.readStringData("product", 5, 2);
			product.selectProductSupplier(psupplier);
			String ppurchaseprice = excel.readStringData("product", 6, 2);
			product.enterProductPurchasePrise(ppurchaseprice);
			String ptax = excel.readStringData("product", 7, 2);
			product.enterProductTax(ptax);
			String ptaxmethod = excel.readStringData("product", 8, 2);
			product.selectProductTaxmethod(ptaxmethod);
			String pprice = excel.readStringData("product", 9, 2);
			product.enterProductprice(pprice);
			String punit = excel.readStringData("product", 10, 2);
			product.enterProductunit(punit);
			String palertquantity = excel.readStringData("product", 11, 2);
			product.enterProductAlertQuantity(palertquantity);
			String poptions = excel.readStringData("product", 12, 2);
			product.enterProductOptions(poptions);
			String pdescription = excel.readStringData("product", 13, 2);
			product.enterProductDescription(pdescription);
			String pcolor = excel.readStringData("product", 14, 2);
			product.chooseProductColors(pcolor);
			product.clickOnSubmitBtn();
			product.clickProductModifyStockBtn();
			product.clickViewProductBtn();
			
			
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(product.getProductCodeSearch(), "1234");
			soft.assertEquals(product.getProductNameSearch(), "Apple");
			soft.assertEquals(product.getProductCategorySearch(), "Fruits");
			soft.assertEquals(product.getProductSupplierSearch(), "abc");
			soft.assertEquals(product.getProductTaxSearch(), "10");
			soft.assertEquals(product.getProductPriceSearch(), "1000");
			soft.assertEquals(product.getProductDescriptionSearch(), "abcdefgh");
		}
		
		@Test(priority=3, enabled=true)
		public void validateToEditProductInProductPage() throws IOException
		{
			product.clickProductEditBtn();
			String etype = excel.readStringData("product", 19, 2);
			product.selectProductType(etype);
			String ecode = excel.readStringData("product", 20, 2);
			product.enterProductCode(ecode);
			String ename = excel.readStringData("product", 21, 2);
			product.enterProductName(ename);
			String ecategory = excel.readStringData("product", 22, 2);
			product.selectProductcategory(ecategory);
			String esupplier = excel.readStringData("product", 23, 2);
			product.selectProductSupplier(esupplier);
			String epurchaseprice = excel.readStringData("product", 24, 2);
			product.enterProductPurchasePrise(epurchaseprice);
			String etax = excel.readStringData("product", 25, 2);
			product.enterProductTax(etax);
			String etaxmethod = excel.readStringData("product", 26, 2);
			product.selectProductTaxmethod(etaxmethod);
			String eprice = excel.readStringData("product", 27, 2);
			product.enterProductprice(eprice);
			String eunit = excel.readStringData("product", 28, 2);
			product.enterProductunit(eunit);
			String ealert = excel.readStringData("product", 29, 2);
			product.enterProductAlertQuantity(ealert);
			String eoption = excel.readStringData("product", 30, 2);
			product.enterProductOptions(eoption);
			String edescription = excel.readStringData("product", 31, 2);
			product.enterProductDescription(edescription);
			String ecolor = excel.readStringData("product", 32, 2);
			product.chooseProductColors(ecolor);
		}

		@Test(priority=4, enabled=true)
		public void validateToDeleteTheProductInProductPage()
		{
			product.clickProductDeleteBtn();
			product.clickProductConfirmDeleteBtn();
		}
		
		
}
