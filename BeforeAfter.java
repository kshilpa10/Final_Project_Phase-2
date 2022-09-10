package com.Swiggy.testscripts;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools {
	
	@Before
	public void setUp(Scenario senario) {
		
		Driver.init();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
	}
	
	@After
	
	public void tearDown() {
		driver.quit();
	}


}
