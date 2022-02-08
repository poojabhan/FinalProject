package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.BasePage;

public class LoginPage extends BasePage {
    //Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		}
	
		//click on my account
	    @FindBy(xpath="//span[contains(text(),'My Account')]")
	    public WebElement myaccount;
	    //Click on Login 
	    @FindBy(linkText="Login")
	    public WebElement mylogin1;
		//Enter email address in returning customer
	    @FindBy(id="input-email")
	    public WebElement myemail;
		//Enter password in password field
	    @FindBy(id="input-password")
	    public WebElement mypassword;
		//click on login
	    @FindBy(xpath="//input[@value='Login']")
	    public WebElement mylogin;
	    

	public void Login(String email, String password) {
		myaccount.click();
		mylogin1.click();
		myemail.sendKeys("pooja83_2006@yahoo.com");
		mypassword.sendKeys("Abcd1234");
		mylogin1.click();	
		
	}
}
