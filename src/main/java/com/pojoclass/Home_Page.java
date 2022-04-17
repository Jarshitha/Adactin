package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public static WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
//	WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
//	sign.click();
	
	private WebElement signin ;
		
	public Home_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
		
	}

}


