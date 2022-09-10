package com.Swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	Actions actions;
	@FindBy(id="location")
	private WebElement deliveryloc;
	
   /* @FindBy(xpath="(//span[contains(@class,'_W-T')])[1]")
	private WebElement City;*/
	
	@FindBy(linkText="FIND FOOD")
	private WebElement findFoodBtn;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);
	}
	
	public void enterDeliveryLocation(String delivery_location ) {
		deliveryloc.clear();
		deliveryloc.sendKeys(delivery_location);
		
	}
	
	/*public void clickCity()
	{
		City.click();
	}*/
	
	
	public void clickFindFoodBtn() {
		findFoodBtn.click();
	}
	
}
