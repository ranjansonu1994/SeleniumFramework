package MavenProject.TestCaseExecution;

import static MavenProject.WebDriverFunctionalities.WebDriverSetup.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import MavenProject.BrowseCommomMethods.firstCommonClass;
import MavenProject.UtilityFunction.ExtentReport;


public class TestNg {
	
	WebDriver driver;
	ExtentTest test;
	
	@Test
	public void testCaseName()
	{
		 driver=webDriverInitialize();
		//Methods to Run the code
		 ExtentReport report=new ExtentReport();
		 report.startTest("testCaseName");
		 firstCommonClass fcs=new firstCommonClass(report, driver);
		 
		 fcs.firstMethod();
		
		 
		 webDriverWrapUp(driver,report);
	}

}
