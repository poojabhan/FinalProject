package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class GiftCertPage extends BasePage {
    
	public GiftCertPage(WebDriver driver) {
		super(driver);
	}
		
		@FindBy(linkText="Gift Certificates")
		public WebElement mygift;
		@FindBy(id="input-to-name")
		public WebElement myrespname;
		@FindBy(id="input-to-email")
		public WebElement myrespemail;
		@FindBy(id="input-from-name")
		public WebElement myname;
		@FindBy(id="input-from-email")
		public WebElement myemail;
		@FindBy(name="voucher_theme_id")
		public WebElement mygifttheme;
		@FindBy(name="message")
		public WebElement mymessage;
		@FindBy(name="amount")
		public WebElement myamount;
		@FindBy(xpath="//input[@type='checkbox']")
		public WebElement checkbox;
		@FindBy(xpath="//input[@value='Continue']")
		public WebElement mycontinue;
		
		public void GiftCert(String respname, String respemail, String name, String email, String message, String amount) {
			mygift.click();
			myrespname.sendKeys("bobby");
			myrespemail.sendKeys("bobby6@yahoo.com");
			myname.sendKeys("pooja");
			myemail.sendKeys("pooja83_2006@yahoo.com");
			mygifttheme.click();
			mymessage.sendKeys("This is the gift order");
			myamount.sendKeys("100");
			checkbox.click();
			mycontinue.click();	
			
		}
	}

