package com.runnerfile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_Project.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

    @RunWith(Cucumber.class)
	@CucumberOptions(features="src\\test\\java\\FeatureFile\\Login.feature",
	                 glue="com.stepdefinition",
	                 monochrome=true,
	                 dryRun=false,
	                 strict=true,
	                 plugin= {"html:Report/Cucumber_Report","pretty",
	                		 "json:Report/Cucumber.json",
	                		 "com.cucumber.listener.ExtentCucumberFormatter:Report/extent_cucumber.html"}
	                 )
	                 
			
			
		public class Run_Adactin {
		public static WebDriver driver;
		@BeforeClass
		public static void setUp(){
			
			driver=BaseClass.getbrowser("chrome");
		}
		
		@AfterClass
		public static void tearDown(){
}}