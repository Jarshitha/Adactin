package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Details {

@FindBy(xpath="//a[text()='Women']")
private WebElement women;
@FindBy(xpath="(//a[@class='product-name'])[2]")
private WebElement product;
@FindBy(xpath="//i[@class='icon-plus']")
private WebElement quan;
@FindBy(id="add_to_cart")
private WebElement cart;

private WebDriver driver;


public Dress_Details(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getWomen() {
return women;
}
	
public WebElement getProduct() {
return product;
}


public WebElement getQuan() {
return quan;
}

public WebElement getCart() {
return cart;
}

}
