package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ProjectNoOne {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumConcept\\driver\\chromedriver.exe");
		
		WebDriver driver = new	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
        password.sendKeys("secret_sauce");
        
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        
        WebElement tshirt = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        tshirt.click();
        
        WebElement bikelight = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        bikelight.click();
        
        WebElement bolttshirt = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        bolttshirt.click();
        
        WebElement saucejacket = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        saucejacket.click();
        
        WebElement cartsauce = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
        cartsauce.click();
        
        WebElement allshirt = driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
        allshirt.click();
        
        WebElement cartlink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartlink.click();
        
        WebElement checkout = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
        checkout.click();
        
        WebElement firstname = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
        firstname.sendKeys("Aishu");
        
        WebElement lastname = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
        lastname.sendKeys("Aishwaya");
        
        WebElement zipcode = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[3]"));
        zipcode.sendKeys("600200");
        Thread.sleep(2000);
        
        WebElement continues = driver.findElement(By.xpath("(//input[@class='submit-button btn btn_primary cart_button btn_action'])"));
        continues.click();
        Thread.sleep(2000);
        
        TakesScreenshot a = (TakesScreenshot) driver;
        File src = a.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumConcept\\src\\com\\Selenium\\Images ScreenShot\\big.png");
        Files.copy(src, des);
       
        WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
        finish.click();
        
        TakesScreenshot b = (TakesScreenshot) driver;
        File src1 = b.getScreenshotAs(OutputType.FILE);
        File des1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumConcept\\src\\com\\Selenium\\Images ScreenShot\\ord.png");
        Files.copy(src1, des1);
        
        WebElement backhome = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backhome.click();
        Thread.sleep(2000);
        
        driver.close();
        
     }
	

}
