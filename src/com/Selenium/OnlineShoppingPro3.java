package com.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class OnlineShoppingPro3 extends BaseClassOne{
	
	public static void main(String[] args) throws InterruptedException {
		
		browser("chrome");
		getUrl("https://shop.demoqa.com/");
		
		PomPage1ForPro3 g = new PomPage1ForPro3(driver);
		PomPage2ForPro3 g1 = new PomPage2ForPro3(driver);
		
		
		g.getTshirt().click();
		
		g.getTumbimage1().click();
		g.getTumbimag2().click();
		g.getTumbimg3().click();
		g.getTumbimag4().click();
		g.getIncrease().click();
		Select s = new Select(g.getDressClr());
		s.selectByValue("pink");
		Select s1 = new Select(g.getDresssize());
		s1.selectByIndex(1);	
		g.getSubaddcart().click();
		Thread.sleep(3000);
        g.getViewcart().click();
       
        g1.getCheckout().click();
        g1.getFirstname().sendKeys("aishu");
        g1.getLastname().sendKeys("Ananthan");
        g1.getComname().sendKeys("Digitize");
        g1.getCountry().click();
        g1.getCoun().click();
        g1.getAddress().sendKeys("90 School Street");
        g1.getAddress2().sendKeys("Chaaru Apartment");
        g1.getCity().sendKeys("Thindivanam");
        g1.getState().click();
        g1.getSta().click();
        g1.getZipCode().sendKeys("604206");
        g1.getPhone().sendKeys("8865768798");
        g1.getEmail().sendKeys("iswaryaa@gamil.com");
        JavascriptExecutor fr = (JavascriptExecutor) driver;
        fr.executeScript("window.scrollBy(0,-500)");
        g1.getTerms().click();
        Thread.sleep(2000);
        g1.getPlaceorder().click();
        Thread.sleep(3000);
        
        
		
		
		
		
				
		
	}

}
