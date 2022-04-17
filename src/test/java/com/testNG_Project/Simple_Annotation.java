package com.testNG_Project;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Adactin_Project.BaseClass;

public class Simple_Annotation extends BaseClass {

	
	@BeforeSuite 
	private void setproperty() {
	getbrowser("chrome");
		}
	
	@BeforeTest
	private void BrowserLaunch() {
		System.out.println("browser is launched");
		
	}
	
	@BeforeClass
	private void geturl() {
		geturl("http://adactinhotelapp.com/index.php");
		System.out.println("Adactin Url is Launched");
		}
	
	@BeforeMethod
	private void loginCredentials() {
	System.out.println("provide username and password");
	}
	
	@Test
	private void Logindetails() {
		System.out.println("Login Credentials is entered");
		inputText(driver.findElement(By.id("username")), "kalpanavenkat");
		inputText(driver.findElement(By.id("password")), "jarshitha");
	
		driver.findElement( By.id("login")).click();
		
	}
	@AfterMethod
	private void logout() {
	System.out.println("logout");

	}
	
	@AfterClass
	private void Homepage() {
		System.out.println("Homepage");

	}
	
	@AfterTest
	private void closeBrowser() {
		close();

	}
	
	@AfterSuite
	private void deleteall() {
  System.out.println("delete all cookies");

	}
	
	
	
	
}
