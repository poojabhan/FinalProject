package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import base.BasePage;

public class ReturnPage extends BasePage {

	public ReturnPage(WebDriver driver) {
		super(driver);
	}
		
	
		@FindBy(xpath="//a[contains(text(),'Returns')]")
		public WebElement myreturn;
		@FindBy(id="input-firstname")
		public WebElement myfirstname;
		//Find the element for LastName
		@FindBy(id="input-lastname")
		public WebElement mylastname;
		//Find the element for email
		@FindBy(id="input-email")
		public WebElement myemail;
		//Find the element for Telephone
		@FindBy(id="input-telephone")
		public WebElement mytelephone;
		@FindBy(id="input-order-id")
		public WebElement myorder;
		@FindBy(xpath="//input[@id='input-date-ordered']")
		public WebElement myorderdate;
		@FindBy(id="input-product")
		public WebElement myproduct;
		@FindBy(id="input-model")
		public WebElement myproductcode;
		@FindBy(id="input-quantity")
		public WebElement myquantity;
		@FindBy(name="return_reason_id")
		public WebElement myreasonreturn;
		@FindBy(id="input-comment")
		public WebElement mycomment;
		@FindBy(xpath="//input[@type='submit']")
		public WebElement mysubmit;	
		
		public void Return(String firstname, String lastname, String email, String telephone, 
		String orderid, String date, String product, String prodid, String quantity, String description) {
		myreturn.click();
		myfirstname.sendKeys("pooja");
		mylastname.sendKeys("Bhandari");
		myemail.sendKeys("pooja83_2006@yahoo.com");
		mytelephone.sendKeys("12345");	
		myorder.sendKeys("7777");
		myorderdate.sendKeys("2021-02-02");
		myproduct.sendKeys("Laptops & Notebooks");
		myproductcode.sendKeys("A52");
		myquantity.sendKeys("1");
		myreasonreturn.click();
		mycomment.sendKeys("The delivered item is different than ordered");
		mysubmit.click();
					
		}	
	}


