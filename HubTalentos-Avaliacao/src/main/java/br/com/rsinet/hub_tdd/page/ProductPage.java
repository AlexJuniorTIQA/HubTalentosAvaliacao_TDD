package br.com.rsinet.hub_tdd.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import br.com.rsinet.hub_tdd.files.ExcelUtils;

public class ProductPage {

	final WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/nav/a[3]")
	public WebElement elementProductName;
	
	@FindBy(how = How.NAME, using = "save_to_cart")
	public WebElement elementAddToCart;
	
	@FindBy(how = How.ID, using = "menuCart")
	public WebElement elementMenuCart;
	
	
	
	public ProductPage(WebDriver driver) {

		this.driver = driver;
	}
	
	public void assertEqualsProduct(String expected) {
		Assert.assertEquals(expected.toUpperCase(), elementProductName.getText());
	}
	
}
