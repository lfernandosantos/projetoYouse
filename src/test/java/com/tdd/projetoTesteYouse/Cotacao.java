package com.tdd.projetoTesteYouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cotacao {
	
	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	Select select;
	
	public void loginYouser(){
		System.out.println("Teste de logar usuário");
		ConfigWebDriver conf = new ConfigWebDriver();
		driver = conf.abrirNavegador("https://www.youse.com.br", driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='container']/div[1]/header/section/div/div/a[2]")));
		
		driver.findElement(By.xpath("//*[@id='container']/div[1]/header/section/div/div/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("lf.testYouse@youse.com");
		driver.findElement(By.xpath("//*[@id='container']/div[2]/article/form/div/input")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='user_password']")));
		
		driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//*[@id='new_user']/div/input")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='container']/div[1]/div/div[2]")));
		String mensagem = driver.findElement(By.xpath("//*[@id='container']/div[1]/div/div[2]")).getText();
		
		if(mensagem.equals("Login efetuado com sucesso.")){
			System.out.println(mensagem);
		}else {
			System.out.println("Teste não apresentou o comportamento esperado.");
		}
		
	}
	
	public void cotaSeguroAuto() throws InterruptedException{
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='container']/div[3]/div/div/article[1]/a")));
				
		driver.findElement(By.xpath("//*[@id='container']/div[3]/div/div/article[2]/a")).click();
			
	}
	
	public void informDadosPessoais() throws InterruptedException{
		Thread.sleep(1000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='auto_order_flow_lead_person_data_lead_person_attributes_name']")));
		
		driver.findElement(By.xpath("//*[@id='auto_order_flow_lead_person_data_lead_person_attributes_name']")).click();
		driver.findElement(By
				.xpath("//*[@id='auto_order_flow_lead_person_data_lead_person_attributes_name']"))
					.clear();
		driver.findElement(By
				.xpath("//*[@id='auto_order_flow_lead_person_data_lead_person_attributes_name']"))
					.sendKeys("Luiz");
		
		driver.findElement(By.xpath("//*[@id='auto_order_flow_lead_person_data_lead_person_attributes_phone']")).click();
		driver.findElement(By
				.xpath("//*[@id='auto_order_flow_lead_person_data_lead_person_attributes_phone']"))
					.sendKeys("11999999999");
		
		driver.findElement(By.xpath("//*[@id='auto_order_flow_lead_person_data_lead_person_attributes_email']")).click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.name("commit")));
		
		driver.findElement(By.name("commit")).click();	
	}
	
	
	public void informDadosCarro() throws InterruptedException{

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='auto_order_flow_pricing_requirements_vehicle_attributes_make']")));
		
		select=new Select(driver
				.findElement(By.xpath("//*[@id='auto_order_flow_pricing_requirements_vehicle_attributes_make']")));
		select.selectByIndex(2);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='auto_order_flow_pricing_requirements_vehicle_attributes_model']")));
		
		Thread.sleep(1000);
		select=new Select(driver
				.findElement(By.xpath("//*[@id='auto_order_flow_pricing_requirements_vehicle_attributes_model']")));
		select.selectByIndex(4);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.id("auto_order_flow_pricing_requirements_vehicle_attributes_year")));
		
		Thread.sleep(1000);
		select=new Select(driver
				.findElement(By.id("auto_order_flow_pricing_requirements_vehicle_attributes_year")));
		select.selectByIndex(2);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.id("auto_order_flow_pricing_requirements_vehicle_attributes_version")));
		Thread.sleep(1000);
		select=new Select(driver
				.findElement(By.id("auto_order_flow_pricing_requirements_vehicle_attributes_version")));
		select.selectByIndex(1);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='auto_order_flow_pricing_requirements_vehicle_attributes_usage']")));
		
		select=new Select(driver
				.findElement(By.xpath("//*[@id='auto_order_flow_pricing_requirements_vehicle_attributes_usage']")));
		select.selectByIndex(2);
		
		driver
		.findElement(By
				.xpath("//*[@id='auto_order_flow_pricing_requirements_vehicle_attributes_address_attributes_zipcode']"))
		.click();
		
		driver
		.findElement(By
				.xpath("//*[@id='auto_order_flow_pricing_requirements_vehicle_attributes_address_attributes_zipcode']"))
		.clear();
		
		driver
		.findElement(By
				.xpath("//*[@id='auto_order_flow_pricing_requirements_vehicle_attributes_address_attributes_zipcode']"))
		.sendKeys("26562-110");
		
		select=new Select(driver
				.findElement(By.id("auto_order_flow_pricing_requirements_insured_person_attributes_gender")));
		select.selectByIndex(1);
		
		driver
		.findElement(By
				.id("auto_order_flow_pricing_requirements_insured_person_attributes_date_of_birth")).click();
		driver
		.findElement(By
				.id("auto_order_flow_pricing_requirements_insured_person_attributes_date_of_birth")).clear();
		driver
		.findElement(By
				.id("auto_order_flow_pricing_requirements_insured_person_attributes_date_of_birth"))
		.sendKeys("28/05/1992");
		
		
		select=new Select(driver
				.findElement(By
						.xpath("//*[@id='auto_order_flow_pricing_requirements_insured_person_attributes_marital_status']")));
		select.selectByIndex(1);
		
		select=new Select(driver
				.findElement(By
						.id("auto_order_flow_pricing_requirements_driver_attributes_same_as_insured_person")));
		select.selectByIndex(0);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.id("auto_order_flow_pricing_requirements_driver_attributes_young_driver")));
		
		select=new Select(driver
				.findElement(By
						.id("auto_order_flow_pricing_requirements_driver_attributes_young_driver")));
		select.selectByIndex(1);
		
		select=new Select(driver
				.findElement(By
						.id("auto_order_flow_pricing_requirements_driver_attributes_years_since_last_claim")));
		select.selectByIndex(1);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.name("commit")));
		
		driver
		.findElement(By
				.name("commit")).click();
		
		
		
	}
	
	public void resultCotacao(){
	
	}
	
	public void infDadosPagamento(){
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.name("commit")));
		
		driver
		.findElement(By
				.name("commit")).click();
	

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.name("commit")));
		
		driver
		.findElement(By
				.name("commit")).click();
		
		
		driver.findElement(By
		.id("auto_order_flow_insured_person_data_insured_person_attributes_name"))
		.sendKeys("Teste Youse Nome Completo");
		
		driver.findElement(By
				.id("auto_order_flow_insured_person_data_insured_person_attributes_cpf"))
				.sendKeys("12312312387");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		select=new Select(driver
				.findElement(By
						.id("auto_order_flow_insured_person_data_insured_person_attributes_nationality")));
		select.selectByVisibleText("Brasil");
			
		driver.findElement(By
				.id("select2-auto_order_flow_insured_person_data_insured_person_attributes_occupation-container")).click();
		
//		WebElement cargo = driver.findElement(By
//				.xpath("//*[@id='container']/span[10]/span/span[1]/input"));
//		cargo.sendKeys("Analista");
//		
//		
//		select=new Select(driver
//				.findElement(By
//						.id("auto_order_flow_insured_person_data_insured_person_attributes_salary_range")));
//		select.selectByIndex(2);
//		
//		driver.findElement(By
//				.id("auto_order_flow_insured_person_data_insured_person_attributes_address_attributes_number"))
//				.sendKeys("100");
//		
//		driver.findElement(By
//				.id("auto_order_flow_insured_person_data_insured_person_attributes_address_attributes_complement"))
//				.sendKeys("casa");
	}
	public void closeBrowser(){
		driver.close();
	}
}
