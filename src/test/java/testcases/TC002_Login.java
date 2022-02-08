package testcases;

   import org.openqa.selenium.support.PageFactory;
   import org.testng.Assert;
   import org.testng.annotations.Test;

   import base.BaseClass;
   import pages.LoginPage;

   public class TC002_Login extends BaseClass {
	@Test
	
    public void VerifyLogin() {
	//Created the object of LoginPage and called the Login method from Login page
	LoginPage lp= new LoginPage(driver);
	lp.Login("pooja83_2006@yahoo.com", "Abcd1234");

	String expectedResult="Account Login";
	String actualResult=driver.getTitle();
	
	Assert.assertEquals(actualResult, expectedResult);
	
}
	  
}
