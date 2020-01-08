package com.automation.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productdetails extends Basepage{
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="(//a[@title='Printed Dress'])[2]")
	private WebElement productclick;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-twitter']")
	private WebElement tweet;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-facebook']")
	private WebElement share;
	@FindBy(xpath="//div[@id='short_description_content']")
	private WebElement description;

	public  productdetails() {
		PageFactory.initElements(driver, this);
}
	
	public WebElement dressclick () {
		return dress;
}
	public WebElement productdisp() {
		return productclick;
}
	public WebElement tweetdisp() {
		return tweet;
}
	public WebElement sharedisp () {
		return share;
}
	public WebElement descriptiondisp() {
		return description;
}
}