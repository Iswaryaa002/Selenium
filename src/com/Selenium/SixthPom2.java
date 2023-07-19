package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SixthPom2 {
	public SixthPom2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='termsofservice']")
	private WebElement terms;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement Proceedtocheck;

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getProceedtocheck() {
		return Proceedtocheck;
	}

}
