package com.Swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindRestaurant {

	Actions actions;
	
	@FindBy(xpath="//div[contains(@class,'HEuF')]")
	private WebElement restaurant;
	
	public FindRestaurant(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);
	}
	
	public void clickOnRestaurant() {
		restaurant.click();
	}
	
}
