package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1ForPro4 {
	public Pom1ForPro4(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver driver;
	
	@FindBy(xpath="(//a[@class='product-item-link'])[4]")
	private WebElement title;
	
	@FindBy(xpath="//div[@id='option-label-size-143-item-169']")
	private WebElement  size;
	
	@FindBy(xpath="//div[@id='option-label-color-93-item-49']")
	private WebElement clr;
	
	@FindBy(xpath="//input[@id='qty']")
	private WebElement qty;
	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	private WebElement addtocart;
	
	@FindBy(xpath="(//span[@class='counter qty'])[m   1]")
	private WebElement cart;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement checkout;

	public WebElement getTitle() {
		return title;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getClr() {
		return clr;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
	
}

