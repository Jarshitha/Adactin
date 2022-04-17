package com.testNG;

import org.testng.annotations.Test;

public class DependsOnMethods {
	

	@Test
	private void Mobileoffer() {
		System.out.println("mobile offer 50%");
	}
	
	@Test
	private void laptopoffer() {
   System.out.println("New year offer 20%");
}
	
	@Test(dependsOnMethods="mobileoffer")
	private void Aadioffer() {
    System.out.println("Aadi offer 50%");


	}

}
