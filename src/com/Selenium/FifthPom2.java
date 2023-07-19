package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FifthPom2 {
	
	public FifthPom2(WebDriver driver6) {
		this.driver=driver6;
		PageFactory.initElements(driver6, this);
		
	}

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='id_gender1']")
	private WebElement gender;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//option[text()='9']")
	private WebElement date;
	
	@FindBy(xpath="//option[text()='March']")
	private WebElement month;
	
	@FindBy(xpath="//option[text()='2002']")
	private WebElement year;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@id='address2']")
	private WebElement address2;
	
	@FindBy(xpath="//option[@value='India']")
	private WebElement country;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='zipcode']")
	private WebElement zipcode;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	private WebElement mobile;
	
	@FindBy(xpath="(//button[@class='btn btn-default'])[1]")
	private WebElement create;

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
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

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getCreate() {
		return create;
	}
	

}
