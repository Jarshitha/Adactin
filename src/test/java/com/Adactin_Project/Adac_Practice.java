package com.Adactin_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adac_Practice {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhi\\eclipse-workspace\\Hello World\\sele day1\\Driver\\chromedriver.exe" );
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://adactinhotelapp.com/index.php");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			WebElement user = driver.findElement(By.id("username"));
			user.sendKeys("kalpanavenkat");
			
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("jarshitha");
			
			WebElement login = driver.findElement(By.id("login"));
			login.click();
			
			WebElement place = driver.findElement(By.id("location"));
			Select loc=new Select(place);
		    loc.selectByValue("New York");
		    
		    WebElement hotel= driver.findElement(By.id("hotels"));
		    Select s1=new Select(hotel);
		    s1.selectByValue("Hotel Sunshine");
		    
		    WebElement room = driver.findElement(By.id("room_type"));
		    Select s2=new Select(room);
		    s2.selectByValue("Super Deluxe");
		    
		    WebElement num = driver.findElement(By.id("room_nos"));
		    Select s3=new Select(num);
		    s3.selectByValue("3");
		    
		    WebElement indate = driver.findElement(By.id("datepick_in"));
		    indate.sendKeys("11/03/2022");
		    
		    WebElement outdate = driver.findElement(By.id("datepick_out"));
		    outdate.sendKeys("12/03/2022");
		    
		    WebElement adults = driver.findElement(By.id("adult_room"));
		    Select s4=new Select(adults);
		    s4.selectByValue("2");
		    
		    WebElement child = driver.findElement(By.id("child_room"));
		    Select s5=new Select(child);
		    s5.selectByValue("1");
		    
		    WebElement click = driver.findElement(By.id("Submit"));
		    click.submit();
		    
		    WebElement cl= driver.findElement(By.id("radiobutton_0"));
		    cl.click();
		    
		    WebElement cl1 = driver.findElement(By.id("continue"));
		    cl1.click();
		    
		    WebElement fn = driver.findElement(By.id("first_name"));
		    fn.sendKeys("kalpana");
		    
		    WebElement ln = driver.findElement(By.id("last_name"));
		    ln.sendKeys("venkat");
		    
		    WebElement address = driver.findElement(By.id("address"));
		    address.sendKeys("no.225,3rd cross,lakshmipuram,indira nagar,bangalore,karnataka");
		    
		    WebElement cc = driver.findElement(By.id("cc_num"));
		    cc.sendKeys("0123456789012354");
		    
		    WebElement type = driver.findElement(By.id("cc_type"));
		    Select s6=new Select(type);
		    s6.selectByValue("VISA");
		    
		    WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		    Select s7=new Select(expmonth);
		    s7.selectByValue("9");
		    
		    WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		    Select s8=new Select(expyear);
		    s8.selectByValue("2022");
		    
		    WebElement cvv = driver.findElement(By.id("cc_cvv"));
		    cvv.sendKeys("123");
		    
		   
		    WebElement booking = driver.findElement(By.id("book_now"));
		    booking.click();
		    
		    TakesScreenshot ts=(TakesScreenshot)driver;
		    File source=ts.getScreenshotAs(OutputType.FILE);
		    File destination=new File("C:\\Users\\Abhi\\eclipse-workspace\\Hello World\\sele day1\\pic/adactin pic.png");
		    FileUtils.copyFile(source,destination);

		     WebElement logout = driver.findElement(By.id("logout"));
		   logout.click();
		    
		    
		   
		    
		    
		    
		    
		    
		    
		}


}
