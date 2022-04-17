package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pom_Adactin {

	public static WebDriver driver;
	
	private Login_Adactin la;
	private Search_Hotel sh;
	private Select_Hotel sh1;
	private Hotel_Booking hb;
	private Logout_Page lp;
	
	
	public Pom_Adactin(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
		 
		public Login_Adactin getInstancela() {
			la=new Login_Adactin(driver);
			return la;
		}
			public Search_Hotel getInstancesh() {
				sh=new Search_Hotel(driver);
				return sh;
			}
			public Select_Hotel getInstancesh1() {
				sh1=new Select_Hotel(driver);
				return sh1;
			}
			public Hotel_Booking getinstancehb() {
				hb=new Hotel_Booking(driver);
				return hb;
			}
			public Logout_Page getinstancelp() {
				lp=new Logout_Page(driver);
				return lp;
			}
		}
		
	
	
	

	
