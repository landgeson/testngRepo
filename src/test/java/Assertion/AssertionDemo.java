package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {
  @Test(enabled=false)
  public void assertiontest1() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://google.com");
	  String CurrentTitle=driver.getTitle();
	  
	  //hard assertion-rule is terminate when ever the test case condition is failed.
	  //Assert.assertEquals(CurrentTitle, "Google","Title are not matched");
	  boolean flag=false;
	  if(CurrentTitle.contains("Goo")) {
		 flag=true; 
	  }
	  
	  Assert.assertTrue(flag,"Veryfying a page title contain astring-Goo");
	  driver.navigate().refresh();
		  driver.quit();
		}
  
  @Test
  public void assertiontest2() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://google.com");
	  String CurrentTitle=driver.getTitle();
	  SoftAssert softassertion=new SoftAssert();
	  //softassertion.assertEquals(CurrentTitle, "Google","Title are not matched");
	  boolean flag=false;
	  if(CurrentTitle.contains("Gooh")) {
		 flag=true; 
	  }
	  softassertion.assertTrue(flag,"Veryfying a page title contain astring-Goo");
	  driver.navigate().refresh();
		  driver.quit();
		  softassertion.assertAll();
		  
		}
}
