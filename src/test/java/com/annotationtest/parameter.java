package com.annotationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	public WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","F:\\DEEPAN\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	@Parameters({"username","password"})
	public void verifylogin(String username,String password) {
		WebElement d= driver.findElement(By.id("txtUsername"));
		d.sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		driver.close();

}
}
