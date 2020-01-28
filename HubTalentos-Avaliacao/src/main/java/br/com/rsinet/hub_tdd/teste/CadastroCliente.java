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
import br.com.rsinet.hub_tdd.page.UserRegister;

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
		ExcelUtils.setExcelFile(Constant.File_DataUserRegister, "Users");
		UserRegister userRegister = PageFactory.initElements(driver, UserRegister.class);

		homePage.clickIconuser();
		homePage.clickCreatNewAccount();

		userRegister.setUserRegister(1);

		registerPage.clickButtonRegister();

		homePage.waitHome();
		
		homePage.assertEqualsUser(ExcelUtils.getCellData(1, 1));
		Screenshot.getScreenShot(driver, "TesteNovoUsuário_Sucesso ");
	}

	@Test
	public void NovoUsuarioComFalhaB() throws Exception {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
		ExcelUtils.setExcelFile(Constant.File_DataUserRegister, "Users");
		UserRegister userRegister = PageFactory.initElements(driver, UserRegister.class);
		
		homePage.clickIconuser();
		homePage.clickCreatNewAccount();
		
		userRegister.setUserRegister(1);
		
		registerPage.clickButtonRegisterFail();

		registerPage.assertEqualsRegisterFail();
		Screenshot.getScreenShot(driver, "TesteNovoUsuário_Falha ");
	}
}
