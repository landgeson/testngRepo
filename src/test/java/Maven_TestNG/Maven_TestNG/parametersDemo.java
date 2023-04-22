package Maven_TestNG.Maven_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parametersDemo {
	WebDriver driver=null;
	
	@Test
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
	
	  @Test 
	    public void testcase2() {
		 driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		  String Title=driver.getTitle();
			System.out.println("Title of current page:"+Title);
			}
	  
	  @Test
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
  @Parameters("browser")
     public void openBrowser(String browser) {
	  //WebDriverManager.edgedriver().setup();
	  //driver =new EdgeDriver();
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 
	  }else if(browser.equalsIgnoreCase("Edge")) {
		  WebDriverManager.edgedriver().setup();
		  driver =new EdgeDriver(); 
		  
	  }
		  else if(browser.equalsIgnoreCase("firefox")) {
			  WebDriverManager.firefoxdriver().setup();
			  driver =new FirefoxDriver(); 
		  }
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
