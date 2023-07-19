package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage1ForPro3 {
	public static WebDriver driver;
	
    @FindBy(xpath="//a[text()='pink drop shoulder oversized t shirt']")
	private WebElement Tshirt;
    
	@FindBy(xpath="//select[@id='pa_color']")
	private WebElement DressClr;
	
	@FindBy(xpath="//select[@id='pa_size']")
	private WebElement Dresssize;
	
	@FindBy(xpath="(//img[@class='noo-woo-thumbnails__image'])[1]")
	private WebElement Tumbimage1;
	
	@FindBy(xpath="(//img[@class='noo-woo-thumbnails__image'])[2]")
	private WebElement Tumbimag2;
	
	@FindBy(xpath="(//img[@class='noo-woo-thumbnails__image'])[3]")
	private WebElement Tumbimg3;
	
	@FindBy(xpath="(//img[@class='noo-woo-thumbnails__image'])[4]")
	private WebElement Tumbimag4;
	
	
	@FindBy(xpath="//button[@class='qty-increase']")
	private WebElement Increase;
	
	@FindBy(xpath="//button[@class='single_add_to_cart_button button alt wp-element-button']")
	private WebElement subaddcart;
	
	@FindBy(xpath="//a[@class='button wc-forward wp-element-button']")
	private WebElement Viewcart;
	
	public PomPage1ForPro3(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver3, this);
		
	}
	
	
	public WebElement getTshirt() {
		return Tshirt;
	}
    public WebElement getTumbimage1() {
		return Tumbimage1;
	}


	public WebElement getTumbimag2() {
		return Tumbimag2;
	}


	public WebElement getTumbimg3() {
		return Tumbimg3;
	}


	public WebElement getTumbimag4() {
		return Tumbimag4;
	}


	public WebElement getIncrease() {
		return Increase;
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getDressClr() {
		return DressClr;
	}


	public WebElement getDresssize() {
		return Dresssize;
	}
	public WebElement getSubaddcart() {
		return subaddcart;
	}


	public WebElement getViewcart() {
		return Viewcart;
	}

	

	
	
	
		
	
		
		
		
		
		
	}


