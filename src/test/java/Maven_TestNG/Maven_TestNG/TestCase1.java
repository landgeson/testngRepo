package Maven_TestNG.Maven_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestCase1 {
	WebDriver driver=null;
	
	
	@Test(groups= {"Smoke","Functional","Regrasstion"})
	  public void testcase1() throws InterruptedException {
	    driver.findElement(By.xpath("//li[@class='nav-item dropdown']//a[@id='navbarDropdown']")).click();
	    WebElement aboutlink=  driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='About Selenium']"));
		aboutlink.click();
		Thread.sleep(2000);
		String Title=driver.getTitle();
		System.out.println("Title of current page:"+Title);
		Assert.assertEquals(Title,"About Selenium | Selenium");
		//Assert.assertTrue(false);
		   }
	
	
	  @Test (dependsOnGroups={"Smoke"},groups= {"Functional"})//(dependsOnMethods="testcase1")//(enabled=false)  
	    public void testcase2() {
		 driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		  String Title=driver.getTitle();
			System.out.println("Title of current page:"+Title);
			}
	  
	  
	  @Test (dependsOnGroups={"Smoke","Functional"},groups= "Regrasstion")//(dependsOnMethods="testcase2")
	  public void verifysupport() {
	driver.findElement(By.xpath("//span[normalize-space()='Support']")).click(); 
	WebElement element=  driver.findElement(By.xpath("//a[normalize-space()='Official User Group']"));
	  if (element.isDisplayed())
	  {
		  System.out.println("Official user link group is displayed");
	  }else
	  {
		  System.out.println("Official user link group is not displayed");
	  }
	  }
 
@BeforeClass(alwaysRun=true)
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("https://www.selenium.dev/");
	 System.out.println("This is launch browser");
	 }


  @AfterClass(alwaysRun=true)
  public void closebrowser() {
	  driver.quit();
	  System.out.println("This is close browser");
  }
  

}
