package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2ForPro4 {
	
	public Pom2ForPro4(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver driver;
	
	@FindBy(xpath="(//input[@id='customer-email'])[1]")
	private WebElement email;
	
	@FindBy(xpath="(//input[@name='firstname'])")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@name='lastname'])")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@name='company'])")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='street[0]']")
	private WebElement address;
	
	//@FindBy(xpath="(//input[@class='input-text'])[8]")
	//private WebElement address2;
	
	//@FindBy(xpath="(//input[@class='input-text'])[9]")
	//private WebElement address3;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city ;
	
	@FindBy(xpath="//select[@name='region_id']")
	private WebElement state;
	
	@FindBy(xpath="//input[@name='postcode']")
	private WebElement zipcode;
	
	@FindBy(xpath="//select[@name='country_id']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement phno;
	
	@FindBy(xpath="(//td[@class='col col-method'])[1]")
	private WebElement shippingmethod;
	
	@FindBy(xpath="//button[@class='button action continue primary']")
	private WebElement next;
	
	@FindBy(xpath="//button[@title='Place Order']")
	private WebElement order;

	public WebElement getEmail() {
		return email;
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

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getShippingmethod() {
		return shippingmethod;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getOrder() {
		return order;
	}
	
	

	//public WebElement getAddress2() {
		//return address2;
	//}

	//public WebElement getAddress3() {
		//return address3;
	//}
	
	
	
	
	
}



	
	

