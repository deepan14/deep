//package com.automation.test;
//
//import java.util.Random;
//
//import org.openqa.selenium.remote.server.handler.GetTitle;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import com.automation.page.Basepage;
//import com.automation.page.homepageobject;
//
//public class hometest {
//	
//	homepageobject homepage;
//	Basepage base;
//	int random=new Random().nextInt(5000000);
//	String email="deepannn"+random+"@gmail.com";
//	
//	
//	public hometest() {
//		homepage=new homepageobject();
//		base=new Basepage();
//	}
//
//	@Test
//	public void dresstabs() {
//		homepage.dresstab().click();
//		Assert.assertTrue(homepage.getTitle().contains("Dresses"));
//	}
//	@Test
//	public void womentabs(){
//	  homepage.womentab().click();
//	  Assert.assertTrue(homepage.getTitle().contains("Women"));
//	}
//	@Test
//	public void tshirtstabs() {
//	  homepage.tshirtstab().click(); 
//	  Assert.assertTrue(homepage.getTitle().contains("shirts"));
//	}
//	@Test
//	public void newstab() {
//	  homepage.setemailadress(email);
//	  homepage.newstabb().click();
//  String k=homepage.msgalret().getText();
//	  System.out.println(k);
//	  }
//
//
//
//
//}