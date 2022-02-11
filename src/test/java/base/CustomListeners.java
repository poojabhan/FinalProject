package base;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners extends Utilities implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("test has started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test is successfully passed");

	}

	public void onTestFailure(ITestResult result) {
		try {
			//Called get screenshot method
			utilities.Utilities.getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("test started");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test has finished");
	}

}
