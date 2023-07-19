package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SixthPom3 {
	
	public SixthPom3(WebDriver driver2) {
		this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='Email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='Password']") 
    private WebElement password;
	
	@FindBy(xpath="(//input[@name='RememberMe'])[1]")
	private WebElement remme;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	private WebElement login;
	

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRemme() {
		return remme;
	}

	public WebElement getLogin() {
		return login;
	}
	


}
