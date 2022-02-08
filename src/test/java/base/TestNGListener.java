package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed" +result.getName());		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test cases are skipped" +result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	public void onStart(ITestContext context) {
				
	}

	public void onFinish(ITestContext context) {
		
		
	}
	
	

}
