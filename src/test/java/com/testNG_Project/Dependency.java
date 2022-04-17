package com.testNG_Project;

import org.testng.annotations.Test;

public class Dependency {

	@Test
	private void schoolfees1() {
		System.out.println("school fees 50%");
	}
	
	@Test
	private void tutionfees() {
		System.out.println("tution fees 30%");
	}
	
	@Test(dependsOnMethods = "schoolfees1")
	private void schoolfees() {
		System.out.println("Fee Details");
	}
}
