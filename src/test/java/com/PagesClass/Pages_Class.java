package com.PagesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base_Class;
import com.ReusableClass.Reusable_Class;

public class Pages_Class extends Base_Class {
	
	public Pages_Class(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement login;
	
	@FindBy(xpath = "//div[text()='Swag Labs']")
	WebElement swagLabs;
	
	@FindBy(xpath = "//a[text()='Twitter']")
	WebElement Twitter;
	
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
	WebElement redTshirt;
	
	@FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
	WebElement addProdtoCart;
	
	@FindBy(id="remove")
	WebElement removebutton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement shoppingCart;
	
	@FindBy(id="checkout")
	WebElement checkout;
	
	@FindBy(id="first-name")
	WebElement FirstName;
	
	@FindBy(id="last-name")
	WebElement lastName;
	
	@FindBy(id="postal-code")
	WebElement PinCode;
	
	@FindBy(id="continue")
	WebElement Continue;
	
	@FindBy(xpath="//span[text()='Checkout: Overview']")
	WebElement CheckOutOverView;
	
	@FindBy(id="finish")
	WebElement Finish;
	
	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	WebElement ThankYouMessage;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	public WebElement getswagLabs() {
		return swagLabs;
	}
	
	public WebElement getTwitter() {
		return Twitter;
	}
	public WebElement getredTshirt() {
		return redTshirt;
	}
	
	public WebElement getaddProdtoCart() {
		return addProdtoCart;
	}
	
	public WebElement getremovebutton() {
		return removebutton;
	}
	
	public WebElement getshoppingCart() {
		return shoppingCart;
	}
	
	public WebElement getCheckout() {
		return checkout;
	}
	
	public WebElement getFirstName() {
		return FirstName;
	}
	
	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getPostalCode() {
		return PinCode;
	}
	
	public WebElement getContinue() {
		return Continue;
	}
	
	public WebElement getCheckOutOverView() {
		return CheckOutOverView;
	}
	
	public WebElement getFinish() {
		return Finish;
	}
	
	public WebElement getThankYouMessage() {
		return ThankYouMessage;
	}
	
	
	
	
	
	

}
