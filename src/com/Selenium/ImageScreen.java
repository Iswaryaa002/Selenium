 package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ImageScreen {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumConcept\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.istockphoto.com/photo/natures-beauty-gm180824988-24570495");
		driver.manage().window().maximize();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File abc = ts.getScreenshotAs(OutputType.FILE);
		File def = new File(
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumConcept\\src\\com\\Selenium\\Images ScreenShot\\flow.png");
		Files.copy(abc, def);
		
	}

}
