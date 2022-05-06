 package com.Project_Cucum;

import org.openqa.selenium.WebDriver;
import org.pom_cls.Log_In;
import org.pom_cls.Log_Out;
import org.pom_cls.Radio_button;
import org.pom_cls.Second_Page;
import org.pom_cls.Thrid_Page;

public class Page_Manager {

	public WebDriver s;
	private Log_In ip;
	
	public Page_Manager(WebDriver s2) {
		
		this.s =s2;
	}

	public Log_In getinstancelogin() {
		
		if(ip==null) {
			
	        ip=new Log_In(s);
		}
		return ip;
	}
	
	private static Second_Page hd;
	
	public Second_Page getinstancehotel() {
	if(hd==null) {
			
	        hd=new Second_Page (s);
	       
	}
	return hd;

	}
	
private static Radio_button button;
	
	public Radio_button getinstancebutton() {
	if(button==null) {
			
	        button=new Radio_button (s);

	}
	return button;
	}
private static Thrid_Page personal;
	
	public Thrid_Page getinstancepersonal() {
	if(personal==null) {
			
		personal=new Thrid_Page (s);

	}
	return personal;
	
	}
private static Log_Out out;
	
	public Log_Out getinstanceout() {
	if(out==null) {
			
		out=new Log_Out (s);

	}
	return out;

	
	}
}
