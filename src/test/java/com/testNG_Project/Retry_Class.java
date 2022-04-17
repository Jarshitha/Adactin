package com.testNG_Project;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer{

	int count=3;
	int limit=5;
	
	public boolean retry(ITestResult result) {
		
		if(count<=limit) {//3<=5
			count++;
			return true;
		}
		
		
		return false;
}}
