 package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtentManager;


public class BaseClass {
    //initialized webdriver, created object config, test and extent 

	public static Properties config = new Properties();
	public static WebDriver driver = null;
	//Initialized test object of Extent class
	public static ExtentTest test;
	static ExtentReports extent = ExtentManager.getInstance();


	@BeforeSuite()
	public static void init() throws IOException  {
		 test=extent.startTest("Start Test");

		if (driver == null) {
			// load config property file
			FileInputStream fis = new FileInputStream(
			System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
			config.load(fis);
			
	       //Load the chrome browser
			config.getProperty("browser").equals("chrome"); {
				//Initialized the path for Chrome driver extention
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\executables1\\chromedriver.exe");
				driver = new ChromeDriver();
		
			} 
			//
			test.log(LogStatus.INFO, "Launched the website url"); 
			driver.get(config.getProperty("testsiteURL"));
			test.log(LogStatus.INFO, "Maximized the window");
			driver.manage().window().maximize(); 
			

			// Global implicit Wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
	}
	
	@AfterSuite()
	public static void tearDown() {
		//End the test
	extent.endTest(test);
	//Flush the report
	extent.flush();
		if(driver!=null) {
			  driver.quit();
			  System.out.println("The browser has closed successfully");
			 	}
	}
}
