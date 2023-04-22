package ParallelDemo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;





public class Paralleltest1 {
	WebDriver driver;
 
	  
	 @Test//(threadPoolSize=3,invocationCount=3,timeOut=1000)
	  public void test01() throws InterruptedException {
		  System.out.println("test 1 excution"  + Thread.currentThread().getId());
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("http://in.youtube.com/");
		 
		  driver.quit();
	 }
  

   @Test
    public void test02() throws InterruptedException {
	  System.out.println("test 2 excution"  + Thread.currentThread().getId());
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://gmail.com/");
	 
	  driver.quit();
	  
 }
  
}