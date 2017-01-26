package com.tdd.projetoTesteYouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cadastro {

	WebDriver driver;
	WebDriverWait wait;
	
	public void linkMinhaConta(){
		ConfigWebDriver conf = new ConfigWebDriver();
		driver = conf.abrirNavegador("https://www.youse.com.br", driver);
		
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='container']/div[1]/header/section/div/div/a[2]")));
		
		driver.findElement(By.xpath("//*[@id='container']/div[1]/header/section/div/div/a[2]")).click();
	}
	
	public void telaCadastrar(){
		System.out.println("Cadastre-se");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='container']/div[2]/a[1]")));
		driver.findElement(By.xpath("//*[@id='container']/div[2]/a[1]")).click();
	}
	
	public void cadastrarNovoUser(){
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.id("user_name")));
		
		System.out.println("Quando eu preencho os campos de cadastro");
		
		WebElement nome = driver.findElement(By.id("user_name"));
		nome.click();
		nome.sendKeys("Teste Youse");
		
		WebElement email = driver.findElement(By.id("user_email"));
		email.click();
		email.sendKeys("teste6@youse.com");
		
		WebElement senha = driver.findElement(By.id("user_password"));
		senha.click();
		senha.sendKeys("12345678");
		
		WebElement confSenha = driver.findElement(By.id("user_password_confirmation"));
		
		confSenha.sendKeys("12345678");
		
	    driver.findElement(By.name("commit")).click();
	}
	
	public void resultCadastro(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='container']/div[1]")));
		
		String mensagem = driver.findElement(By.xpath("//*[@id='container']/div[1]")).getText();
		
		
		if(mensagem.equals("Bem vindo! Você realizou seu registro com sucesso.")){
			System.out.println(mensagem);
		}else {
			System.out.println("Teste não OK.");
		}
	}
	
	public void closeBrowser(){
		driver.close();
	}
}
