package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.GiftCertPage;

public class TC005_GiftCert extends BaseClass {
	@Test
	public void VerifyGiftCert() {
		GiftCertPage gp= new GiftCertPage(driver);
		gp.mygift.click();
		gp.GiftCert("pooja", "pooja83_2006@yahoo.com", "Pooja", "pooja83_2006@yahoo.com", "This is the gift order", "100");
		
		String expectedResult="Purchase a Gift Certificate";
		String actualResult=driver.getTitle();
		
		Assert.assertEquals(actualResult, expectedResult);	
		
	}

}
