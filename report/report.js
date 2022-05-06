$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking The Hotel Booking Functionality Of An Adactin Application",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter the \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter the \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user click the login button And it navigate to the search hotel page",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;1"
    },
    {
      "cells": [
        "wxyz",
        "123355"
      ],
      "line": 10,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;2"
    },
    {
      "cells": [
        "suba",
        "thangam"
      ],
      "line": 11,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;3"
    },
    {
      "cells": [
        "thangamsri",
        "thangamsri"
      ],
      "line": 12,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter the \"wxyz\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter the \"123355\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user click the login button And it navigate to the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 7038613900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "wxyz",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_the_username_field(String)"
});
formatter.result({
  "duration": 256023700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123355",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_the_password_field(String)"
});
formatter.result({
  "duration": 186661600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_the_login_button_And_it_navigate_to_the_search_hotel_page()"
});
formatter.result({
  "duration": 1711196600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter the \"suba\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter the \"thangam\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user click the login button And it navigate to the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 711893200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "suba",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_the_username_field(String)"
});
formatter.result({
  "duration": 277629200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thangam",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_the_password_field(String)"
});
formatter.result({
  "duration": 349849900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_the_login_button_And_it_navigate_to_the_search_hotel_page()"
});
formatter.result({
  "duration": 1600724000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter the \"thangamsri\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter the \"thangamsri\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user click the login button And it navigate to the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 831520600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thangamsri",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_the_username_field(String)"
});
formatter.result({
  "duration": 291570900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thangamsri",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_the_password_field(String)"
});
formatter.result({
  "duration": 216945900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_the_login_button_And_it_navigate_to_the_search_hotel_page()"
});
formatter.result({
  "duration": 1405302700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Select Hotel Types",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;select-hotel-types",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user Select the London in the location field",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user Select the Hotel Hervey in the hotels field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select the room Deluxe in the type field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select the 2 in the number of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select the datepick_in on the date of checkin",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select the datepick_out in the date of checkout",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Select the 2 in the Adult per rooms",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Click the Search button And it navigate next page of availablity hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_the_London_in_the_location_field()"
});
formatter.result({
  "duration": 199953500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Hotel_Hervey_in_the_hotels_field()"
});
formatter.result({
  "duration": 163680300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_room_Deluxe_in_the_type_field()"
});
formatter.result({
  "duration": 212680700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Select_the_in_the_number_of_rooms(int)"
});
formatter.result({
  "duration": 437880800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_datepick_in_on_the_date_of_checkin()"
});
formatter.result({
  "duration": 422148900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_datepick_out_in_the_date_of_checkout()"
});
formatter.result({
  "duration": 394973300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Select_the_in_the_Adult_per_rooms(int)"
});
formatter.result({
  "duration": 271622600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_the_Search_button_And_it_navigate_next_page_of_availablity_hotel()"
});
formatter.result({
  "duration": 1561003700,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "confirmation functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;confirmation-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user Click the Radiobutton",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user Click to continue button And naviagte to personal details page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_the_Radiobutton()"
});
formatter.result({
  "duration": 159656600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_to_continue_button_And_naviagte_to_personal_details_page()"
});
formatter.result({
  "duration": 1241216800,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Select personal details",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;select-personal-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "user Enter the thangamani in the firstname field",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Enter the  nagarajan in the lastname field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enter the westcarstreet  in the address field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enter the 1234567890123456 in the credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Enter the VISA on the date of card type",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select the 4 in the card exp month",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User Select the 2022 in the card exp year",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User Enter the 123 in the cvv number",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Click the cancel button And it navigate next page of availablity hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_thangamani_in_the_firstname_field()"
});
formatter.result({
  "duration": 381066000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_nagarajan_in_the_lastname_field()"
});
formatter.result({
  "duration": 232373000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_westcarstreet_in_the_address_field()"
});
formatter.result({
  "duration": 260496000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567890123456",
      "offset": 15
    }
  ],
  "location": "Step_Definition.user_Enter_the_in_the_credit_card_number(int)"
});
formatter.result({
  "duration": 367644800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_VISA_on_the_date_of_card_type()"
});
formatter.result({
  "duration": 424573200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Select_the_in_the_card_exp_month(int)"
});
formatter.result({
  "duration": 371022200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Select_the_in_the_card_exp_year(int)"
});
formatter.result({
  "duration": 357672600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 15
    }
  ],
  "location": "Step_Definition.user_Enter_the_in_the_cvv_number(int)"
});
formatter.result({
  "duration": 313547800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_the_cancel_button_And_it_navigate_next_page_of_availablity_hotel()"
});
formatter.result({
  "duration": 972503300,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "logout functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;logout-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "user Click the logout button And its navigate to login page",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.user_Click_the_logout_button_And_its_navigate_to_login_page()"
});
formatter.result({
  "duration": 44600,
  "status": "passed"
});
});