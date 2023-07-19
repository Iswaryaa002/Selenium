package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main (String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumConcept\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("keerthana231@gmail.com");
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("123456");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

}
