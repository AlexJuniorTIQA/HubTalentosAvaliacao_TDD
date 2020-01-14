package br.com.rsinet.hub_tdd.teste;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.page.HomePage;
import br.com.rsinet.hub_tdd.teste.data.Constant;
import br.com.rsinet.hub_tdd.teste.data.ExcelUtils;
import br.com.rsinet.hub_tdd.teste.data.Screenshot;

public class ConsultaProdutoTelaPrincipal {

	private WebDriver driver;
	

	@Before
	public void Inicializa() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 800));
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@After
	public void finaliza() throws IOException {
		//driver.quit();
	
	}

	@Test
	public void ConsultarProduto ()throws Exception  {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		ExcelUtils.setExcelFile(Constant.File_DataUserRegister,"Headphone");
		
		homePage.elementIconSearch.click();
		homePage.setSearch(ExcelUtils.getCellData(2, 1));
		driver.findElement(By.className("roboto-regular ng-binding")).click();
		
	}
}
