package MavenProject.BrowseCommomMethods;

import org.openqa.selenium.WebDriver;

import MavenProject.UtilityFunction.ExtentReport;



public class firstCommonClass {
	ExtentReport report;
	WebDriver driver;
	public firstCommonClass(ExtentReport report,WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.report=report;
		this.driver=driver;
	}
	
	public void firstMethod()
	{
		driver.get("https://google.com");
		report.testPass("Successfully available to the url");
	}

}
