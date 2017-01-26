package com.tdd.projetoTesteYouse;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	WebDriver driver;
	WebDriverWait wait;
	
	
	public void abrirSite(){
		System.out.println("Teste de logar usuário");
		ConfigWebDriver conf = new ConfigWebDriver();
		driver = conf.abrirNavegador("https://www.youse.com.br", driver);
	}
	
	public void minhaConta(){
		
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='container']/div[1]/header/section/div/div/a[2]")));
		
		driver.findElement(By.xpath("//*[@id='container']/div[1]/header/section/div/div/a[2]")).click();
	}
	
	public void infoEmail(String arg1){
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.id("email")));
		
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.name("commit")).click();
	}
	
	public void infoSenha(int arg1){
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.id("user_password")));
		
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys(String.valueOf(arg1));
		
		driver.findElement(By.name("commit")).click();
	}
	
	public void resultLogin(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='container']/div[1]/div/div[2]")));
		String mensagem = driver.findElement(By.xpath("//*[@id='container']/div[1]/div/div[2]")).getText();
		
		
		if(mensagem.equals("Login efetuado com sucesso.")){
			System.out.println(mensagem);
		}else {
			System.out.println("Teste não apresentou o comportamento esperado.");
		}
	}
	
	public void closeBrowser(){
		driver.close();
	}
	
		
}
