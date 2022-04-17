package com.testNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {

	public static WebDriver driver;
	@Parameters({"kalpanavenkat","jarshitha"})
	@Test
	
	private void credential(String kalpanavenkat,String jarshitha) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://adactinhotelapp.com/index.php");
		
        WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("kalpanavenkat");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("jarshitha");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
}
}