package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.ReturnPage;

public class TC004_Returns extends BaseClass {
	@Test
    
      public void VerifyReturn() {
    	  ReturnPage rp= new ReturnPage(driver);
    	  rp.myreturn.click();
    	  test.log(LogStatus.INFO, "Entered the information in the return page");
    	  rp.Return("Pooja", "Bhandari", "pooja83_2006@yahoo.com", "12345", "7777", "2021-02-02", "Laptops & Notebooks", "A52", "1", 
          "The delivered item is different than ordered" );
    	  
    	  String expectedResult="Product Returns";
			String actualResult=driver.getTitle();
			
			Assert.assertEquals(actualResult, expectedResult);	
          
      }
	
}
