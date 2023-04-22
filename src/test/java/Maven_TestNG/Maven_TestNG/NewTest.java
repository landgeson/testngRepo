package Maven_TestNG.Maven_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class NewTest {
	//Maven_TestNG.Maven_TestNG.NewTest
  @Test
  public void f() {
	  System.out.println("this is my condition 1");
  }
  @Test
  public void g() {
	  System.out.println("this is my condition 2");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is precondition operation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is postcondition operation");
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("i need a valid apllication url");
  }
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("close the apllication url");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("this is my before test");
	  
  }
  @AfterTest
  public void afterTest() {
	  
	  System.out.println("this is my after test");
	  
  }

}
