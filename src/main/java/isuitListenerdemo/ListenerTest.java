package isuitListenerdemo;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ListenerTest implements ISuiteListener  {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("This is my start test "+ suite);
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("This is my finish test "+ suite);
		
	}

}
