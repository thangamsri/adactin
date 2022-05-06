package com.Project_Cucum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.properties.File_Reader;

public class Runner extends BaseClass {


	public static void main(String[] args) throws Throwable {
		
	  WebDriver s =browserlaunchs("chrome");
		
	  Page_Manager pom=new Page_Manager(s);
	  
		s.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String geturl = File_Reader.getinstancefrm().getinstancecr().geturl();
		url_lunch(geturl);
		
		String getusername = File_Reader.getinstancefrm().getinstancecr().getusername();
		input_values(pom .getinstancelogin().getUsername(),getusername);
				
		String getpassword = File_Reader.getinstancefrm().getinstancecr().getpassword();
		input_values(pom.getinstancelogin().getPassword(),getpassword);
		
		click(pom.getinstancelogin().getLogin());
		
			
		Select_By_value(pom.getinstancehotel().getLocation(),"London");
		
		 	 
		 Select_By_value(pom.getinstancehotel().getHotels(),"Hotel Hervey");
		 
		
		 
		 Select_By_value(pom.getinstancehotel().getRoom_type(),"Deluxe");
		 
		
		 
		 Select_By_value(pom.getinstancehotel().getRoom_nos(),"2");
		 
		 WebElement in = s.findElement(By.id("datepick_in"));
	     clear(pom.getinstancehotel().getDatepick_in());
	     input_values(in,"01/05/2022");
	    
	    WebElement out = s.findElement(By.id("datepick_out"));
		clear(pom.getinstancehotel().getDatepick_out());
		input_values(out,"03/05/2022");
	
	    
	    Select_By_value(pom.getinstancehotel().getAdult_room(),"2");
	    
	          click(pom.getinstancehotel().getSubmit());
        
        	    click(pom.getinstancebutton().getRadiobutton_0());
	   
	    click(pom.getinstancebutton().getContinuee());
	    
	  
         input_values(pom.getinstancepersonal().getFirst_name(),"thangamani");
	
         
         input_values(pom.getinstancepersonal().getLast_name(),"nagarajan");

        
         input_values(pom.getinstancepersonal().getAddress(),"westcarstreet");
	
        
         input_values(pom.getinstancepersonal().getCc_num(),"1234567890123456");
	
     
				 Select_By_value(pom.getinstancepersonal().getCc_type(),"VISA");
	
	
				 Select_By_value(pom.getinstancepersonal().getCc_exp_month(),"4");
		 
				 Select_By_value(pom.getinstancepersonal().getCc_exp_year(),"2022");
				 
		
					
					input_values(pom.getinstancepersonal().getCc_cvv(),"123");
		 
     
					click(pom.getinstancepersonal().getCancel());
					
	 
					
					click(pom.getinstanceout().getLogout());			
					
	}


	}
	
	


