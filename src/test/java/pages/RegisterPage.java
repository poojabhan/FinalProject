package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class RegisterPage extends BasePage{
    //Constructor 
	public RegisterPage(WebDriver driver) {
		super(driver); 
		}
	    //click on my account
	    @FindBy(linkText="My Account")
	    public WebElement myaccount;
		//click on Register
		@FindBy(linkText="Register")
		public WebElement myregister;
		//Find the elements for your personal details (Firstname)
		@FindBy(id="input-firstname")
		public WebElement myfirstname;
		//Find the element for LastName
		@FindBy(id="input-lastname")
		public WebElement mylastname;
		//Find the element for email
		@FindBy(name="email")
		public WebElement myemail;
		//Find the element for Telephone
		@FindBy(name="telephone")
		public WebElement mytelephone;
		//Find the elements for your password (password element)
		@FindBy(id="input-password")
		public WebElement mypassword;
		//Find the element for password confirm element
		@FindBy(id="input-confirm")
		public WebElement myconfirminput;
		//Agree to the terms by clicking the check box with options class
		@FindBy(name="agree")
		public WebElement myagree;
		//Click on continue button
		@FindBy(xpath="//input[@value='Continue']")
		public WebElement mycontinue;
		@FindBy(linkText=" Warning: E-Mail Address is already registered!")
		public WebElement mymesage;
        
		public void Register(String firstname, String lastname, String email, String telephone, String password, String confirmpassword) 
		{
		myaccount.click();	
		myregister.click();
		myfirstname.sendKeys("pooja");
		mylastname.sendKeys("bhandari");
		myemail.sendKeys("pooja83_2006@yahoo.com");
		mytelephone.sendKeys("9999999999");
		mypassword.sendKeys("Abcd1234");
		myconfirminput.sendKeys("Abcd1234");
		myagree.click();
		mycontinue.click();
		System.out.println(mymesage);
		
		}

}
