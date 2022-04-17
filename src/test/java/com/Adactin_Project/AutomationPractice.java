package com.Adactin_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.helper_file.FileReadManager;

import object_Manager.Page_Object_Manager;

public class AutomationPractice extends BaseClass{
	
	public static WebDriver driver=BaseClass.getbrowser("chrome");
	public static AutomationPractice pom=new AutomationPractice(driver);
	
	

	public AutomationPractice(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) throws IOException {
		
		
		
		
		geturl(FileReadManager.getInstance_FRM().getInstance_CR().geturl());
		
		driver=getbrowser("chrome");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhi\\eclipse-workspace\\Hello World\\sele day1\\Driver\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		//driver.get("http://automationpractice.com/index.php");
		geturl("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
	//	sign.click();
		
	
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kalpana93@gamil.com");
		
		WebElement pw = driver.findElement(By.id("passwd"));
		pw.sendKeys("9916836367");
		
		WebElement sin = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		sin.click();
		
		WebElement wom = driver.findElement(By.xpath("//a[text()='Women']"));
		wom.click();
		
		WebElement prod = driver.findElement(By.xpath("(//a[@class='product-name'])[2]"));
		prod.click();
		
		WebElement qua = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		qua.click();
		
		WebElement cart = driver.findElement(By.id("add_to_cart"));
		cart.click();
		
		WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		proceed.click();
		
		WebElement proceed1 = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		proceed1.click();
		
		WebElement proceed2 = driver.findElement(By.name("processAddress"));
		proceed2.click();
		
		WebElement cl = driver.findElement(By.id("cgv"));
		cl.click();
		
		WebElement proceed3 = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		proceed3.click();
		
		WebElement cl2 = driver.findElement(By.xpath("//a[@class='bankwire']"));
		cl2.click();
		
		WebElement proceed4 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		proceed4.click();
		
		
		
		
		
	}}

