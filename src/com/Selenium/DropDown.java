package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BaseClassOne {
	
	public static void main(String[] args) {
		browser("chrome");
		getUrl("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement multiple = driver.findElement(By.xpath("//select[@id='second']")); 
		Select f = new Select(multiple);
		f.selectByIndex(0);
		f.selectByIndex(3);
		boolean multiple2 = f.isMultiple();
		System.out.println(multiple2);
		
		List<WebElement> allSelectedOptions = f.getAllSelectedOptions();
		System.out.println(allSelectedOptions);
		for (WebElement r  : allSelectedOptions ) {
			System.out.println(r.getText());
			
		}
		
	}

}
