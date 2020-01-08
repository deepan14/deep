package com.automation.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobject extends Basepage {
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
			
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tshirts;
	
	@FindBy(xpath="//input[@id='newsletter-input']")
	private WebElement news;
	@FindBy(xpath="//button[@name='submitNewsletter']")
	private WebElement newsclick;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement alretmsg;
	
	
	
	public  homepageobject() {
		PageFactory.initElements(driver, this);
}
	
	public WebElement womentab() {
		return women;
	
	}
	public WebElement dresstab() {
		return dress;
	
	}
	public WebElement tshirtstab() {
		return tshirts;
	
	}
	public WebElement newstab() {
		return news;
	}
	public WebElement newstabb() {
		return newsclick;
	}
	public WebElement msgalret() {
		
		
		return alretmsg;
	}
	public void setemailadress(String email) {
		setText(news, email);
	}
	
	
	
	
	

}
