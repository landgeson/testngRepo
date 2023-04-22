package IInvokedmethodemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(IInvokedmethodemo.Listeners.class)
public class TestDEmo1 {
	
	@Test
	public void testdemo() {
		
		System.out.println("Yhis is my test invoked method");
	}
	@AfterClass
	public void afetrclass() {
		
		System.out.println("This is my after class");
	}
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("This is my before class");
	}

}
