package com.testNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Simple_Annotation {

	@BeforeSuite
	private void setproperty() {
		System.out.println("system set property");
		}
	
	@BeforeTest
	private void BrowserLaunch() {
		System.out.println("ChromeBrowser");
		}
	
	@BeforeClass
	private void geturl() {
		System.out.println("url launch");
		}
	
	@BeforeMethod
	private void login() {
		System.out.println("login");
		}
	@Test(priority=1,invocationCount=3)
	private void flipkart() {
		System.out.println("flipkart");
	}
	
	
	@Ignore
	@Test(priority = 0)
	private void instagram() {
		System.out.println("instagram");
		}
	
	@Test(priority=-1)
	private void amazon() {
		System.out.println("amazon");
		}
	
	
	@Test(enabled=false)
	private void zomato() {
		System.out.println("zomato");

	}
	
	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	private void homepage() {
		System.out.println("redirect to homepage");
		}
	
	@AfterTest
	private void closeBrowser() {
		System.out.println("close the Browser");
		}
	
	@AfterSuite
	private void deleteall() {
		System.out.println("delete all cookies");
		}
	
	
}
