package com.tdd.projetoTesteYouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastroSteps {
	WebDriver driver;
	Cadastro cadastro = new Cadastro();



	@Given("^eu entro no site da Youse e entro em minha conta$")
	public void eu_entro_no_site_da_Youse_e_entro_em_minha_conta() throws Throwable {
		cadastro.linkMinhaConta();
		
	}
	
	@When("^seleciono a opção de cadastrar$")
	public void seleciono_a_opção_de_cadastrar() throws Throwable {
	 
		cadastro.telaCadastrar();
	}
	
	@When("^informo os dados para cadastro e confirmo$")
	public void informo_os_dados_para_cadastro_e_confirmo() throws Throwable {
		cadastro.cadastrarNovoUser();
	}
	
	@Then("^deve ser apresentada a mensagem de cadastro realizado com sucesso$")
	public void deve_ser_apresentada_a_mensagem_de_cadastro_realizado_com_sucesso() throws Throwable {
		cadastro.resultCadastro();
		cadastro.closeBrowser();
	}

	
}

