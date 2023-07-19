package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage2 {
	public static WebDriver driver;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement Location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement Hotelname;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement Roomtype;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement NoofRooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement Checkin;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement Checkout;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement Adultroom;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement Childroom;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement selectbutton;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement Continue;
	
	public HotelPage2(WebDriver driver2) {
    	this.driver=driver2;
    	PageFactory.initElements(driver2, this);
    	
    }

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotelname() {
		return Hotelname;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getNoofRooms() {
		return NoofRooms;
	}

	public WebElement getCheckin() {
		return Checkin;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdultroom() {
		return Adultroom;
	}

	public WebElement getChildroom() {
		return Childroom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSelectbutton() {
		return selectbutton;
	}

	public WebElement getContinue() {
		return Continue;
	}

	

}
