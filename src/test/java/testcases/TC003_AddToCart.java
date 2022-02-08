package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.AddToCartPage;

public class TC003_AddToCart extends BaseClass {
	@Test
	
	public void VerifyCart() throws InterruptedException {
		AddToCartPage crt=new AddToCartPage(driver); {
			crt.VerifyCart("1");
			
			String expectedResult="Your Store";
			String actualResult=driver.getTitle();
			
			Assert.assertEquals(actualResult, expectedResult);		
		}
			
	}

}
