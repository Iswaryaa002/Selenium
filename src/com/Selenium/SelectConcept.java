package com.Selenium;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectConcept extends BaseClassOne{
	 

	public static void main(String[] args) throws InterruptedException {
		 
		 browser("edge");
		 getUrl("https://www.facebook.com/signup");
		 
		 WebElement date  = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 Select n = new Select(date);
		 n.selectByValue("9");
		 Thread.sleep(1000);
		 
		 WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 Select n1 =new Select(month);
		 n1.selectByIndex(2);
		 Thread.sleep(1000);
		 
		 WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		 Select n2 = new Select(year);
		 n2.selectByValue("2002");
		 Thread.sleep(1000);
		 
		 
				 
		 	
		 
		
		 
		 
		
		 
		 
	 }
}
	
	