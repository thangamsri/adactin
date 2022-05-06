package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class Configuration {
	
	public static Properties p;
	
	 public Configuration() throws IOException { 
		 
		 File f=new File("C:\\Users\\goldb\\eclipse-workspace\\Copy_Cat\\src\\main\\java\\com\\properties\\adactin");
			
			FileInputStream fis =new FileInputStream(f);
			 p=new Properties();
			p.load(fis);
	 }
	
	public String geturl() throws Throwable {
				
		String url = p.getProperty("url_lunch");
		return url;
			}
	
	public String getusername() throws Throwable {
	
		String username = p.getProperty("username");
		return username;
	
	}
	
	 public String getpassword() throws Throwable {
					 
			String passsword = p.getProperty("password");
		   return passsword;
	 }
}
