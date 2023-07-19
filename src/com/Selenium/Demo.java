package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void  main (String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Web driver\\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
	}

}
