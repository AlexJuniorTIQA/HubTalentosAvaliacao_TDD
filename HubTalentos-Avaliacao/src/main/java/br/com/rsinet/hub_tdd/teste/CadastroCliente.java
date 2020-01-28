package br.com.rsinet.hub_tdd.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_tdd.files.Constant;
import br.com.rsinet.hub_tdd.files.ExcelUtils;
import br.com.rsinet.hub_tdd.files.Screenshot;
import br.com.rsinet.hub_tdd.page.DriverElement;
import br.com.rsinet.hub_tdd.page.HomePage;
import br.com.rsinet.hub_tdd.page.RegisterPage;

public class CadastroCliente {

	private WebDriver driver;
	


	@Before
	public void Inicializa() throws Exception {
		
		driver = DriverElement.getChromeDriver();
	}
	
	@After
	public void finaliza() {
		DriverElement.quitDriver(driver);
	}

	@Test
	public void NovoUsuarioComSucesso() throws Exception {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
        ExcelUtils.setExcelFile(Constant.File_DataUserRegister,"Users");
		
		homePage.clickIconuser();
		homePage.clickCreatNewAccount();
		
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
		
		registerPage.clickCheckConditionsOfUse();
		registerPage.clickButtonRegister();

		homePage.waitHome();

		homePage.assertEqualsUser(ExcelUtils.getCellData(1,1));
		Screenshot.getScreenShot(driver, "TesteNovoUsuário_Sucesso ");
	}
	
	
	
	@Test
	public void NovoUsuarioComFalhaB() throws Exception {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
        ExcelUtils.setExcelFile(Constant.File_DataUserRegister,"Users");
		
		homePage.clickIconuser();
		homePage.clickCreatNewAccount();
		
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

		registerPage.clickCheckConditionsOfUse();
		registerPage.clickButtonRegisterFail();
		
		
		registerPage.assertEqualsRegisterFail();
		Screenshot.getScreenShot(driver, "TesteNovoUsuário_Falha ");
	}
}
