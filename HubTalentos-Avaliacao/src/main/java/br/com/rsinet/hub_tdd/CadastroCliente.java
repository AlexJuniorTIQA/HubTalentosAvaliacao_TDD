package br.com.rsinet.hub_tdd;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CadastroCliente {

	private WebDriver driver;
	
	

	@Before
	public void Inicializa() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/");
		
		Thread.sleep(4000);
	}

	@Test
	public void NovoUsuario() throws InterruptedException {
		
		driver.findElement(By.id("menuUser")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();
		Thread.sleep(4000);
		
		//Instancia á Página de Registro como uma PageFactory 
		 PageRegister registerPage = PageFactory.initElements(driver, PageRegister.class);
		
		 
		 
		 
		 registerPage.setUserName("Excel");
		 registerPage.setEmai("Excel");
		 registerPage.setPassword("Excel");
		 registerPage.setConfirmPassword("Excel");
		 
		 registerPage.setFirstName("Excel");
		 registerPage.setLastName("Excel");
		 registerPage.setPhoneNumber("Excel");
		 
		 registerPage.selectCountry("Virgin Islands (USA)");
		 registerPage.setCity("Excel");
		 registerPage.setAdress("Excel");
		 registerPage.setState("Excel");
		 registerPage.setPostalCode("Excel");
		
	}

}
