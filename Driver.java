package com.Swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Swiggy.pages.CheckOutPage;
import com.Swiggy.pages.FindRestaurant;
import com.Swiggy.pages.LandingPage;
import com.Swiggy.pages.SelectFoodItem;

public class Driver extends Tools {
	
	protected static LandingPage landingPage;
	protected static FindRestaurant findRestaurant;
	protected static SelectFoodItem selectFoodItem;
	protected static CheckOutPage checkOutPage;
	
	public static void init() {
		
	driver=new ChromeDriver();
	landingPage= new LandingPage(driver);
	findRestaurant= new FindRestaurant(driver);
	selectFoodItem= new SelectFoodItem(driver);
	checkOutPage= new CheckOutPage(driver);
	
	}

}
