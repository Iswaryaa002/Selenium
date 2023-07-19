package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking extends BaseClassOne{
	
	public static void main(String[] args) throws InterruptedException {
		browser("chrome");
		getUrl("https://adactinhotelapp.com/");
		
		HotelPage1 p= new HotelPage1(driver);
		HotelPage2 p1= new HotelPage2(driver);
		HotelPage3 p2= new HotelPage3(driver);
		
		p.getUsername().sendKeys("iswaryaananthan3");
		p.getPassword().sendKeys("Angel@21");
		p.getLogin().click();
		Thread.sleep(3000);
		
		Select s = new Select(p1.getLocation());
		s.selectByValue("London");
		Select s1 = new Select(p1.getHotelname());
		s1.selectByValue("Hotel Sunshine");
		Select s2 = new Select(p1.getRoomtype());
		s2.selectByValue("Standard");
		Select s3 = new Select(p1.getNoofRooms());
		s3.selectByIndex(2);
		p1.getCheckin().sendKeys("22/05/2023");
		p1.getCheckout().sendKeys("24/05/2023");
		Select s4 = new Select(p1.getAdultroom());
		s4.selectByIndex(3);
		Select s5 = new Select(p1.getChildroom());
		s5.selectByIndex(4);
		p1.getSearch().click();
		p1.getSelectbutton().click();
		p1.getContinue().click();
		
		p2.getFirstname().sendKeys("Ashwarya");
		p2.getLastname().sendKeys("Ananthan");
		p2.getAddress().sendKeys("6/74 Vadapalani,Chennai 6000 26,TamilNadu");
		p2.getCreditcaNo().sendKeys("1234567891234567");
		Select s6 = new Select(p2.getCreditCardType());
		s6.selectByIndex(2);
		Select s7 = new Select(p2.getExpirydate());
		s7.selectByIndex(4);
		Select s8= new Select(p2.getExpiryyear());
		s8.selectByIndex(15);
		p2.getCvvNo().sendKeys("9030");
		p2.getBooknow().click();
		//p2.getMyItinerary().click();
		
		
		
		
		
		
		//WebElement SelectLocation = driver.findElement(By.xpath("//select[@name='location']"));
	    //Select s = new Select(SelectLocation);
		//s.selectByIndex(4);
		//Thread.sleep(2000);
		
		
		//WebElement Hotelname = driver.findElement(By.xpath("//select[@name='hotels']"));
	    //Select s1= new Select(Hotelname);
	    //s1.selectByValue("Hotel Sunshine");
	    
	    //WebElement Roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
	    //Select s2= new Select(Roomtype);
	    //s2.selectByValue("Standard");
	    
	    //WebElement NoofRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
	    //Select s3= new Select(NoofRooms);
	    //s3.selectByIndex(2);
	    
	    //WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	    //checkin.sendKeys("21/05/2023");
	   
	    //WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	    //checkout.sendKeys("22/05/2023");
	
	   // WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
	    //Select s4 = new Select(adultroom);
	    //s4.selectByIndex(3);
	    
	    //WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
	    //Select s5 = new Select(childroom);
	    //s5.selectByIndex(4);
	    
	    //WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
	    //search.click();
	    
	    //WebElement selectbutton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	    //selectbutton.click();
	    
	    //WebElement selectcontinue = driver.findElement(By.xpath("//input[@name='continue']"));
	    //selectcontinue.click();
		
		
		
		
		
		
	}


	

	
}
