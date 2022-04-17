package com.testNG_Project;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;

public class Transformer {

	private void transform(ITestAnnotation annotation,Class testclass,Constructor testConstructer,Method testMethod) {
	
		annotation.setRetryAnalyzer(Retry_Class.class);
	}
}
