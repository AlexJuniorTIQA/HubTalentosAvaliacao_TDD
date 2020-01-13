package br.com.rsinet.hub_tdd;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CadastroCliente {

	private WebDriver driver;
	

	@Before
	public void Inicializa() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void NovoUsuario() throws InterruptedException {
		// Instancia á Página de Registro como uma PageFactory
		PageRegister registerPage = PageFactory.initElements(driver, PageRegister.class);
		
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).sendKeys(Keys.ENTER);

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

		registerPage.elementCheckReceiveOffersByEmail.click();
		registerPage.elementCheckConditionsOfUse.click();
		registerPage.elementButtonRegister.click();
	}

}
