Feature: Adactin Hotel Booking


Scenario: Login Functionality

Given User is launching the application
When user is enter the "kalpanavenkat" in username field
And user is enter the "jarshitha" in password field
Then user is click on login button


Scenario: Search Hotel

Given user is redirected to search hotel page user select the location
When user is select the hotel
And user is select the roomtype
And user is select no.of rooms
And user is enter the Check In Date
And user is enter the Check Out Date
And user is select the adults per room
And user is select the Childrens per room
Then click on search button

Scenario: Select Hotel

Given user is redirected to select hotel page
Then user is click on continue button

Scenario: Book a Hotel

Given user is redirect to book a hotel page and user is enter the firstname
When  user is enter the lastname
And user is enter the Billing Address
And user is enter the credit card number
And user is Select the credit card type
And user is Select the exp month 
And user is select the exp year
And user is enter the CVV number
Then user is click on book now

Scenario: TakeScreenShot

Given user is taking screenshot

