package com.stepdefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Adactin_Project.BaseClass;
import com.helper_file.FileReadManager;
import com.pojoclass.Pom_Adactin;
import com.runnerfile.Run_Adactin;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Adactin extends BaseClass{
	
	public static WebDriver driver=Run_Adactin.driver;
	public static Pom_Adactin pom=new Pom_Adactin(driver);
	
	@Given("^User is launching the application$")
	public void user_is_launching_the_application() throws Throwable {
		geturl(FileReadManager.getInstance_FRM().getInstance_CR().geturl());
	
	}

	@When("^user is enter the \"([^\"]*)\" in username field$")
	public void user_is_enter_the_in_username_field(String uname) throws Throwable {
		inputText(pom.getInstancela().getUser(),uname);
	}

	@And("^user is enter the \"([^\"]*)\" in password field$")
	public void user_is_enter_the_in_password_field(String pwd) throws Throwable {
		inputText(pom.getInstancela().getPw(),pwd);
	}

	@Then("^user is click on login button$")
	public void user_is_click_on_login_button() throws Throwable {
		clickButton(pom.getInstancela().getLog());
	}

	@Given("^user is redirected to search hotel page user select the location$")
	public void user_is_redirected_to_search_hotel_page_user_select_the_location() throws Throwable {
		dropDown(pom.getInstancesh().getPlace(),"VisibleText","New York");
		 
	}

	@When("^user is select the hotel$")
	public void user_is_select_the_hotel() throws Throwable {
		dropDown(pom.getInstancesh().getHotel(),"VisibleText","Hotel Sunshine");
	     
	}

	@And("^user is select the roomtype$")
	public void user_is_select_the_roomtype() throws Throwable {
		dropDown(pom.getInstancesh().getRoom(),"VisibleText","Super Deluxe");
		     
	}

	@And("^user is select no\\.of rooms$")
	public void user_is_select_no_of_rooms() throws Throwable {
		dropDown(pom.getInstancesh().getNum(),"ByValue","3");
		
	}

	@And("^user is enter the Check In Date$")
	public void user_is_enter_the_Check_In_Date() throws Throwable {
		clear(pom.getInstancesh().getIndate());
		  inputText(pom.getInstancesh().getIndate(),"27/03/2022");
				    
	}

	@And("^user is enter the Check Out Date$")
	public void user_is_enter_the_Check_Out_Date() throws Throwable {
		 clear(pom.getInstancesh().getOutdate());
		  inputText(pom.getInstancesh().getOutdate(),"28/03/2022"); 
	}

	@And("^user is select the adults per room$")
	public void user_is_select_the_adults_per_room() throws Throwable {
		 dropDown(pom.getInstancesh().getAdults(),"ByValue","2");
	}

	@And("^user is select the Childrens per room$")
	public void user_is_select_the_Childrens_per_room() throws Throwable {
		dropDown(pom.getInstancesh().getChild(),"Byvalue","1");    
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		  
		  clickButton(pom.getInstancesh().getClick());
				   
				 
	}
	
	@Given("^user is redirected to select hotel page$")
	public void user_is_redirected_to_select_hotel_page() throws Throwable {
		clickButton(pom.getInstancesh1().getCl());
		
	}

	@Then("^user is click on continue button$")
	public void user_is_click_on_continue_button() throws Throwable {
		   clickButton(pom.getInstancesh1().getCl1());
		   
	}
	
	@Given("^user is redirect to book a hotel page and user is enter the firstname$")
	public void user_is_redirect_to_book_a_hotel_page_and_user_is_enter_the_firstname() throws Throwable {
		inputText(pom.getinstancehb().getFn(),"kalpana");
	    
	}

	@When("^user is enter the lastname$")
	public void user_is_enter_the_lastname() throws Throwable {
		  inputText(pom.getinstancehb().getLn(),"venkat");
		   
	}

	@And("^user is enter the Billing Address$")
	public void user_is_enter_the_Billing_Address() throws Throwable {
   inputText(pom.getinstancehb().getAddress(),"no.225,3rd cross,lakshmipuram,indira nagar,bangalore,karnataka");
	}

	@And("^user is enter the credit card number$")
	public void user_is_enter_the_credit_card_number() throws Throwable {
		inputText(pom.getinstancehb().getCc(),"0123456789012354");    
	}

	@And("^user is Select the credit card type$")
	public void user_is_Select_the_credit_card_type() throws Throwable {
		dropDown(pom.getinstancehb().getType(), "ByValue", "VISA"); 
	}

	@And("^user is Select the exp month$")
	public void user_is_Select_the_exp_month() throws Throwable {
		  dropDown(pom.getinstancehb().getExpmonth(),"ByValue","9");
	}

	@And("^user is select the exp year$")
	public void user_is_select_the_exp_year() throws Throwable {
		 dropDown(pom.getinstancehb().getExpyear(),"ByValue","2022");    
	}

	@And("^user is enter the CVV number$")
	public void user_is_enter_the_CVV_number() throws Throwable {
		   inputText(pom.getinstancehb().getCvv(),"123");
	}

	@Then("^user is click on book now$")
	public void user_is_click_on_book_now() throws Throwable {
		
		clickButton(pom.getinstancehb().getBooking());
	}
	
	@Given("^user is taking screenshot$")
	public void user_is_taking_screenshot() throws Throwable {
	    BaseClass.takeScreenShot();
	}

	
	    
	   






}
