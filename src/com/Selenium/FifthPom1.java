package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FifthPom1 {
	public FifthPom1(WebDriver driver5) {
		this.driver=driver5;
		PageFactory.initElements(driver5,this);
	}

	public static WebDriver driver;
	
	@FindBy(xpath="(//a[@class='btn btn-default add-to-cart'])[3]")
	private WebElement addcart;
	
	@FindBy(xpath="//u[text()='View Cart']")
	private WebElement viewcart;
	
	@FindBy(xpath="//a[@class='btn btn-default check_out']")
	private WebElement checkout;
	
	@FindBy(xpath="//u[text()='Register / Login']")
	private WebElement login;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	private WebElement email;
	
	@FindBy(xpath="(//button[@class='btn btn-default'])[2]")
	private WebElement signup;

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getViewcart() {
		return viewcart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSignup() {
		return signup;
	}

}

