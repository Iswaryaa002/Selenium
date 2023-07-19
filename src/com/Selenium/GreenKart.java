package com.Selenium;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

public class GreenKart extends BaseClassOne { 
	public static void main(String[] args) throws InterruptedException, IOException {
		
		browser("chrome");
		getUrl("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		PomPage01 ri = new PomPage01(driver);
		PomPage02 rk = new PomPage02(driver);
		PomPage03 rs = new PomPage03(driver);
		
	    ri.getSearch().sendKeys("Brocolli ");
	    ri.getAddtocart().click();
	    ri.getCarticon().click();
	    ri.getCheckout().click();
	    Thread.sleep(3000);
	    
	    rk.getPromoCode().sendKeys("900300");
	    rk.getApply().click();
	    rk.getPlaceOrder();
	    Thread.sleep(4000);
	    
	    Select s = new Select(rs.getCountry());
	    s.selectByValue("India");
	    rs.getAgree().click();
	    rs.getProceed().click();
	    Thread.sleep(5000);
	    
	    screenshot("GreenKart");
	    quit();
	    
	    
	 }
	
}
