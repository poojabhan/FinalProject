package utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import base.BaseClass;

public class Utilities extends BaseClass {


			public static String getScreenshot() throws IOException {
			// coding for taking screenshot using in listner.java
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // driver is from BaseClass
			Date currentdate = new Date();
			String screenshotName = currentdate.toString().replace(":", "_").replace(" ", "_") + ".png";
			FileUtils.copyFile(scrFile,new File("D:\\Eclipse Worspace\\FinalProject\\target\\surefire-reports" + screenshotName));
			return screenshotName;
	}
	
}
