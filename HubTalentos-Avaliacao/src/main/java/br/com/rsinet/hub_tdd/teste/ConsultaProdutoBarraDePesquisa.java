package br.com.rsinet.hub_tdd.teste;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.files.Constant;
import br.com.rsinet.hub_tdd.files.ExcelUtils;
import br.com.rsinet.hub_tdd.files.Screenshot;
import br.com.rsinet.hub_tdd.page.HomePage;
import br.com.rsinet.hub_tdd.page.ProductPage;

public class ConsultaProdutoBarraDePesquisa {

	private WebDriver driver;
	

	@Before
	public void Inicializa() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@After
	public void finaliza() throws IOException {
	driver.quit();
	}
	@Test
	public void ConsultarProduto ()throws Exception  {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		ExcelUtils.setExcelFile(Constant.File_DataUserRegister,"Headphone");
			
		homePage.javaScriptClick(By.id("miceTxt")); 
		homePage.setSearch(ExcelUtils.getCellData(2, 1) + Keys.ENTER);
		homePage.findElementLinkText(ExcelUtils.getCellData(2, 1)); 
		
		productPage.assertEqualsProduct(ExcelUtils.getCellData(2,1));
		
		Screenshot.getScreenShot(driver, "TesteConsultaProduto ");
		
		
		
	}
}
