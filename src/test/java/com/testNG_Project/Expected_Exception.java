package com.testNG_Project;

import java.io.InterruptedIOException;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.Test;

public class Expected_Exception {
	@Test(timeOut=10000,expectedExceptions= {Expected_Exception.class, TimeoutException.class})
	
private void TimeOut() throws InterruptedIOException, Throwable {

		System.out.println("TimeOut Method1");
		Thread.sleep(2000);
		System.out.println("TimeOut Method2");
		Thread.sleep(9000);
		System.out.println("Final Output");
		
	}}