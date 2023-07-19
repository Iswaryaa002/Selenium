package com.Selenium;

import org.openqa.selenium.JavascriptExecutor;

public class FifthProject extends BaseClassOne{
	
	public static void main(String[] args) throws InterruptedException {
		browser("chrome");
		getUrl("https://automationexercise.com/");
		JavascriptExecutor hs = (JavascriptExecutor) driver;
		hs.executeScript("window.scrollBy(0,300)");
		FifthPom1 g = new FifthPom1 (driver);
		FifthPom2 g1 = new FifthPom2(driver);
		FifthPom3 g2 = new FifthPom3(driver);
		g.getAddcart().click();
		Thread.sleep(1000);
		g.getViewcart().click();
		Thread.sleep(1000);
		g.getCheckout().click();
		g.getLogin().click();
		g.getName().sendKeys("Dora");
		g.getEmail().sendKeys("sing@gmail.com");
		g.getSignup().click();
		
		g1.getGender().click();
		g1.getPassword().sendKeys("9000002000");
		g1.getDate().click();
		g1.getMonth().click();
		g1.getYear().click();
		g1.getFirstname().sendKeys("icee");
		g1.getLastname().sendKeys("Aisheeeee");
		g1.getCompany().sendKeys("Kensium");
		g1.getAddress1().sendKeys("no 7 vadapalani chennai-06");
		g1.getAddress2().sendKeys("Barathi Nagar");
		g1.getCountry().click();
		g1.getState().sendKeys("tamilnadu");
		g1.getCity().sendKeys("Nungambakkam");
		g1.getZipcode().sendKeys("602678");
		g1.getMobile().sendKeys("8789065423");
		JavascriptExecutor df = (JavascriptExecutor) driver;
		df.executeScript("window.scrollBy(0,400)");
		g1.getCreate().click();
		Thread.sleep(1000);
		
		g2.getCon().click();
		Thread.sleep(2000);
		
		
		
	}
	

	

}
