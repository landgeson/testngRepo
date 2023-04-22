package ITestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public  class ListenerDemo2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("This is the test scenario : onTestStart" +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This is the test scenario : onTestSuccess" +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This is the test scenario : onTestFailure" +result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This is the test scenario : onTestSkipped" +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("This is the test scenario : onTestFailedButWithinSuccessPercentage" +result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("This is the test scenario : onStart" +context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This is the test scenario : onFinish" +context.getName());
		
	}

}
