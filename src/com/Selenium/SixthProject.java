package com.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class SixthProject  extends BaseClassOne{
	public static void main(String[] args) throws InterruptedException {
		
		browser("chrome");
		getUrl("https://estore.onesoftway.com/");
		
		SixthPom1 b =  new SixthPom1(driver);
		SixthPom2 b1 = new SixthPom2(driver);
		//SixthPom3 b2 = new SixthPom3(driver);
		SixthPom4 b3 = new SixthPom4(driver);
		SixthPom5 b4 = new SixthPom5(driver);
		JavascriptExecutor ts = (JavascriptExecutor) driver;
		ts.executeScript("window.scrollBy(0,400)");
		b.getClick().click();
		b.getAddtocart().click();
		Thread.sleep(1000);
		b.getCart().click();
		Thread.sleep(1000);
		
		JavascriptExecutor fv = (JavascriptExecutor) driver;
		fv.executeScript("window.scrollBy(0,500)");
		b1.getTerms().click();
		b1.getProceedtocheck().click();
		
		b3.getNewaccount().click();
		b3.getNewguest().click();
		b3.getFirstnam().sendKeys("Arav");
		b3.getLastname().sendKeys("kumar");
		b3.getEmail().sendKeys("arav@gmail.com");
		b3.getCompany().sendKeys("techpark");
		JavascriptExecutor bm = (JavascriptExecutor) driver; 
		bm.executeScript("window.scrollBy(0,400)");
		Select o = new Select(b3.getCountry());
		o.selectByValue("2");
		Thread.sleep(1000);
		Select j = new Select(b3.getState());
		j.selectByValue("66");
		b3.getCity().sendKeys("Thindivanam");
		b3.getAddress().sendKeys("7/90 Sch st,Thindivanam");
		b3.getAddress2().sendKeys("Villupuram");
		b3.getZipcode().sendKeys("604206");
		b3.getPhno().sendKeys("3456217890");
		b3.getFaxno().sendKeys("456789");
		b3.getNext().click();
		
		b4.getShipaddress().click();
		b4.getShipingmethod().click();
		b4.getNext1().click();
		b4.getPaymethod().click();
		b4.getNext2().click();
		b4.getNext2().click();
		b4.getConfirm().click();
		b4.getCont().click();
		
		
		
	}
      
       
}
