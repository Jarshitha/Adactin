package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_List{

	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement proceed;
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceed1;
	@FindBy(name="processAddress")
	private WebElement proceed2;
	@FindBy(id="cgv")
	private WebElement cl;
	
	private WebDriver driver;


public Check_List(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

public WebElement getProceed() {
return proceed;
}
	
public WebElement getProceed1() {
return proceed1;
}

public WebElement getProceed2() {
return proceed2;
}

public WebElement getCl() {
return cl;
}


}