package Maven_TestNG.Maven_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reportlog {
  @Test
  public void f() {
	  
	  Reporter.log("Sitting up the driver and managing the xml file",true);
	  WebDriverManager.edgedriver().setup();
	 WebDriver driver=new EdgeDriver();
	 Reporter.log("Launching the browser  \n");
	  driver.get("http://in.youtube.com/");
	  driver.manage().window().maximize();
	  String Title=driver.getTitle();
	  Reporter.log("Title of current page:"+Title,true);
	  driver.close();
  }
}
