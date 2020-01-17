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
import br.com.rsinet.hub_tdd.page.ProductPage;

public class ConsultaProdutoBarraDePesquisa {

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
	public void ConsultarProdutoComSucesso ()throws Exception  {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		ExcelUtils.setExcelFile(Constant.File_DataUserRegister,"Headphone");
	
		homePage.clickIconSearch();
		
		homePage.setSearch(ExcelUtils.getCellData(1, 1));
		homePage.findElementLinkText(ExcelUtils.getCellData(1, 1)); 
		
		productPage.assertEqualsProduct(ExcelUtils.getCellData(1,1));
		Screenshot.getScreenShot(driver, "TesteConsultaProdutoComSucesso ");
	}
	
	@Test
	public void ConsultarProdutoComFalha() throws Exception {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		ExcelUtils.setExcelFile(Constant.File_DataUserRegister,"Headphone");
			
		homePage.clickIconSearch(); 
		homePage.setSearch(ExcelUtils.getCellData(6, 1));
		
		productPage.assertEqualsProductFail(ExcelUtils.getCellData(6,1));
		Screenshot.getScreenShot(driver, "TesteConsultaProdutoFalha ");

	}

}
