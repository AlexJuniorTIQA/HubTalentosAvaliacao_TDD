package AdvantageOnlineShopping;


import org.openqa.selenium.WebDriver;


public class PageRegister{

	private DSL dsl;
	private PageRegister page;
	
	
	public PageRegister(WebDriver driver){
		dsl = new DSL(driver);
	}
		
	public void setNome(String nome) {
		dsl.escreverXpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[1]/div[1]/sec-view[1]/div/input", nome);
	}
	public void setEmail(String nome) {
		dsl.escreverXpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[1]/div[1]/sec-view[2]/div/input", nome);
	}
	public void setSenha(String nome) {
		dsl.escreverXpath("", nome);
	}
	public void setNome(String nome) {
		dsl.escreverXpath("", nome);
	}
	public void setNome(String nome) {
		dsl.escreverXpath("", nome);
	}
	public void setNome(String nome) {
		dsl.escreverXpath("", nome);
	}
	public void setNome(String nome) {
		dsl.escreverXpath("", nome);
	}
	
}