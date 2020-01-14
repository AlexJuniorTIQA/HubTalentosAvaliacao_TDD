package br.com.rsinet.hub_tdd.teste;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_tdd.page.HomePage;
import br.com.rsinet.hub_tdd.page.PageRegister;
import br.com.rsinet.hub_tdd.teste.data.Constant;
import br.com.rsinet.hub_tdd.teste.data.ExcelUtils;
import br.com.rsinet.hub_tdd.teste.data.Screenshot;

public class CadastroCliente {

	private WebDriver driver;
	

	@Before
	public void Inicializa() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void finaliza() throws IOException {
		Screenshot.getScreenShot(driver, "TestNewUser");
	}

	@Test
	public void NovoUsuario() throws Exception {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		PageRegister registerPage = PageFactory.initElements(driver, PageRegister.class);
        ExcelUtils.setExcelFile(Constant.File_TestData,"Planilha1");
		
		homePage.elementIconeUser.click();
		homePage.elementCreatNewAccount.sendKeys(Keys.ENTER);
		
		registerPage.setUserName(ExcelUtils.getCellData(1,1));
		registerPage.setEmail(ExcelUtils.getCellData(1,2));
		registerPage.setPassword(ExcelUtils.getCellData(1,3));
		registerPage.setConfirmPassword(ExcelUtils.getCellData(1,3));

		registerPage.setFirstName(ExcelUtils.getCellData(1,4));
		registerPage.setLastName(ExcelUtils.getCellData(1,5));
		registerPage.setPhoneNumber(ExcelUtils.getCellData(1,6));

		registerPage.selectCountry(ExcelUtils.getCellData(1,7));
		registerPage.setCity(ExcelUtils.getCellData(1,8));
		registerPage.setAdress(ExcelUtils.getCellData(1,9));
		registerPage.setState(ExcelUtils.getCellData(1,10));
		registerPage.setPostalCode(ExcelUtils.getCellData(1,11));
	
		registerPage.elementCheckReceiveOffersByEmail.click();
		registerPage.elementCheckConditionsOfUse.click();
		registerPage.elementButtonRegister.click();
		
		
		Thread.sleep(2000);
		Assert.assertEquals(ExcelUtils.getCellData(1, 1), homePage.elementUserLink.getText());
		
	}
	

}
