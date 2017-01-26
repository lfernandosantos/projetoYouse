package com.tdd.projetoTesteYouse;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CotacaoSteps {

	Cotacao cotacao = new Cotacao();
	

@Given("^que estou logado$")
public void que_estou_logado() throws Throwable {
    cotacao.loginYouser();
    
}

@When("^escolho realizar uma cotação para seguro automóvel$")
public void escolho_realizar_uma_cotação_para_seguro_automóvel() throws Throwable {
	cotacao.cotaSeguroAuto();
}

@When("^informo meus dados$")
public void informo_meus_dados() throws Throwable {
    cotacao.informDadosPessoais();
}

@When("^preencho as informações sobre meu carro e confirmo$")
public void preencho_as_informações_sobre_meu_carro_e_confirmo() throws Throwable {
    cotacao.informDadosCarro();
    cotacao.infDadosPagamento();
}

@Then("^eu tenho o valor do meu carro e o valor do seguro$")
public void eu_tenho_o_valor_do_meu_carro_e_o_valor_do_seguro() throws Throwable {
    cotacao.resultCotacao();
    cotacao.closeBrowser();
}

}
