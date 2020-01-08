package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.page.Basepage;
import com.automation.page.productdetails;

public class producttest {
	productdetails pd;
	Basepage bp;
public producttest() {
	pd=new productdetails();
	bp=new Basepage();
}
@Test
public void dress() {
	pd.dressclick().click();
	Assert.assertTrue(pd.getTitle().contains("Dresses"),"not found");
	
}
	@Test
	public void product() {
	pd.productdisp().click();
	Assert.assertTrue(pd.elementFound(pd.tweetdisp()));
	Assert.assertTrue(pd.elementFound(pd.sharedisp()));
	Assert.assertTrue(pd.elementFound(pd.descriptiondisp()));
	
}
	
	
}
