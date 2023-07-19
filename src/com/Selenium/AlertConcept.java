package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumConcept\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		WebElement Simplealert = driver.findElement(By.xpath("(//button[@class = 'btn btn-primary'])[2]"));
		Simplealert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
		WebElement confirmalert = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
		confirmalert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		WebElement promptalert = driver.findElement(By.id("promtButton"));
		promptalert.click();
		driver.switchTo().alert().sendKeys("Keerthana");
		driver.switchTo().alert().accept();
		
		driver.navigate().to("https://www.facebook.com/");
		//WebElement CreateAccount = driver.findElement(By.linkText("Create new account"));
		//CreateAccount.click();
		
		driver.findElement(By.partialLinkText("Create")).click();
		}
}

		
		
		
		