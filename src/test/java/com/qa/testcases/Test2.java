package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void login() {
		System.out.println("Login here");
		Assert.assertTrue(true);
	}

	@Test
	public void logout() {
		System.out.println("logged out successfully");
		Assert.assertTrue(true);
	}
	
	@Test
	public void run() {
		System.out.println("run the test");
		Assert.assertTrue(true);
	}

}
