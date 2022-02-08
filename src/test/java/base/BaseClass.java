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

import utilities.ExtentManager;


public class BaseClass {
    //initialized webdriver, created object named config 

	public static Properties config = new Properties();
	public static WebDriver driver = null;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	

	@BeforeSuite()
	public static void init() throws IOException {
		if (driver == null) {
			// load config property file
			FileInputStream fis = new FileInputStream(
			System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
			config.load(fis);
			
	       //Load the chrome browser
			config.getProperty("browser").equals("chrome"); {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
		
			} 

			driver.get(config.getProperty("testsiteURL"));
			driver.manage().window().maximize();

			// Global implicit Wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
	}
	
	
	@AfterSuite()
	public static void tearDown() {
		
		BaseClass.driver.quit();
	}
}
