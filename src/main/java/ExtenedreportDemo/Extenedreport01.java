package ExtenedreportDemo;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extenedreport01{
	ExtentSparkReporter htmlReporte;
	ExtentReports reports;
	ExtentTest Test;
	
	@BeforeTest
	public void createReport() {
		htmlReporte= new ExtentSparkReporter("ExtendReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporte);

		//add environment details
		reports.setSystemInfo("Mashin", "testPc1");
		reports.setSystemInfo("OS", "windows 10");
		reports.setSystemInfo("Browser", "Edge");
		reports.setSystemInfo("User", "sonali");

		//configuration to change look and fee
		htmlReporte.config().setDocumentTitle("Extend report demo");
		htmlReporte.config().setReportName("Test Report");
		htmlReporte.config().setTheme(Theme.STANDARD);
		htmlReporte.config().setTimeStampFormat("EEEE,MMMM dd,yyyy,hh:mm, a'('ZZZ')'");

	}
	@Test
	public  void Launchbrowserandopenurl() {
		//create test
		Test=reports.createTest("Launch browser and open url");
		Assert.assertTrue(true);//test pass
	}
	@Test
	public void VeryfyTitle() {
		//create test
		Test=reports.createTest("Verfy Title");
		Assert.assertTrue(false);//Test failed
	}
	@Test
	public void VeryfyLogo() {
		//create test
		Test=reports.createTest("Verfy Logo");
		Assert.assertTrue(true);//Test pass
	}
	@Test
	public void VeryfyEmail() {
		//create test
		Test=reports.createTest("Verfy Email");
		throw new SkipException("This is skip test exception");
	}
	@Test
	public void VeryfyUserName() {
		//create test
		Test=reports.createTest("Verfy User name");
		Assert.assertTrue(true);//Test pass
	}
	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		if(result.getStatus()== ITestResult.FAILURE )
		{
			Test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"FAILED", ExtentColor.RED ));
		Test.fail(result.getThrowable());
		}
		else if(result.getStatus()== ITestResult.SUCCESS )
		{
			Test.log(Status.PASS,MarkupHelper.createLabel(result.getName()+"PASSED", ExtentColor.GREEN ));
		}
		else if(result.getStatus()== ITestResult.SKIP )
		{
			Test.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+"SKIPPED", ExtentColor.YELLOW ));
		}

	}
	@AfterTest
	public void teardown() 
	{
		reports.flush();
	}

}

