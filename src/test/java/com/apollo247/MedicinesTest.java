package com.apollo247;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apollo.Apollo247.MedicinesPageFactory;

public class MedicinesTest {
	WebDriver driver;
	

	  
	@BeforeClass
	public void setUp() throws InterruptedException {
		  // Set the system property for the Chrome driver
	      System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	      // Initialize the Chrome driver
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
				
				
	      // Navigate to the Apollo247 homepage
	      driver.get("https://www.apollo247.com/");
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
	      Thread.sleep(1000);
		
	}
	
	@BeforeMethod
    public void navigateToMedicinesPage() {
        WebElement medicinesLink =driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[4]/ul/li[3]/a/p"));
        medicinesLink.click();
    }
	
	@Test

	
	@AfterClass
    public void tearDown() {
        driver.quit();;
    }
	
	

}
