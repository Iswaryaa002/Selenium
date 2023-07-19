package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SixthPom5 {
	
	public SixthPom5(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver driver;
	
	@FindBy(xpath="//button[@class='button-1 select-shipping-address-button']")
	private WebElement shipaddress;
	
	@FindBy(xpath="//label[text()='Ground ($0.00)']")
	private WebElement shipingmethod;
	
	@FindBy(xpath="//button[@name='nextstep']")
	private WebElement next1;
	
	@FindBy(xpath="(//input[@name='paymentmethod'])[1]")
	private WebElement paymethod;
	
	@FindBy(xpath="//button[@name='nextstep']")
	private WebElement next2;
	
	@FindBy(xpath="//button[@class='button-1 confirm-order-next-step-button']")
	private WebElement confirm;
	
	@FindBy(xpath="//button[@class='button-1 order-completed-continue-button']")
	private WebElement cont;

	public WebElement getShipaddress() {
		return shipaddress;
	}

	public WebElement getShipingmethod() {
		return shipingmethod;
	}

	public WebElement getNext1() {
		return next1;
	}

	public WebElement getPaymethod() {
		return paymethod;
	}

	public WebElement getNext2() {
		return next2;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getCont() {
		return cont;
	}
	
	

}
