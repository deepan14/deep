package com.annotationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.google.common.collect.ObjectArrays;

public class dataprovider {
	
	
	public static WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","F:\\DEEPAN\\chromedriver_win32\\chromedriver.exe");
         driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@DataProvider(name="verify")
	public Object[][]getdata(){
		Object[][]  data=new Object[3][2];
		data[0][0] ="Admin";
		data[0][1]="admin123";
		data[1][0]="Admin";
		data[1][1]="s";
		data[2][0]="Admin";
		data[2][1]="admin123";		
		return data;
		}
@Test(dataProvider="verify")
public void verifylogin(String auser,String password) {
	WebElement d= driver.findElement(By.id("txtUsername"));
	d.sendKeys(auser);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	driver.close();
	
}



}


