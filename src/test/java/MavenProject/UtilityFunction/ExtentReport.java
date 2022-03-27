package MavenProject.UtilityFunction;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	ExtentTest test;
	ExtentReports report;
	
	
	public ExtentTest startTest(String testCaseName)
	{
		this.report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults+"+java.time.LocalDate.now()+".html");
		this.test = report.startTest(testCaseName);
		return test;
	}
	public void testPass(String message)
	{
		test.log(LogStatus.PASS, message);
	}
	public void testFail(String message)
	{
		test.log(LogStatus.FAIL, message);
	}
	
	public void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	

}
