package isuitListenerdemo;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testpack1 {
	@AfterTest
	public void aftertest() {
		System.out.println("I am after test function from Testpack1");
		
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("I am before test function from Testpack1");
	}
	@Test
	public void Test_Pack() {
		
		System.out.println("i am the test function from Testpack1");
	}

}
