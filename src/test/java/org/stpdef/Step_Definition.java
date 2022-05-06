package org.stpdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Project_Cucum.BaseClass;
import com.Project_Cucum.Page_Manager;
import com.properties.File_Reader;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {

	Page_Manager pom=new Page_Manager(s);
	
	
	
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		String geturl = File_Reader.getinstancefrm().getinstancecr().geturl();
		url_lunch(geturl);
	}

	@When("^user enter the \"([^\"]*)\" in the username field$")
	public void user_enter_the_in_the_username_field(String arg1) throws Throwable {
		

		String getusername = File_Reader.getinstancefrm().getinstancecr().getusername();
		input_values(pom .getinstancelogin().getUsername(),getusername);
				
	}
	
	@When("^user enter the \"([^\"]*)\" in the password field$")
	public void user_enter_the_in_the_password_field(String arg1) throws Throwable {
		
		String getpassword = File_Reader.getinstancefrm().getinstancecr().getpassword();
		input_values(pom.getinstancelogin().getPassword(),getpassword);
		
	    	}

	@Then("^user click the login button And it navigate to the search hotel page$")
	public void user_click_the_login_button_And_it_navigate_to_the_search_hotel_page() throws Throwable {
	
		click(pom.getinstancelogin().getLogin());
	}

	@When("^user Select the London in the location field$")
	public void user_Select_the_London_in_the_location_field() throws Throwable {
		Select_By_value(pom.getinstancehotel().getLocation(),"London");
		
	}

	@When("^user Select the Hotel Hervey in the hotels field$")
	public void user_Select_the_Hotel_Hervey_in_the_hotels_field() throws Throwable {
		 Select_By_value(pom.getinstancehotel().getHotels(),"Hotel Hervey");
	}

	@When("^user Select the room Deluxe in the type field$")
	public void user_Select_the_room_Deluxe_in_the_type_field() throws Throwable {
		 
		 Select_By_value(pom.getinstancehotel().getRoom_type(),"Deluxe");
	}

	@When("^user Select the (\\d+) in the number of rooms$")
	public void user_Select_the_in_the_number_of_rooms(int arg1) throws Throwable {
		 Select_By_value(pom.getinstancehotel().getRoom_nos(),"2");
	}

	@When("^user Select the datepick_in on the date of checkin$")
	public void user_Select_the_datepick_in_on_the_date_of_checkin() throws Throwable {
		 WebElement in = s.findElement(By.id("datepick_in"));
		 clear(pom.getinstancehotel().getDatepick_in());
	     input_values(in,"01/05/2022");
	}

	@When("^user Select the datepick_out in the date of checkout$")
	public void user_Select_the_datepick_out_in_the_date_of_checkout() throws Throwable {
		 WebElement out = s.findElement(By.id("datepick_out"));
		clear(pom.getinstancehotel().getDatepick_out());
		input_values(out,"03/05/2022");
	}

	@When("^User Select the (\\d+) in the Adult per rooms$")
	public void user_Select_the_in_the_Adult_per_rooms(int arg1) throws Throwable {
		  Select_By_value(pom.getinstancehotel().getAdult_room(),"2");
	}

	@Then("^user Click the Search button And it navigate next page of availablity hotel$")
	public void user_Click_the_Search_button_And_it_navigate_next_page_of_availablity_hotel() throws Throwable {
		  click(pom.getinstancehotel().getSubmit());
	}

	@When("^user Click the Radiobutton$")
	public void user_Click_the_Radiobutton() throws Throwable {
	    click(pom.getinstancebutton().getRadiobutton_0());
		   
	}

	@Then("^user Click to continue button And naviagte to personal details page$")
	public void user_Click_to_continue_button_And_naviagte_to_personal_details_page() throws Throwable {
		 click(pom.getinstancebutton().getContinuee());
	}

	@When("^user Enter the thangamani in the firstname field$")
	public void user_Enter_the_thangamani_in_the_firstname_field() throws Throwable {
 input_values(pom.getinstancepersonal().getFirst_name(),"thangamani");
	
         
       
	}

	@When("^user Enter the  nagarajan in the lastname field$")
	public void user_Enter_the_nagarajan_in_the_lastname_field() throws Throwable {
		  input_values(pom.getinstancepersonal().getLast_name(),"nagarajan");

	        
	        
						
	}
	
	@When("^user Enter the westcarstreet  in the address field$")
	public void user_Enter_the_westcarstreet_in_the_address_field() throws Throwable {
		 input_values(pom.getinstancepersonal().getAddress(),"westcarstreet");
			
	        
        
	}

	@When("^user Enter the (\\d+) in the credit card number$")
	public void user_Enter_the_in_the_credit_card_number(int arg1) throws Throwable {
		 input_values(pom.getinstancepersonal().getCc_num(),"1234567890123456");
			
	}

	@When("^user Enter the VISA on the date of card type$")
	public void user_Enter_the_VISA_on_the_date_of_card_type() throws Throwable {
		   
				 Select_By_value(pom.getinstancepersonal().getCc_type(),"VISA");


	}

	@When("^user Select the (\\d+) in the card exp month$")
	public void user_Select_the_in_the_card_exp_month(int arg1) throws Throwable {

		 Select_By_value(pom.getinstancepersonal().getCc_exp_month(),"4");

		
	}

	@When("^User Select the (\\d+) in the card exp year$")
	public void user_Select_the_in_the_card_exp_year(int arg1) throws Throwable {
		 Select_By_value(pom.getinstancepersonal().getCc_exp_year(),"2022");
		 

			
			
	}

	@When("^User Enter the (\\d+) in the cvv number$")
	public void user_Enter_the_in_the_cvv_number(int arg1) throws Throwable {
		input_values(pom.getinstancepersonal().getCc_cvv(),"123");



	}

	@Then("^user Click the cancel button And it navigate next page of availablity hotel$")
	public void user_Click_the_cancel_button_And_it_navigate_next_page_of_availablity_hotel() throws Throwable {

		click(pom.getinstancepersonal().getCancel());
	}

	@When("^user Click the logout button And its navigate to login page$")
	public void user_Click_the_logout_button_And_its_navigate_to_login_page() throws Throwable {
	   
	}


}
