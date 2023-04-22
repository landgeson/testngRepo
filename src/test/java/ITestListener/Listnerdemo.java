package ITestListener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ITestListener.ListenerDemo2.class)

public class Listnerdemo {
	WebDriver driver;
	@Test
	public void Test_Success() {
		
		System.out.println("This is my success test");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https:\\www.google.com");
	}
	
	@Test
	public void Test_failure() {
		
		System.out.println("This is my failure test");
	
		String Title= driver.getTitle();
		assertEquals(Title ,"google");
	}
	@Test
	public void Test_Skipped() {
		
		
		
		throw new SkipException("This is my skipped test");
	}

}

