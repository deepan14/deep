package com.automation.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class dressobject extends Basepage {
		@FindBy(xpath="(//a[@title='Dresses'])[2]")
		private WebElement dress;
		
		@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-s']")
		private WebElement small;
		@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-m']")
		private WebElement medium;
		@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-l']")
		private WebElement large;
		
		
		
		
		
		@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?id_product=3&controller=product'])[1]")
		private WebElement addproduct;
		
		@FindBy(xpath="(//a[@title='Add to cart'])[1]")
		private WebElement addcart;
		
		@FindBy(xpath="//a[@title='Proceed to checkout']")
		private WebElement proceed;
		
		@FindBy(xpath="(//input[@value='1'])[2]")
		private WebElement qty;
		
		
		@FindBy(xpath="//span[@class='heading-counter']")
		private WebElement count;
		@FindBy(xpath="//a[@class='product_img_link']")           ////div[@class='product-container']
		private  List<WebElement>  productcount;
		
		
		
		public dressobject() {
			PageFactory.initElements(driver, this);
		}
		
		public WebElement dresstab() {
			return dress;
		
		}
		public WebElement sizesmall() {
			return small;
		
		}
		public WebElement sizemedium() {
			return medium;
		
		}
		public WebElement sizelarge() {
			return large;
		
		}
		public WebElement countt() {
			return count;
		}
		
		public  List<WebElement> productcount() {
			return  productcount;
		}
		
		public WebElement product() {
			return addproduct;
		
		}public WebElement cart() {
			return addcart;
		
		}public WebElement proceedcheck() {
			return proceed;
		
		}
		
		public WebElement qtycheck() {
			return qty;
		
		}
		
		
		
		
		
		
		
		
	}





