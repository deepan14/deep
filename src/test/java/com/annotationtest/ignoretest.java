package com.annotationtest;

import org.testng.annotations.Test;

public class ignoretest {
	@Test
	public void testCase1() {
	System.out.println("in test case 1");
	}
	@Test(enabled=false)
	public void testCase2() {
	System.out.println("in test case 2");
	}
	@Test
	public void testcase3()
	{System.out.println("hi");}
	
}
