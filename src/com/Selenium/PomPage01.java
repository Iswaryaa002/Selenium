package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage01 {
	public static WebDriver driver;
	
	@FindBy(xpath ="//input[@class='search-keyword']")
	private WebElement search;
	
	@FindBy(xpath="(//button[text() ='ADD TO CART'])[1]")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@class='cart-icon']")
	private WebElement carticon;
	
	@FindBy(xpath="//button[text() = 'PROCEED TO CHECKOUT']")
	private WebElement Checkout;
	
	public PomPage01(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2,this);
	}

	public static WebDriver getDriver() {
		return driver;
	}
   public WebElement getSearch() {
		return search;
	}
   public WebElement getAddtocart() {
		return addtocart;
	}
   public WebElement getCarticon() {
		return carticon;
	}
  public WebElement getCheckout() {
		return Checkout;
	}

	}

 
	

	
	
	
	
	
	


