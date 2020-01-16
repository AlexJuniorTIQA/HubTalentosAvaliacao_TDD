package br.com.rsinet.hub_tdd.teste;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_tdd.files.Constant;
import br.com.rsinet.hub_tdd.files.ExcelUtils;
import br.com.rsinet.hub_tdd.files.Screenshot;
import br.com.rsinet.hub_tdd.page.DriverElement;
import br.com.rsinet.hub_tdd.page.HomePage;
import br.com.rsinet.hub_tdd.page.ProductPage;


public class ConsultaTelaInicial {

	private WebDriver driver;
	

	@Before
	public void Inicializa() throws InterruptedException {
		DriverElement element = new DriverElement();
		driver = element.getChromeDriver(driver);
	}
	@After
	public void finaliza() throws IOException {
		driver.quit();
	}
	@Test
	public void ConsultarProdutoSucesso ()throws Exception  {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		ExcelUtils.setExcelFile(Constant.File_DataUserRegister,"Mice");
		
		homePage.javaScriptClick(By.id("miceTxt"));
		homePage.findElementLinkText(ExcelUtils.getCellData(3, 1));
		
		productPage.assertEqualsProduct(ExcelUtils.getCellData(3, 1));
		Screenshot.getScreenShot(driver, "TesteConsultaTelaPrincipalSucesso ");
	}
}
