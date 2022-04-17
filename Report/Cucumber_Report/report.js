$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/FeatureFile/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking",
  "description": "",
  "id": "adactin-hotel-booking",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is launching the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is enter the \"kalpanavenkat\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user is enter the \"jarshitha\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_launching_the_application()"
});
formatter.result({
  "duration": 14278478500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kalpanavenkat",
      "offset": 19
    }
  ],
  "location": "StepDefinition_Adactin.user_is_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 1734439100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jarshitha",
      "offset": 19
    }
  ],
  "location": "StepDefinition_Adactin.user_is_enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 262422100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_click_on_login_button()"
});
formatter.result({
  "duration": 13217406700,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search Hotel",
  "description": "",
  "id": "adactin-hotel-booking;search-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user is redirected to search hotel page user select the location",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user is select the hotel",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user is select the roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user is select no.of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user is enter the Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user is enter the Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user is select the adults per room",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user is select the Childrens per room",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_redirected_to_search_hotel_page_user_select_the_location()"
});
formatter.result({
  "duration": 904881500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_select_the_hotel()"
});
formatter.result({
  "duration": 296917200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_select_the_roomtype()"
});
formatter.result({
  "duration": 335101900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_select_no_of_rooms()"
});
formatter.result({
  "duration": 313857600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_enter_the_Check_In_Date()"
});
formatter.result({
  "duration": 1583916900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_enter_the_Check_Out_Date()"
});
formatter.result({
  "duration": 370989800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_select_the_adults_per_room()"
});
formatter.result({
  "duration": 318270300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_select_the_Childrens_per_room()"
});
formatter.result({
  "duration": 281265200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.click_on_search_button()"
});
formatter.result({
  "duration": 3237252200,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Select Hotel",
  "description": "",
  "id": "adactin-hotel-booking;select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user is redirected to select hotel page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user is click on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_redirected_to_select_hotel_page()"
});
formatter.result({
  "duration": 207038200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_click_on_continue_button()"
});
formatter.result({
  "duration": 2813816900,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Book a Hotel",
  "description": "",
  "id": "adactin-hotel-booking;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "user is redirect to book a hotel page and user is enter the firstname",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user is enter the lastname",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user is enter the Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user is enter the credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user is Select the credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user is Select the exp month",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user is select the exp year",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user is enter the CVV number",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user is click on book now",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_redirect_to_book_a_hotel_page_and_user_is_enter_the_firstname()"
});
formatter.result({
  "duration": 540568100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_enter_the_lastname()"
});
formatter.result({
  "duration": 701701800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_enter_the_Billing_Address()"
});
formatter.result({
  "duration": 768008000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_enter_the_credit_card_number()"
});
formatter.result({
  "duration": 477726900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_Select_the_credit_card_type()"
});
formatter.result({
  "duration": 297425100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_Select_the_exp_month()"
});
formatter.result({
  "duration": 327678900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_select_the_exp_year()"
});
formatter.result({
  "duration": 338678300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_enter_the_CVV_number()"
});
formatter.result({
  "duration": 235525300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_click_on_book_now()"
});
formatter.result({
  "duration": 763112900,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "TakeScreenShot",
  "description": "",
  "id": "adactin-hotel-booking;takescreenshot",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "user is taking screenshot",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_taking_screenshot()"
});
formatter.result({
  "duration": 858354200,
  "status": "passed"
});
});