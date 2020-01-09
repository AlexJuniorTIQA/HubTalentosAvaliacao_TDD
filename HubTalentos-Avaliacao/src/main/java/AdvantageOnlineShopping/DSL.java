package AdvantageOnlineShopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {private WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
	}
	/***Inserir a ID do Elemento***/
	public void clicar(String id) {
		driver.findElement(By.id(id)).click();
	}
	/***Insira o Elemento e o Texto desejado, este metado limpa o campo antes de digitar***/
	public void escrever(By by, String texto){
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(texto);
	}
	/***Insira o Elemento e o Texto desejado***/
	public void escrever(String id_campo, String texto){
		escrever(By.id(id_campo), texto);
	}
	public void escreverXpath(String xpath, String texto){
		escrever(By.xpath(xpath), texto);
	}
	
}
