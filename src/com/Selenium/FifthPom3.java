package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FifthPom3 {
	public FifthPom3(WebDriver driver7) {
		 this.driver=driver7;
		 PageFactory.initElements(driver7, this);
	}

	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement con;

	public WebElement getCon() {
		return con;
	}
	
}
