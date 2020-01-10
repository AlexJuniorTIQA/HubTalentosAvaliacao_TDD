package br.com.rsinet.hub_tdd;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastroCliente {

	private WebDriver driver;
	
	private PageRegister page;

	@Before
	public void Inicializa() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/");
		page = new PageRegister();
		Thread.sleep(4000);
	}

	@Test
	public void NovoUsuario() throws InterruptedException {
		
		driver.findElement(By.id("menuUser")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();
		Thread.sleep(4000);
		
		
		PageRegister.txtbx_Password.sendKeys("DFSWDFS");
		
		

	}

}
