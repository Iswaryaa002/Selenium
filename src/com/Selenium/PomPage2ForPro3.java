package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage2ForPro3 {
	
	
	public static WebDriver driver;
	 
	 @FindBy(xpath="//a[@class='checkout-button button alt wc-forward wp-element-button']")
	 private WebElement Checkout;
	 
	 @FindBy(xpath="//input[@name='billing_first_name']")
	 private WebElement Firstname;
	 
	 @FindBy(xpath="//input[@name='billing_last_name']")
	 private WebElement Lastname;
	 
	 @FindBy(xpath="//input[@name='billing_company']")
	 private WebElement Comname;
	 
	 @FindBy(xpath="//span[@id='select2-billing_country-container']")
	 private WebElement Country;
	 
	 @FindBy(xpath="//li[text()='India']")
	 private WebElement Coun;
	 
	 @FindBy(xpath="//input[@name='billing_address_1']")
	 private WebElement Address;
	 
	 @FindBy(xpath="//input[@name='billing_address_2']")
	 private WebElement Address2;
	 
	 @FindBy(xpath="//input[@name='billing_city']")
	 private WebElement city;
	 
	 @FindBy(xpath="//span[@id='select2-billing_state-container']")
	 private WebElement State;
	 
	 @FindBy(xpath="//li[text()='Tamil Nadu']")
	 
	 
	 private WebElement Sta;
	 
	 @FindBy(xpath="//input[@id='billing_postcode']")
	 private WebElement ZipCode;
	 
	 @FindBy(xpath="//input[@id='billing_phone']")
	 private WebElement Phone;
	 
	 @FindBy(xpath="//input[@id='billing_email']")
	 private WebElement Email;
	 
	 
	 @FindBy(xpath="//input[@id='terms']")
	 private WebElement Terms;
	 
	 @FindBy(xpath="//button[@id='place_order']")
	 private WebElement Placeorder;
	 
	 
	 
	 
	 public PomPage2ForPro3(WebDriver driver3) {
		 this.driver=driver3;
		 PageFactory.initElements(driver3, this);
	 }


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getCheckout() {
		return Checkout;
	}


	public WebElement getFirstname() {
		return Firstname;
	}


	public WebElement getLastname() {
		return Lastname;
	}
	
	public WebElement getComname() {
		return Comname;
	}


	public WebElement getCountry() {
		return Country;
	}


	public WebElement getAddress() {
		return Address;
	}


	public WebElement getAddress2() {
		return Address2;
	}


	public WebElement getCity() {
		return city;
	}


	public WebElement getState() {
		return State;
	}


	public WebElement getZipCode() {
		return ZipCode;
	}


	public WebElement getPhone() {
		return Phone;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getPlaceorder() {
		return Placeorder;
	}


	public WebElement getTerms() {
		return Terms;
	}


	public WebElement getCoun() {
		return Coun;
	}


	public WebElement getSta() {
		return Sta;
	}


	}
