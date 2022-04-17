package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public static WebDriver driver;

	
@FindBy(id="email")
private WebElement username;
@FindBy(id="passwd")
private WebElement passwd;
@FindBy(id="//i[@class='icon-lock left']")
private WebElement SignIn ;


public Login_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	
public WebElement getUsername() {
return username;
	}


public WebElement getPasswd() {
return passwd;
}


public WebElement getSignIn() {
return SignIn;
}


	
}

