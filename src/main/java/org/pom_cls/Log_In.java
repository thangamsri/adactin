package org.pom_cls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class Log_In {
	
	public WebDriver s;
	
	public WebElement getUsername() {
		return username;
		
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="username")
	private WebElement username;
	
	public Log_In(WebDriver s2) {
		this.s=s2;
		PageFactory.initElements(s, this);
		
	}
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;

}
