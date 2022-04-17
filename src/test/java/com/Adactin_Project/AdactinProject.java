package com.Adactin_Project;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.helper_file.FileReadManager;
import com.pojoclass.Pom_Adactin;

public class AdactinProject extends BaseClass{
	
	public static WebDriver driver=BaseClass.getbrowser("chrome");
	public static Pom_Adactin pom=new Pom_Adactin(driver);
	
	public static void main(String[] args) throws IOException {
		
			
	geturl(FileReadManager.getInstance_FRM().getInstance_CR().geturl());
		
	inputText(pom.getInstancela().getUser(),"kalpanavenkat");
		
	inputText(pom.getInstancela().getPw(),"jarshitha");
		
	clickButton(pom.getInstancela().getLog());
		
	dropDown(pom.getInstancesh().getPlace(),"VisibleText","New York");
		
	dropDown(pom.getInstancesh().getHotel(),"VisibleText","Hotel Sunshine");
		    
  dropDown(pom.getInstancesh().getRoom(),"VisibleText","Super Deluxe");
		   
  dropDown(pom.getInstancesh().getNum(),"ByValue","3");
		   
 clear(pom.getInstancesh().getIndate());
  inputText(pom.getInstancesh().getIndate(),"20/03/2022");
		    
    clear(pom.getInstancesh().getOutdate());
  inputText(pom.getInstancesh().getOutdate(),"21/03/2022");
  
 dropDown(pom.getInstancesh().getAdults(),"ByValue","2");
		   
 dropDown(pom.getInstancesh().getChild(),"Byvalue","1");
		  
  clickButton(pom.getInstancesh().getClick());
		   
		 
		    clickButton(pom.getInstancesh1().getCl());
		
		    clickButton(pom.getInstancesh1().getCl1());
		    
		   
		    inputText(pom.getinstancehb().getFn(),"kalpana");
		    
		  
		   inputText(pom.getinstancehb().getLn(),"venkat");
		   
           
		   inputText(pom.getinstancehb().getAddress(),"no.225,3rd cross,lakshmipuram,indira nagar,bangalore,karnataka");
		   
		  inputText(pom.getinstancehb().getCc(),"0123456789012354");
		    
		 
		    dropDown(pom.getinstancehb().getType(), "ByValue", "VISA");
		    
		 
		    dropDown(pom.getinstancehb().getExpmonth(),"ByValue","9");
		    
		
		    dropDown(pom.getinstancehb().getExpyear(),"ByValue","2022");
		    
		    
		   
		    inputText(pom.getinstancehb().getCvv(),"123");
		    
		   
		    clickButton(pom.getinstancehb().getBooking());
		    
		    TakesScreenshot ts=(TakesScreenshot)driver;
		    File source=ts.getScreenshotAs(OutputType.FILE);
		    File destination=new File("C:\\Users\\Abhi\\eclipse-workspace\\Hello World\\Adactin_Project\\picture/booking.png");
		    FileUtils.copyFile(source,destination);
		    

		  
		   clickButton(pom.getinstancelp().getLogout());
		   
		 
		    driver.close();
		    
		    

	
		
	}}
