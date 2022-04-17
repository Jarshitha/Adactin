package com.testNG_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Adactin_Project.BaseClass;

public class My_Test  extends BaseClass{
	
@Test(retryAnalyzer=Retry_Class.class)

private void Username() {
	String Expected="Jarshitha";
	String actual="Jarshitha";

	
	Assert.assertEquals(actual, Expected);
}


}
