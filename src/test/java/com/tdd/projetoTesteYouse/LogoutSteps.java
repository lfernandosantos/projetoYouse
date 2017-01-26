package com.tdd.projetoTesteYouse;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutSteps {
	Logout logout = new Logout();
	
	@Given("^que já estou logado$")
	public void que_já_estou_logado() throws Throwable {
	    logout.loginUser();
	}
	
	@When("^clico no nome de usuário e seleciono sair$")
	public void clico_em_meu_nome_de_usuário() throws Throwable {
		logout.logoutUser();
	}
	
	
	@Then("^deve ser apresentada pagina inicial$")
	public void deve_ser_apresentada_pagina_inicial() throws Throwable {
	  logout.resultLogout();
	  logout.closeBrowser();
	}


}
