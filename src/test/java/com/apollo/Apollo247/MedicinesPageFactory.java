package com.apollo.Apollo247;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicinesPageFactory {
	
	WebDriver driver = null;
	
	// Constructor
    public MedicinesPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // Web Elements
    
    @FindBy(xpath="//span[@class=\"icon-ic_account\"]")//Xpath for Login
    public WebElement login;
    
    @FindBy(xpath="//input[@name=\"mobileNumber\"]")//Xpath for Mobile Number
    public WebElement mobileno;
    
    @FindBy(css="span[class=\"MuiFab-label\"]")//css value for Mobile Arrow Button
    public WebElement mobileArrow;
    
    @FindBy(xpath="//button[@type=\"submit\"]")//Xpath for Otp Arrow Button
    public WebElement otpArrow;
    
    @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div/form/div[1]/div[2]/button")
    public WebElement login1;
    
    @FindBy(xpath = "//input[@placeholder='Search medicines, brands and more']")
    public WebElement searchInput;

    @FindBy(xpath = "//i[@class='icon-ic-search']")
    public WebElement searchButton;
    
    @FindBy(xpath="driver.findElement(By.xpath(\"//*[@id=\\\"fixedHeaderCT\\\"]/div/div/div[4]/ul/li[3]/a/p\"))")
    public WebElement medicinesLink;

    
 
    // Methods to interact with web elements
    
    public void Login()
    {
    	login.click();
    }
    
    public void MobileNumber()
    {
    	mobileno.click();
    	mobileno.sendKeys("8073435896");
    }
    
    public void SubmitBtn()
    {
    	mobileArrow.click();
    }
    
    public void Login1() throws InterruptedException
    {
    	Thread.sleep(3000);
    	login1.click();
    }
    
    public void enterSearchText(String searchText) {
    	
        searchInput.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

	public void medicinesLink() {
		medicinesLink.click();
		
	}

}

