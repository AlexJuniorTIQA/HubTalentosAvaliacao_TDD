package br.com.rsinet.hub_tdd.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	final WebDriver driver;
	///////////// Elements: Account Details////////////////
	@FindBy(how = How.ID, using = "menuUser")

	public WebElement elementIconUser;
	
	
	
	@FindBy(how = How.ID, using = "menuSearch")

	public WebElement elementIconSearch;
	
	@FindBy(how = How.ID, using = "autoComplete")

	public WebElement elementSearch;
	
	
	
	
	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")

	public WebElement elementCreatNewAccount;
	
	@FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[3]/a/span")

	public WebElement elementUserLink;

	
	@FindBy(how = How.ID, using = "tabletsTxt")

	public WebElement elementTablets;
	
	
	@FindBy(how = How.ID, using = "headphonesTxt")

	public WebElement elementHeadPhones;
	
	@FindBy(how = How.ID, using = "speakersTxt")

	public WebElement elementSpeakers;
	
	@FindBy(how = How.ID, using = "laptopsTxt")

	public WebElement elementLaptops;
	
	@FindBy(how = How.ID, using = "miceTxt")

	public WebElement elementMice;
	
	
	
	
	public HomePage(WebDriver driver) {

		this.driver = driver;
	}
	
	public void findElementLinkText(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
	
	public void setSearch(String search) {
		elementSearch.sendKeys(search);
	}
	
}