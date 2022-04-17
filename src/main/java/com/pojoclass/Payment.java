package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {


@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
private WebElement proceed3;

@FindBy(xpath="//a[@class='bankwire']")
private WebElement cl1;

@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
private WebElement proceed4;

private WebDriver driver;

public Payment(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public WebElement getProceed3() {
	return proceed3;
}

public WebElement getCl1() {
	return cl1;
}

public WebElement getProceed4() {
	return proceed4;
}
}