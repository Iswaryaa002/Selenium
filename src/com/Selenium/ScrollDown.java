package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollDown extends BaseClassOne{
	public static void main(String[] args) throws InterruptedException {
		
		browser("chrome");
		getUrl("https://www.amazon.in/");
		getTitle();
		currentUrl();
		
		WebElement amazonlogo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		JavascriptExecutor jj = (JavascriptExecutor) driver;
		jj.executeScript("arguments[0].scrollIntoView();",amazonlogo);
		
		jj.executeScript("window.scrollBy(0,-1000");
		Thread.sleep(3000);
		
		jj.executeScript("window.scrollBy(0,-1000");
		Thread.sleep(3000);
		
		jj.executeScript("window.scrollBy(0,1000");
		Thread.sleep(3000);
		
		jj.executeScript("window.scrollBy(0,1000");
		Thread.sleep(3000);
		
		jj.executeScript("window.scrollBy(0,1000");
		Thread.sleep(3000);
		
		jj.executeScript("window.scrollBy(0,1000");
		Thread.sleep(3000);
		
		jj.executeScript("window.scrollBy(0,1000");
		Thread.sleep(3000);
		
		quit();
		
	}

	
	

}
