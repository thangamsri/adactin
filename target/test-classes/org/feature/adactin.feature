Feature:Checking The Hotel Booking Functionality Of An Adactin Application
Scenario Outline:Login Functionality
Given user Must Launch The Url
When user enter the "<username>" in the username field
And user enter the "<password>" in the password field
Then user click the login button And it navigate to the search hotel page
 
 Examples:
 |username|password|
 |wxyz|123355|
 |suba|thangam|
 |thangamsri|thangamsri|
 
 Scenario:Select Hotel Types
 When user Select the London in the location field
 And user Select the Hotel Hervey in the hotels field
 And user Select the room Deluxe in the type field
 And user Select the 2 in the number of rooms
 And user Select the datepick_in on the date of checkin
 And user Select the datepick_out in the date of checkout
 And User Select the 2 in the Adult per rooms
 Then user Click the Search button And it navigate next page of availablity hotel
 
 Scenario:confirmation functionality
 When user Click the Radiobutton
 Then user Click to continue button And naviagte to personal details page
 
 Scenario:Select personal details 
 When user Enter the thangamani in the firstname field
 And user Enter the  nagarajan in the lastname field
 And user Enter the westcarstreet  in the address field
 And user Enter the 1234567890123456 in the credit card number
 And user Enter the VISA on the date of card type
 And user Select the 4 in the card exp month	
 And User Select the 2022 in the card exp year
 And User Enter the 123 in the cvv number
 Then user Click the cancel button And it navigate next page of availablity hotel

  Scenario:logout functionality
 When user Click the logout button And its navigate to login page
 