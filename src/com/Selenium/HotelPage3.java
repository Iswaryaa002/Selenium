package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage3 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement Firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement Lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement CreditcaNo;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement CreditCardType;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement Expirydate;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement Expiryyear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement CvvNo;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement Booknow;
	
	//@FindBy(xpath="//input[@name='my_itinerary']")
	//private WebElement MyItinerary;
	


	public HotelPage3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcaNo() {
		return CreditcaNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getExpirydate() {
		return Expirydate;
	}

	public WebElement getExpiryyear() {
		return Expiryyear;
	}

	public WebElement getCvvNo() {
		return CvvNo;
	}

	public WebElement getBooknow() {
		return Booknow;
	}
	//public WebElement getMyItinerary() {
		//return MyItinerary;
	//}
	
	
	
	
	
	
	
	
	
	
	

}
