package com.Swiggy.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.Swiggy.pages.FindRestaurant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderOnlineFoodSteps extends Driver {
	
		
	
	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
	    
	}
	
	@When("he enters the location of delivery {string}")
	public void he_enters_the_location_of_delivery(String string) {
		landingPage.enterDeliveryLocation(string);
		@SuppressWarnings("deprecation")
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//span[contains(@class,'_2W-T')])[1])")));
		
		//landingPage.clickCity();
	}
	
	/*@When("he enters the location of delivery #{string}")
	public void he_enters_the_location_of_delivery(String string) {
		landingPage.enterDeliveryLocation(string);
		landingPage.clickCity();
	   
	}*/
	
	/*@When("he enters the location of delivery")
	public void he_enters_the_location_of_delivery() {
		landingPage.clickCity();
	}*/
	
	@When("he clicks on Find Food button")
	public void he_clicks_on_find_food_button() {
	    landingPage.clickFindFoodBtn();
	}

	@When("he clicks on clicks on first restaurant on the next page")
	public void he_clicks_on_clicks_on_first_restaurant_on_the_next_page() {
	    FindRestaurant findRestaurant= new FindRestaurant(driver);
	    findRestaurant.clickOnRestaurant();
	}

	@When("he clicks on Add button on the first item of restaurant page")
	public void he_clicks_on_add_button_on_the_first_item_of_restaurant_page() {
		selectFoodItem.clickAddBtn();
		   
	}

	@When("he clicks on Checkout button")
	public void he_clicks_on_checkout_button() {
		selectFoodItem.clickCheckoutBtn();
	   
	}
	
	@Then("he must be able to verify text {string} on Checkout Page")
	public void he_must_be_able_to_verify_text_on_checkout_page(String string) {
		String expectedTitle= string;
		String actualTitle= checkOutPage.getcheckOutMsg();
		Assert.assertEquals(actualTitle, expectedTitle);
	   
	}

}
