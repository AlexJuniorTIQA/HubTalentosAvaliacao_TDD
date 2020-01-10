package br.com.rsinet.hub_tdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PageRegister {

	final WebDriver driver;
	/////////////Elements: Account Details////////////////
	@FindBy(how = How.NAME, using = "usernameRegisterPage")

	public WebElement elementUserName;
	
	@FindBy(how = How.NAME, using = "emailRegisterPage")

	public WebElement elementEmail;
	
	
	@FindBy(how = How.NAME, using = "passwordRegisterPage")

	public WebElement elementPassword;
	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")

	public WebElement elementConfirmPassword;
	
	/////////////Elements: Personal Details////////////////
	@FindBy(how = How.NAME, using = "first_nameRegisterPage")

	public WebElement elementFirstName;
	
	@FindBy(how = How.NAME, using = "last_nameRegisterPage")

	public WebElement elementLastName;
	
	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")

	public WebElement elementPhoneNumber;
/////////////Elements: Adress////////////////
	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")

	public WebElement elementCountry;
	
	@FindBy(how = How.NAME, using = "cityRegisterPage")

	public WebElement elementCity;
	
	@FindBy(how = How.NAME, using = "addressRegisterPage")

	public WebElement elementAdress;
	
	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")

	public WebElement elementState;
	
	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")

	public WebElement elementPostalCode;

	
	////////////////////////////////////////////////////////
	public PageRegister(WebDriver driver) {

		this.driver = driver;
	}
	
/**
 * Methods Account Details
 */
	
public void setUserName(String username){
	elementUserName.sendKeys(username);}

public void setEmai(String email){
	elementEmail.sendKeys(email);}

public void setPassword(String password){
	elementPassword.sendKeys(password);}

public void setConfirmPassword(String password){
	elementConfirmPassword.sendKeys(password);}

/**
 * Methods Personal Details
 * */
public void setFirstName(String fistName){
	elementFirstName.sendKeys(fistName);}

public void setLastName(String lastName){
	elementLastName.sendKeys(lastName);}

public void setPhoneNumber(String phoneNumber){
	elementPhoneNumber.sendKeys(phoneNumber);}


/**
 * Methods Account Details
 */
public void selectCountry(String valor) {
	WebElement element = driver.findElement(By.name("countryListboxRegisterPage"));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		}
public void setCity(String city){
	elementCity.sendKeys(city);}
		
public void setAdress(String adress){
	elementAdress.sendKeys(adress);}
		
public void setState(String state){
	elementState.sendKeys(state);}
public void setPostalCode(String postalCode){
	elementPostalCode.sendKeys(postalCode);}
	
}

	
