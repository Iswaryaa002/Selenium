package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignUp {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumConcept\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
	    WebElement name  = driver.findElement(By.name("firstname"));
		name.sendKeys("tom");
	    WebElement surName = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
		surName.sendKeys("jerry");
		WebElement email = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		email.sendKeys("aishu@gmail.com");
		 WebElement password = driver.findElement(By.xpath("(//input[@data-type='password']"));
		password.sendKeys("12345678");
		//WebElement reEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		//reEmail.sendKeys("aishu@gmail.com");
	    WebElement day = driver.findElement(By.name("birthday_day"));
		Select s= new Select(day);
		s.selectByIndex(9);
		WebElement month = driver .findElement(By.id("month"));
		Select s1 = new Select(month);
        s1.selectByValue("3");
        WebElement year = driver.findElement(By.id("year"));
        Select s2 = new Select(year);
        s2.selectByVisibleText("2002");
        WebElement gender = driver.findElement(By.xpath("//input[@type='radio'])[2]"));
        gender.click();
        WebElement signup = driver.findElement(By.name("websubmit"));
        signup.click();
        driver.close();
     }

}
