package Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestDemo {
  @Test
  public void newtest1() {
	  System.out.println("This is my first test case: 1");
  }
  @Test
  public void newtest2() {
	  System.out.println("This is my first test case: 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This my before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This my after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This my before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This my after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This my Before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This my after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This my Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This my after suite");
  }

}
