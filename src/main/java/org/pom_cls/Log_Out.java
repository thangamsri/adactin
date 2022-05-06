package org.pom_cls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_Out {

	public Log_Out(WebDriver s6) {
	PageFactory.initElements(s6, this);
}
	@FindBy(linkText="Logout")
	public WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}
}
