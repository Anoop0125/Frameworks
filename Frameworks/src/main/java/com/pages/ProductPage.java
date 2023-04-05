package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.WebActionUtils;

public class ProductPage {

	WebDriver driver;
	
	WebActionUtils webaction = new WebActionUtils();
	
	@FindBy(xpath="//button[text()='Add Product']")
	WebElement addproduct;
	
	@FindBy(xpath="//select[@id='Type']")
	WebElement type;
	
	@FindBy(xpath="//th[text()='Code']")
	WebElement code;
	
	@FindBy(xpath="//th[text()='Name']")
	WebElement name;
	
	@FindBy(xpath="//th[text()='Category']")
	WebElement category;
	
	@FindBy(xpath="(//label[text()='Supplier'])[1]")
	WebElement supplier;
	
	@FindBy(xpath="//input[@id='PurchasePrice']")
	WebElement purchaseprice;
	
	@FindBy(xpath="//th[text()='tax (%)']")
	WebElement tax;
	
	@FindBy(xpath="//select[@id='taxType']")
	WebElement taxmethod;
	
	@FindBy(xpath="//th[text()='Price']")
	WebElement price;
	
	@FindBy(xpath="//input[@id='Unit']")
	WebElement productunit;
	
	@FindBy(xpath="//input[@id='AlertQt']")
	WebElement alertquantity;
	
	@FindBy(xpath="//textarea[@id='ProductOptions']")
	WebElement productoptions;
	
	@FindBy(xpath="(//input[@id='ImageInput'])[1]")
	WebElement inputimage;
	
	@FindBy(xpath="//th[text()='Product Description']")
	WebElement productdescription;
	
	@FindBy(xpath="//label[@class='btn color01']")
	WebElement choosecolors;
	
	@FindBy(xpath="(//button[text()='Close'])[2]")
	WebElement closebtn;
	
	@FindBy(xpath="(//button[text()='Submit'])[1]")
	WebElement submitbtn;
	
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement productsearch;
	
	@FindBy(xpath="(//table[@id='Table']//tr//td)[1]")
	WebElement productcode_searchresult;
	
	@FindBy(xpath="(//table[@id='Table']//tr//td)[2]")
	WebElement productname_searchresult;
	
	@FindBy(xpath="(//table[@id='Table']//tr//td)[3]")
	WebElement productcategory_searchresult;
	
	@FindBy(xpath="(//select[@id='Supplier'])[1]")
	WebElement productsupplier_searchresult;
	
	@FindBy(xpath="(//table[@id='Table']//tr//td)[4]")
	WebElement productdescription_searchresult;
	
	@FindBy(xpath="(//table[@id='Table']//tr//td)[5]")
	WebElement producttax_searchresult;
	
	@FindBy(xpath="(//table[@id='Table']//tr//td)[6]")
	WebElement productprice_searchresult;
	
	@FindBy(xpath="(//a[@class='btn btn-default'])[3]")
	WebElement product_editbtn;
	
	@FindBy(xpath="(//a[@class='btn btn-default'])[1]")
	WebElement product_deletebtn;
	
	@FindBy(xpath="(//a[@class='btn btn-default'])[4]")
	WebElement product_modifystockbtn;
	
	@FindBy(xpath="(//a[@class='btn btn-default'])[2]")
	WebElement viewproductbtn;
	
	@FindBy(xpath="//a[text()='Upload CSV file']")
	WebElement uploadcsvbtn;
	
	@FindBy(xpath="//a[text()='Download CSV']")
	WebElement downloadcsvbtn;
	
	@FindBy(xpath="//a[text()='PrintMenu']")
	WebElement printmenubtn;
	
	@FindBy(xpath="(//a[@class='btn btn-default'])[1]")
	WebElement deleteproductbtn;
	
	@FindBy(xpath="//a[text()='Yes, delete it!']")
	WebElement deleteitbtn;
	
