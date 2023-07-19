package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SixthPom1 {
 
	public SixthPom1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver driver;
	
	@FindBy(xpath="(//img[@title='Show details for Arai Motocross Helmet'])[1]")
	private WebElement click;
	
	@FindBy(xpath="//button[@id='add-to-cart-button-241']")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@class='cart-trigger']")
	private WebElement cart;
	
	public WebElement getClick() {
		return click;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCart() {
		return cart;
	}

	
	
	
	
}
