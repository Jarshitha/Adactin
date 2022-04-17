package com.pojoclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Adactin {

@FindBy(id="username")
private WebElement user;

@FindBy(id="password")
private WebElement pw;

@FindBy(id="login")
private WebElement log;

public static WebDriver driver;


public Login_Adactin(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getUser() {
	return user;
}

public WebElement getPw() {
	return pw;
}

public WebElement getLog() {
	return log;
}


	
}
