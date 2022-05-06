package com.Project_Cucum;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	
	public static WebDriver s;
	
	 
public static WebDriver browserlaunchs(String browsername) {
	
	if(browsername.equalsIgnoreCase("chrome")) {
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	s=new ChromeDriver();
	s.manage().window().maximize();
}
	else if(browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		 s=new ChromeDriver();
		 s.manage().window().maximize();
	}
	return s;
}
public static void url_lunch(String url) {
	s.get(url);
}

public static void input_values(WebElement element,String input) {
	element.sendKeys(input);
	
}

public static void click(WebElement  element) {
	element.click();	
}

public static void Select_By_value(WebElement element,String value) {
	Select a =new Select(element);
	a.selectByValue(value);
	
}
public static void Select_by_indexvalue(WebElement element,int value) {
	Select a =new Select(element);
	a.selectByIndex(value);
}
public static void select_by_visibletext(WebElement element,String value) {
	Select a=new Select (element);
	a.selectByVisibleText(value);
	
}
public static void  screen_shot(String location)throws IOException {
	TakesScreenshot b= (TakesScreenshot) s;
	File source = b.getScreenshotAs(OutputType.FILE);
	File target =new File(location);
	 FileUtils.copyFile(source, target);
			 }

public static void clear(WebElement element) {
	element.clear();
}
public static void close() {
s.close();	
} 


	
}



