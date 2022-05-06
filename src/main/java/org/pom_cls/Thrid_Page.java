package org.pom_cls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thrid_Page {
	
	

	@FindBy(id="first_name")
	public WebElement first_name;
	
	public Thrid_Page(WebDriver s5) {
    PageFactory.initElements(s5, this);	
	}
	
	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	@FindBy(id="last_name")
	public WebElement last_name;
	
	@FindBy(id="address")
	public WebElement address;
	
	@FindBy(id="cc_num")
	public WebElement cc_num;
	
	@FindBy(id="cc_type")
	public WebElement cc_type;
	
	@FindBy(id="cc_exp_month")
	public WebElement cc_exp_month;
	
	@FindBy(id="cc_exp_year")
	public WebElement cc_exp_year;
	
	@FindBy(id="cc_cvv")
	public WebElement cc_cvv;
	
	@FindBy(id="cancel")
	public WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}

	public void setCancel(WebElement cancel) {
		this.cancel = cancel;
	}
	
	

}
