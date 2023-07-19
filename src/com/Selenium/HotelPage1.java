package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage1 {

	public static WebDriver driver;
		
		@FindBy(xpath="//input[@name='username']")
		private WebElement username;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement password;
		
		@FindBy(xpath="//input[@name='login']")
		private WebElement login;
		
		public HotelPage1(WebDriver driver2) {
			this.driver=driver;
			PageFactory.initElements(driver2, this);
	}

		public static WebDriver getDriver() {
			return driver;
		}

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}
		
}