	public ProductPage(WebDriver  driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	public boolean isAddProductIsDisplayed() {	
		boolean flag = webaction.checkElementisDisplayed(driver, addproduct);
		return flag;
	}
	
	public boolean isTypeIsDisplayed() {	
		boolean flag = webaction.checkElementisDisplayed(driver, type);
		return flag;
	}
	
	public boolean isCodeIsDisplayed() {	
		boolean flag = webaction.checkElementisDisplayed(driver, code);
		return flag;
	}
	
	public boolean isNameIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, name);
		return flag;
	}
	
	public boolean isCategoryIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, category);
		return flag;
	}
	
	public boolean isSupplierIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, supplier);
		return flag;
	}
	
	public boolean isPurchasePriceIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, purchaseprice);
		return flag;
	}
	
	public boolean isTaxIsDisplayed() {	
		boolean flag = webaction.checkElementisDisplayed(driver, tax);
		return flag;
	}
	
	public boolean isTaxMethodIsDisplayed() {	
		boolean flag = webaction.checkElementisDisplayed(driver, taxmethod);
		return flag;
	}
	
	public boolean isPriceIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, price);
		return flag;
	}

	public boolean isProductUnitIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, productunit);
		return flag;
	}
	
	public boolean isAlertQuantityIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, alertquantity);
		return flag;
	}
	
	public boolean isProductOptionsIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, productoptions);
		return flag;
	}
	
	public boolean isInputImageIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, inputimage);
		return flag;
	}
	
	public boolean isProductDescriptionIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, productdescription);
		return flag;
	}
	
	public boolean isChooseColorsIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, choosecolors);
		return flag;
	}
	
	public boolean isCloseButtonIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, closebtn);
		return flag;
	}
	
	public boolean isSubmitButtonIsDisplayed() {
		boolean flag = webaction.checkElementisDisplayed(driver, submitbtn);
		return flag;
	}
	
	public boolean isUploadCsvBtnIsDisplayed() {	
		boolean flag = webaction.checkElementisDisplayed(driver, uploadcsvbtn);	
		return flag;
	}
	
	public boolean isDownloadCsvBtnIsDisplayed() {	
		boolean flag = webaction.checkElementisDisplayed(driver, downloadcsvbtn);	
		return flag;
	}
	
	public boolean isPrintMenuBtnIsDisplayed() {	
		boolean flag = webaction.checkElementisDisplayed(driver, printmenubtn);	
		return flag;
	}
	
	public void clickOnAddProduct() {
		webaction.clickOnTheElement(driver, addproduct);
	}
	
	public void selectProductType(String ptype) {
		webaction.enterTheValue(driver, type, ptype);
	}
	
	public void enterProductCode(String pcode) {
		webaction.enterTheValue(driver, code, pcode);
	}
	
	public void enterProductName(String pname) {
		webaction.enterTheValue(driver, name, pname);
	}
	
	public void selectProductcategory(String pcategory) {
		webaction.enterTheValue(driver, category, pcategory);
	}
	
	public void selectProductSupplier(String psupplier) {
		webaction.enterTheValue(driver, supplier, psupplier);
	}
	
	public void enterProductPurchasePrise(String ppurchaseprice) {
		webaction.enterTheValue(driver, purchaseprice, ppurchaseprice);
	}
	
	public void enterProductTax(String ptax) {
		webaction.enterTheValue(driver, tax, ptax);
	}
	
	public void selectProductTaxmethod(String ptaxmethod) {
		webaction.enterTheValue(driver, taxmethod, ptaxmethod);
	}
	
	public void enterProductprice(String pprice) {
		webaction.enterTheValue(driver, price, pprice);
	}
	
	public void enterProductunit(String punit) {
		webaction.enterTheValue(driver, productunit, punit);
	}
	
	public void enterProductAlertQuantity(String alerqty) {
		webaction.enterTheValue(driver, alertquantity, alerqty);
	}
	
	public void enterProductOptions(String option) {
		webaction.enterTheValue(driver, productoptions, option);
	}
	
	public void enterProductDescription(String description) {
		webaction.enterTheValue(driver, productdescription, description);
	}
	
	public void chooseProductColors(String color) {
		webaction.enterTheValue(driver, choosecolors, color);
	}
	
	public void clickOnSubmitBtn() {
		webaction.clickOnTheElement(driver, submitbtn);
	}
	
	public void toSearchProduct(String name) {
		webaction.enterTheValue(driver, productsearch, name);
	}

	public String getProductCodeSearch() {
		return webaction.getTheElementText(driver, productcode_searchresult);
	}
	
	public String getProductNameSearch() {
		return webaction.getTheElementText(driver, productname_searchresult);
	}

	public String getProductCategorySearch() {
		return webaction.getTheElementText(driver, productcategory_searchresult);
	}	
	
	public String getProductSupplierSearch() {
		return webaction.getTheElementText(driver, productsupplier_searchresult);
	}
	
	public String getProductDescriptionSearch() {
		return webaction.getTheElementText(driver, productdescription_searchresult);	
	}
	
	public String getProductTaxSearch() {	
		return webaction.getTheElementText(driver, producttax_searchresult);	
	}
	
	public String getProductPriceSearch() {	
		return webaction.getTheElementText(driver, productprice_searchresult);	
	}
	
	public void clickProductEditBtn() {	
		webaction.clickOnTheElement(driver, product_editbtn);	
	}
	
	public void clickProductDeleteBtn() {	
		webaction.clickOnTheElement(driver, product_deletebtn);	
	}
	
	public void clickProductConfirmDeleteBtn() {
		webaction.clickOnTheElement(driver, deleteitbtn);
	}
	
	public void clickProductModifyStockBtn() {	
		webaction.clickOnTheElement(driver, product_modifystockbtn);	
	}
	
	public void clickViewProductBtn() {	
		webaction.clickOnTheElement(driver, viewproductbtn);	
	}
	
}
	

