package org.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Project_Cucum.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\org\\feature",glue="org.stpdef",plugin= {"html:Report","json:report/cucmber.json",
"pretty", "com.cucumber.listener.ExtentCucumberFormatter:report/adactin.html"})

public class Test_Runner {
	public static WebDriver s;
	
	@BeforeClass
	public static void start() {
		
		s = BaseClass.browserlaunchs("chrome");
		
	}
	
	@AfterClass
    public static void End() {
		s.close();
		
	}
	

}
