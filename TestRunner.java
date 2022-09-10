package com.Swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(features="Features"
	//@CucumberOptions(features="Features//order_food.feature"

			,glue="com.Swiggy.testscripts"
			,plugin= {"progress","html:target/Cucumber.html"}
			,tags="TC_101"
			//,dryRun=true
			)
	public class TestRunner extends AbstractTestNGCucumberTests{
		
	}


