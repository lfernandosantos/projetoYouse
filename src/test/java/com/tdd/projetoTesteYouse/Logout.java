package com.tdd.projetoTesteYouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {
	
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	Login login = new Login();
	String email = "email", senha = "user_password", confirmar = "commit",
			minhaContaXpath = "//*[@id='container']/div[1]/header/section/div/div/a[2]",
			nomeUserXpath = "//*[@id='container']/header/div[1]/nav/ul/li/a",
			sair = "track_logout";
			
	
	public void loginUser(){
		System.out.println("Teste de logar usuário");
		ConfigWebDriver conf = new ConfigWebDriver();
		driver = conf.abrirNavegador("https://www.youse.com.br", driver);

		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(minhaContaXpath)));
		
		driver.findElement(By.xpath(minhaContaXpath)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.id("email")));
		
		driver.findElement(By.id("email")).sendKeys("lf.testYouse@youse.com");
		driver.findElement(By.name("commit")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.id(senha)));
		
		driver.findElement(By.id(senha)).click();
		driver.findElement(By.id(senha)).sendKeys("12345678");
		
		driver.findElement(By.name("commit")).click();
		
	}
	
	public void logoutUser(){
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(nomeUserXpath)));
				
		actions = new Actions(driver);
		actions.moveToElement(driver
				.findElement(By.xpath(nomeUserXpath))).build()
		.perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		actions.moveToElement(driver
		.findElement(By.id(sair))).build()
		.perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id(sair)).click();
		
	}
	
	
	public void resultLogout(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='container']/div[1]/div[2]/section[1]/section/div/strong")));
		
		String mensagem = driver
				.findElement(By.xpath("//*[@id='container']/div[1]/div[2]/section[1]/section/div/strong")).getText();
		
		if(mensagem.equals("somos a Youse")){
			System.out.println(mensagem);
		}else {
			System.out.println("Teste não OK!");
		}
	}
	
	public void closeBrowser(){
		driver.close();
	}

}
