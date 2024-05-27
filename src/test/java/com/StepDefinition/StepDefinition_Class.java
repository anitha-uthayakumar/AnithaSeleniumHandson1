package com.StepDefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;

//import org.junit.Assert;

import com.PagesClass.Pages_Class;
import com.ReusableClass.Reusable_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import org.junit.Assert;
import io.cucumber.java.en.When;


public class StepDefinition_Class extends Reusable_Class {
	
	public static  Pages_Class pgd;
	
	@Given("To Launch the Browser")
	public void to_launch_the_browser() {
		
		BrowserLaunch();
	
	}
	
	@When("To Enter UserName")
	public void to_enter_user_name() {
		
		pgd = new Pages_Class(driver);
		
		enterValue(pgd.getUsername(), "standard_user");
		
	}

	@When("To Enter Password")
	public void to_enter_password() {
		
		enterValue(pgd.getPassword(), "secret_sauce");
	    
		
	}

	@Given("To click Login")
	public void to_click_login() {
		
		toClick(pgd.getLogin());
	    
		
	}

	@Then("To validate Homepage")
	public void to_validate_homepage() throws InterruptedException {
	  // Assert.assertEquals(forConvertingText(pgd.getswagLabs().isDisplayed()), "Swag Labs");
		
		Assert.assertEquals(forConvertingText(pgd.getswagLabs()), "Swag Labs");
	}
	@When("To Select red shirt")
	public void to_select_red_shirt() throws InterruptedException, AWTException {
	    //toScrollDown(pgd.getTwitter());
		forPageDown();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']")).click();
		pgd.getredTshirt().click();
		
	}

	@When("To Add to Cart")
	public void to_add_to_cart() throws InterruptedException {
	    Thread.sleep(3000);
	    //driver.findElement(By.name("add-to-cart")).click();
	    toClick(pgd.getaddProdtoCart());
	}

	@Then("To Validate Remove")
	public void to_validate_remove() {
	    Assert.assertEquals(forConvertingText(pgd.getremovebutton()), "Remove");
	}
	
	@When("To click Shopping cart")
	public void to_click_shopping_cart() throws InterruptedException {
		Thread.sleep(3000);
	toClick(pgd.getshoppingCart());   
	}

	@When("To Click Checkout")
	public void to_click_checkout() throws InterruptedException {
	    Thread.sleep(3000);
	    toClick(pgd.getCheckout());
	}

	@When("To Enter FirstName")
	public void to_enter_first_name() {
	    enterValue(pgd.getFirstName(), "ASDFGH");
	}

	@When("To Enter LastName")
	public void to_enter_last_name() {
	   enterValue(pgd.getLastName(), "LKJHGH");
	}

	@When("To Enter PostalCode")
	public void to_enter_postal_code() {
	enterValue(pgd.getPostalCode(), "118");    
	}

	@Then("To Click on Continue")
	public void to_click_on_continue() throws AWTException, InterruptedException {
	   forPageDown();
	   Thread.sleep(3000);
	   toClick(pgd.getContinue());
	   Thread.sleep(5000);
	   Assert.assertEquals(forConvertingText(pgd.getCheckOutOverView()), "Checkout: Overview");
	}

	@When("To Click on Finish")
	public void to_click_on_finish() {
	toClick(pgd.getFinish());    
	}

	@Then("To Validate Thank you message")
	public void to_validate_thank_you_message() throws InterruptedException {
	Thread.sleep(5000); 
	Assert.assertEquals(forConvertingText(pgd.getThankYouMessage()), "Thank you for your order!");
	
	}




	
	

}
