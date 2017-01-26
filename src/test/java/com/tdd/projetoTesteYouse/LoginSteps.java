package com.tdd.projetoTesteYouse;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	Login login = new Login();

	
	
	@Given("^que entro no site da Youse$")
	public void que_entro_no_site_da_Youse() throws Throwable {
	    login.abrirSite();
	}
	
	@When("^eu clico em Minha Conta$")
	public void eu_clico_em_Minha_Conta() throws Throwable {
	    login.minhaConta();
	}
	
	@When("^informo email \"([^\"]*)\" e clico em proximo passo$")
	public void informo_email_e_clico_em_proximo_passo(String arg1) throws Throwable {
		login.infoEmail(arg1);
	}
	
	@When("^informo a senha '(\\d+)' e clico em entrar$")
	public void informo_a_senha_e_clico_em_entrar(int arg1) throws Throwable {
	   login.infoSenha(arg1);
	}
	
	@Then("^o login deve ser realizado com sucesso$")
	public void o_login_deve_ser_realizado_com_sucesso() throws Throwable {
	    login.resultLogin();
	    login.closeBrowser();
	}
	

}
