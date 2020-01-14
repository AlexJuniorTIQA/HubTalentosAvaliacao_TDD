package br.com.rsinet.hub_tdd.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	final WebDriver driver;
	///////////// Elements: Account Details////////////////
	@FindBy(how = How.ID, using = "menuUser")

	public WebElement elementIconeUser;
	
	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")

	public WebElement elementCreatNewAccount;
	
	@FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[3]/a/span")

	public WebElement elementUserLink;

	
	public HomePage(WebDriver driver) {

		this.driver = driver;
	}
}