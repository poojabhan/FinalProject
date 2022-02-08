package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.RegisterPage;


public class TC001_Register extends BaseClass {


	@Test
	public void VerifyRegister() throws InterruptedException {
		RegisterPage rp= new RegisterPage(driver);
		rp.Register("Pooja", "Bhandari", "pooja83_2006@yahoo.com", "999999999", "Abcd1234", "Abcd1234");	
		
		String expectedResult="Register Account";
		String actualResult=driver.getTitle();
		
		Assert.assertEquals(actualResult, expectedResult);

	}
}
			

