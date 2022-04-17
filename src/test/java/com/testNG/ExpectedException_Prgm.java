package com.testNG;

import java.io.InterruptedIOException;

import org.junit.rules.ExpectedException;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExpectedException_Prgm {
	@Test(timeOut=10000,expectedExceptions= {ExpectedException.class, ThreadTimeoutException.class})
private void TimeOut() throws InterruptedIOException, Throwable {

		System.out.println("TimeOut Method1");
		Thread.sleep(3000);
		System.out.println("TimeOut Method2");
		Thread.sleep(5000);
		System.out.println("Final Output");
	}}