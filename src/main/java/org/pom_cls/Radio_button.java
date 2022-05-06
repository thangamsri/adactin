package org.pom_cls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radio_button {
	
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinuee() {
		return continuee;
	}

	@FindBy(id="radiobutton_0") 
	private WebElement radiobutton_0;
	
	public Radio_button(WebDriver s4) {
		PageFactory.initElements(s4,this);
	}
	

	@FindBy(name="continue") 
	private WebElement continuee;
	

}
