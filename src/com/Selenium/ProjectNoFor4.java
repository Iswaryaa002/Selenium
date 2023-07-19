package com.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;


public class ProjectNoFor4 extends BaseClassOne {
	public static void main(String[] args) throws InterruptedException {
		
		browser("chrome");
		getUrl("https://magento.softwaretestingboard.com/");
		
		Pom1ForPro4 a = new Pom1ForPro4(driver);
		Pom2ForPro4 a1 = new Pom2ForPro4(driver);
		
		a.getTitle().click();
		Thread.sleep(3000);
		a.getSize().click();
		Thread.sleep(3000);
		a.getClr().click();
		Thread.sleep(3000);
		a.getQty().sendKeys("1");
		Thread.sleep(3000);
		a.getAddtocart().click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		a.getCart().click();
		Thread.sleep(3000);
		a.getCheckout().click();
		Thread.sleep(2000);
		
		Thread.sleep(10000);
		a1.getEmail().sendKeys("isssag@gmail.com");
		a1.getFirstname().sendKeys("Catt");
		a1.getLastname().sendKeys("Dog");
		a1.getCompany().sendKeys("Digital Limited");
		Thread.sleep(2000);
		a1.getAddress().sendKeys("Vadapalani Barathi nagar,chennai");
		Thread.sleep(2000);
		JavascriptExecutor kl = (JavascriptExecutor) driver;
		kl.executeScript("window.scrollBy(0,+200)");
		a1.getCity().sendKeys("chennai");
		Thread.sleep(2000);
		Select s = new Select(a1.getState());
		s.selectByVisibleText("Alaska");
		Thread.sleep(2000);
		a1.getZipcode().sendKeys("600026");
		Thread.sleep(2000);
		Select s1 = new Select(a1.getCountry());
	    s1.selectByValue("US");
	    Thread.sleep(2000);
	    a1.getPhno().sendKeys("9003071876");
	    Thread.sleep(2000);
	    a1.getShippingmethod().click();
	    Thread.sleep(2000);
	    a1.getNext().click();
	    Thread.sleep(3000);
	    JavascriptExecutor nm = (JavascriptExecutor) driver;
	    nm.executeScript("window.scrollBy(0,+100)");
	    Thread.sleep(2000);
	    a1.getOrder().click();
	    Thread.sleep(2000);
	    
		}

}
