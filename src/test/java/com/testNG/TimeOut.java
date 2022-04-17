package com.testNG;

import org.testng.annotations.Test;

public class TimeOut {
	
	@Test(timeOut=10000)
	public void credentials() throws InterruptedException {
		System.out.println("TimeOut Method1");
		Thread.sleep(3000);
		System.out.println("TimeOut Method2");
		Thread.sleep(1000);
		System.out.println("Final Output");
	}

	


}
