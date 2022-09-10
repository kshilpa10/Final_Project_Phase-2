package com.Swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectFoodItem {
	
	Actions actions;
	WebDriverWait wait;
	
	@FindBy(xpath="(//div[contains(@class,'_RPOp')])[1]")
	private WebElement foodItem;
	
	@FindBy(xpath="(//button[contains(@class,'_gPB7')])[1]")
	private WebElement checkout;
	
	public SelectFoodItem(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		actions=new Actions(driver);
	}
	
	public void clickAddBtn() {
		wait.until(ExpectedConditions.visibilityOf(foodItem));
		foodItem.click();
	}
	
	public void clickCheckoutBtn() {
		wait.until(ExpectedConditions.visibilityOf(checkout));
		checkout.click();
	}
	
	

}
