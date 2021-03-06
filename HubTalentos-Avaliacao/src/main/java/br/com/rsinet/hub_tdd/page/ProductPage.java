package br.com.rsinet.hub_tdd.page;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage {

	final WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/nav/a[3]")
	private WebElement elementProductName;
	
	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement elementAddToCart;
	
	@FindBy(how = How.ID, using = "menuCart")
	private WebElement elementMenuCart;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article/div[3]/div/label/span")
	private WebElement elementNotFound;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article[4]/div/div[2]/a/label")

	private WebElement elementHPEliteBookFolioDetails;
	
	public ProductPage(WebDriver driver) {

		this.driver = driver;
	}
	
	public void assertEqualsProduct(String expected) {
		Assert.assertEquals(expected.toUpperCase(), elementProductName.getText());
	}
	public void assertEqualsProductFail(String expected) {
		Assert.assertEquals("No results for \""+expected+"\"", elementNotFound.getText());
	}
	
	public void ClickEelementHPEliteBookFolioDetails() {
		elementHPEliteBookFolioDetails.click(); 
	}
	
	public void waitElement(WebDriver driver2) {
		JavascriptExecutor js = (JavascriptExecutor) driver2;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
	}
}
