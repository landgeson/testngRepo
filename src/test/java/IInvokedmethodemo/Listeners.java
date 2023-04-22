package IInvokedmethodemo;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class Listeners implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
	System.out.println("This is my beforeInvocation logs " + method.getTestMethod().getMethodName()+" "
			+ "of the class"+ testResult.getTestClass());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("This is my afterInvocation logs " + method.getTestMethod().getMethodName()+" "
				+ "of the class"+ testResult.getTestClass());
		
	}
	
	

}
