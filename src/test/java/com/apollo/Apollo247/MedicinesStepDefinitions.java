package com.apollo.Apollo247;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import java.time.Duration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.*;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MedicinesStepDefinitions {
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		
		System.out.println("===============================Launching the browser=========================================");
		
		// Set the system property for the Chrome driver
        System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        // Initialize the Chrome driver
//        driver = new ChromeDriver();
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        
	}
	
	@After
	public void closingBroswer() {
		// Close the browser
		driver.close();
	}
	
	@Given("the user is on the Apollo247 homepage")
	public void the_user_is_on_the_Apollo247_homepage() throws InterruptedException {
		
        // Navigate to the Apollo247 homepage
        driver.get("https://www.apollo247.com/");

        Thread.sleep(2000);


        
	}

	@When("the user clicks on the Medicines")
	public void the_user_clicks_on_the_Medicines() throws InterruptedException {
		
//		MedicinesPageFactory mp = MedicinesPageFactory(driver);
//		mp.medicinesLink();

		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[4]/ul/li[3]/a/p")).click();
		Thread.sleep(1000);
		
		// Verify that the page has loaded successfully
//	     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//	     wait.until(ExpectedConditions.urlToBe("https://apollopharmacy.in/"));
		
		String expected_title="Online Medical Store, Online Medicine Order, Fastest Delivery - Apollo Pharmacy";
		String actual_title= driver.getTitle();
		
		assertEquals(expected_title,actual_title);

	}


	@Then("the user should be able to view all the available medications")
	public void the_user_should_be_able_to_view_all_the_available_medications() {
		
//		WebElement medications= driver.findElement(By.xpath("//*[@id=\\\"fixedHeaderCT\\\"]/div/div/div[4]/ul/li[3]/a/p"));
//        assert(medications.isDisplayed());
	}
	
	@Given("User is on the Apollo247 home page")
	public void user_is_on_the_Apollo247_home_page() {
	    
	}

	@When("User clicks on Login button")
	public void user_clicks_on_Login_button() {
	    
	}

	@When("User is able to give mobile number")
	public void user_is_able_to_give_mobile_number() {
	    
	}

	@When("User is able to write otp")
	public void user_is_able_to_write_otp() {
	    
	}

	@Then("User is able to Login")
	public void user_is_able_to_Login() {
	    
	}
	
	@Given("the user is on the Medicines page")
	public void the_user_is_on_the_Medicines_page() {
	    
	}
	
	@When("the user selects the Shop by Category")
	public void the_user_selects_the_Shop_by_Category() throws InterruptedException {
		
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='/shop-by-category/women-care']"))).perform();
		Thread.sleep(2000);
    	actions.moveToElement(driver.findElement(By.xpath("//a[@href='/shop-by-category/personal-care-1']"))).perform();
    	Thread.sleep(2000);
    	
	}
	
	@Then("the user should be able to view a list of products within the selected category")
	public void the_user_should_be_able_to_view_a_list_of_products_within_the_selected_category() throws InterruptedException {
		
    	Actions actions = new Actions(driver);
    	actions.moveToElement(driver.findElement(By.xpath("//a[@href='/shop-by-category/personal-care-1']"))).perform();
    	actions.moveToElement(driver.findElement(By.xpath("//a[@href='/shop-by-category/bath-body']"))).click().perform();
    	Thread.sleep(2000);
	}
	
	@Given("the user is on the Pharmacy page")
	public void the_user_is_on_the_Pharmacy_page() {
	    
	}

	@When("the user enters medicine in the search bar")
	public void the_user_enters_medicine_in_the_search_bar() throws InterruptedException {
		
		WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Search medicines, brands and more']"));
        searchInput.click();
        Thread.sleep(2000);
        searchInput.sendKeys("imol");
		Thread.sleep(2000);
	}

	@Then("clicks the search button")
	public void clicks_the_search_button() throws InterruptedException {
	    
		WebElement searchButton = driver.findElement(By.xpath("//i[@class='icon-ic-search']"));
		searchButton.click();
		Thread.sleep(3000);

		
	}

	@Then("the user should see a list of results related to medicine")
	public void the_user_should_see_a_list_of_results_related_to_medicine() {
	    
	}

	@Then("the list should include the name, image and price")
	public void the_list_should_include_the_name_image_and_price() {
	    
	}


	@Given("the user has selected a product")
	public void the_user_has_selected_a_product() throws InterruptedException {
		
		
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='HotSeller_productTitle__YZJ3K']"));
		Thread.sleep(2000);

	}

	@When("the user clicks on the product image or name")
	public void the_user_clicks_on_the_product_image_or_name() throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='HotSeller_productTitle__YZJ3K']")).click();
		Thread.sleep(1000);
		
	}

	@Then("the user should be able to view the product details")
	public void the_user_should_be_able_to_view_the_product_details() throws InterruptedException {
		 // Wait for the product details to load
         Thread.sleep(1000);
	}

	@Given("the user has viewed the product details")
	public void the_user_has_viewed_the_product_details() throws InterruptedException {

			Thread.sleep(1000);
			
			JavascriptExecutor jss = (JavascriptExecutor)driver;
			jss.executeScript("window.scrollBy(0, 600)");
			Thread.sleep(2000);
			
	}

	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) throws InterruptedException {
		
		 WebElement addToCartButton = driver.findElement(By.xpath("//div[@class='HotSeller_addToCart__kX_jE']"));
	     addToCartButton.click();
	     Thread.sleep(2000);
	}

	@Then("the product is added to cart")
	public void the_product_is_added_to_cart() {
		// Wait for the cart to update
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.textToBe(By.id("cart-count"), "1"));

        // Verify that the product has been added to the cart
//        WebElement cartCount = driver.findElement(By.id("cart-count"));
//        String cartCountText = cartCount.getText();

	}


	
	
}

