package com.pojoclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Select_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement cl;
	
	@FindBy(id="continue")
	private WebElement cl1;
	

	public Select_Hotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
	
	}

	public WebElement getCl() {
		return cl;
	}

	public WebElement getCl1() {
		return cl1;
	}

}