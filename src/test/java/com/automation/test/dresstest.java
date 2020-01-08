package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.page.Basepage;
import com.automation.page.dressobject;



public class dresstest {
	dressobject homepage;
	Basepage base;
	public dresstest() {
		homepage=new dressobject();
		base=new Basepage();
	}
@Test
public void dressclick() {
	  homepage.dresstab().click();	 
   Assert.assertTrue(base.getTitle().contains("Dresses"));
	  Assert.assertTrue(homepage.getTitle().equalsIgnoreCase("Dresses - My Store"));
}


@Test
public void size() {
	Assert.assertTrue(homepage.sizesmall().isDisplayed(),"not found small");
	Assert.assertTrue(homepage.sizemedium().isDisplayed(), "not found medium");
	Assert.assertTrue(homepage.sizelarge().isDisplayed(),"not found large");
	
}

@Test
public void verifyproduct() {
	
	base.movemouse(homepage.product());
	Assert.assertTrue(base.elementFound(homepage.product()),"not found product");
	homepage.cart().click();
	Assert.assertTrue(homepage.cart().isDisplayed(), "fail cart");
	homepage.proceedcheck().click();
	//Assert.assertTrue(base.elementFound(homepage.qtycheck()));
	//homepage.getTxtAttribute(homepage.qtycheck()).contains("1");
	Assert.assertTrue(homepage.getTxtAttribute(homepage.qtycheck()).contains("1"),"fail");
	}
@Test
public void verifycount() {
//	String a=homepage.countt().getText();
//	//System.out.println(a);
//	int b= homepage.productcount().size();
//	//System.out.println(b);
//	String c=Integer.toString(b);
//	Assert.assertTrue(a.contains(c), "message");
	
    boolean a1=homepage.countt().getText().contains("5");
    System.out.println(a1);
    int b1=homepage.productcount().size();     
    System.out.println(b1);
    boolean c1=(b1==homepage.productcount().size());
    System.out.println(c1);
    //   Assert.assertEquals(a1, c1, "not found count");
    Assert.assertTrue(a1==c1);
           
	
}






}





