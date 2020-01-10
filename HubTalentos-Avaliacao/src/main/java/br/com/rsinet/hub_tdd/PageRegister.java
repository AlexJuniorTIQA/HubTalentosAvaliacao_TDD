package br.com.rsinet.hub_tdd;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.How;
 
import org.openqa.selenium.support.PageFactory;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageRegister{

	private WebDriver driver;
	
	
//
//	public PageRegister(WebDriver driver) {
//		this.driver = driver;
//	}
//	
//	public PageRegister setUsername(String username){
//		driver.findElement
//		(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[1]/div[1]/sec-view[1]/div/input"))
//			.sendKeys(username);
//		return this;
//	}
	
	
	 
	 @FindBy(how = How.NAME, using = "submit")
	 
	 public static WebElement txtbx_Password;
	 
	


}