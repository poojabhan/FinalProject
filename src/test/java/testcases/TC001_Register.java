package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.RegisterPage;


public class TC001_Register extends BaseClass {


	@Test
	public void VerifyRegister() throws InterruptedException {
		test.log(LogStatus.INFO, "Starting the register page");
		RegisterPage rp= new RegisterPage(driver);
		test.log(LogStatus.INFO, "Filled up the information in register page");
		rp.Register("Pooja", "Bhandari", "pooja83_2006@yahoo.com", "999999999", "Abcd1234", "Abcd1234");	
		test.log(LogStatus.INFO, "created register page");
		
		String expectedResult="Register Account";
		String actualResult=driver.getTitle();
		
		Assert.assertEquals(actualResult, expectedResult); 
		
	}
}
			

