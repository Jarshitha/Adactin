package com.Adactin_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver getbrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		 driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	public static void clickButton(WebElement element) {
	element.click();
	
	
	}
	public static void clear(WebElement element) {
		element.clear();

	}
	public static void inputText(WebElement ele,String str) {
	ele.sendKeys(str);
	}
	public static void geturl(String url) {
		driver.get(url);
		
	}
	public static void close() {
		driver.close();
	}
	


	public static void takeScreenShot() throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
    File source=ts.getScreenshotAs(OutputType.FILE);
    File destination=new File("C:\\Users\\Abhi\\eclipse-workspace\\Hello World\\Adactin_cucumber\\Picture/booking.png");
    FileUtils.copyFile(source,destination);
	}
    
		public static void dropDown(WebElement element, String type, String v) {
			Select s=new Select(element);
			
			if(type.equalsIgnoreCase("VisibleText")) {
				s.selectByVisibleText(v);
				
			}
			
			else if(type.equalsIgnoreCase("ByValue")) {
				s.selectByValue(v);
				
			}
			else if(type.equalsIgnoreCase("ByIndex")) {
				int byIndex_Value = Integer.parseInt(v);
				s.selectByIndex(byIndex_Value);
			}
			
			}
		}
			
		



