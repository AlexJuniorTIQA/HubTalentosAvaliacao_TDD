package AdvantageOnlineShopping;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CadastroCliente {
	
	private WebDriver driver;
	private DSL dsl;
	private PageRegister page;
	
	@Before
	public void Inicializa() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/");
		dsl = new DSL(driver);
		page = new PageRegister(driver);
		Thread.sleep(4000);
	}
	
	@Test
	public void NovoUsuario() throws InterruptedException {
		dsl.clicar("menuUser");
	
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		page.setNome("adsasa");
		
	}
	

}
