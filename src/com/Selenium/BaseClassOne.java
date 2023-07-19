
package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class BaseClassOne {
	public static WebDriver driver;
	
	public static void browser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumConcept\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumConcept\\driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	    }
		
	    }
	     public static void getUrl(String url) {
	     driver.get(url);
	    	
	    }
	     public static void getTitle() {
	    	 System.out.println(driver.getTitle());
	    	 
	    }
	     public static void currentUrl() {
	    	 System.out.println(driver.getCurrentUrl());
	     }
	     public static void quit() {
	    	 driver.quit();
	    }
	    
	     public static void screenshot(String name) throws IOException {
	    	 
	    	 TakesScreenshot ts = (TakesScreenshot) driver;
	    	 File src = ts.getScreenshotAs(OutputType.FILE);
	    	 File des = new File(
	    			 "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumConcept\\src\\com\\Selenium\\Images ScreenShot\\GreenKart.png");
	    	 Files.copy(src, des);
	     }
}


