package com.testNG_Project;

import org.testng.annotations.Test;

public class Groups {

	
	@Test(groups="socialmedia")
	private void instagram() {
System.out.println("instagram");
}
	@Test(groups="socialmedia")
	private void facebook() {
		System.out.println("facebook");
	}
	
	@Test(groups="socialmedia")
	private void sharechat() {
		System.out.println("sharechat");
	}
	
	@Test(groups="sports")
	private void chess() {
		System.out.println("chess");
}
	@Test(groups="sports")
	private void carromboard() {
		System.out.println("carromboard");
	}
	
	@Test(groups="sports")
	private void cricket() {
	System.out.println("cricket");
	}
	
	@Test(groups="Electronics")
	private void mobiles() {
	System.out.println("mobiles");
	}
	
	@Test(groups="Electronics")
	private void washingmachine() {
   System.out.println("washingmachine");
	}
	
	@Test(groups="Electronics")
	private void television() {
	System.out.println("television");
	}
	
	@Test(groups="Education")
	private void tamilbook() {
		System.out.println("tamilbook"); 
	}
	
	@Test(groups="Education")
	private void englishbook() {
	System.out.println("englishbook");
	}
	
	@Test(groups="Education")
	private void mathsbook() {
		System.out.println("mathsbook");

	}
}
