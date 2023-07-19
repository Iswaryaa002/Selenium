package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SixthPom4 {
	
	public SixthPom4(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver driver;
	
	@FindBy(xpath="//strong[text()='Checkout as a guest or register']")
	private WebElement newaccount;
	
	@FindBy(xpath="//button[@class='button-1 checkout-as-guest-button']")
	private WebElement newguest;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
	private WebElement firstnam;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Company']")
	private WebElement company;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	private WebElement country;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_StateProvinceId']")
	private WebElement state;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address2']")
	private WebElement address2;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	private WebElement zipcode;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	private WebElement phno;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_FaxNumber']")
	private WebElement faxno;
	
	@FindBy(xpath="//button[@name='nextstep']")
	private WebElement  next;

	public WebElement getNewaccount() {
		return newaccount;
	}

	public WebElement getNewguest() {
		return newguest;
	}

	public WebElement getFirstnam() {
		return firstnam;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getFaxno() {
		return faxno;
	}

	public WebElement getNext() {
		return next;
	}
	

}
