package com.Swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	Actions actions;
	@FindBy(xpath="//span[contains(@class,'_EQ3T')]")
	private WebElement checkoutMsg;
	
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);
	}
	
	public String getcheckOutMsg() {
		String checkoutMsgTxt= checkoutMsg.getText() ;
		return checkoutMsgTxt;
	}
 
}
