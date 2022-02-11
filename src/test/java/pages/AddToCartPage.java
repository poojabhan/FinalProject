package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class AddToCartPage extends BasePage {

	private static final JavascriptExecutor driver = null;

    //Constructor
	public AddToCartPage(WebDriver driver) {
		super(driver);
	}
		@FindBy(partialLinkText="Laptops")
		public WebElement mylaptop;
		
		@FindBy(partialLinkText="Show All")
		public WebElement myshowalldesktops;
		
		
	    @FindBy(xpath="//img[@alt='MacBook']")
		public WebElement mymacbook;
	    
	    @FindBy(id="input-quantity")
	    public WebElement myquantity;
	    
	    @FindBy(id="button-cart")
	    public WebElement mybttncart;
	    
	    @FindBy(id="cart-total")
	    public WebElement mycarttotal;
	    
	    @FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]")
	    public WebElement mycheckout;
	    
	    @FindBy(xpath=" //a[contains(text(),'Continue')]")
	    public WebElement mycontinue;
	   
		
		public void VerifyCart(String quantity) throws InterruptedException {
			mylaptop.click();
			myshowalldesktops.click();
			mymacbook.click();
			myquantity.sendKeys("1");
			mybttncart.click();
			mycarttotal.click();
			mycheckout.click();
			mycontinue.click();			
			
		}
	}



