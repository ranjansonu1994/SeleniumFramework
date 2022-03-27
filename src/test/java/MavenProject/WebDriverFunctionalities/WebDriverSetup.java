package MavenProject.WebDriverFunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MavenProject.UtilityFunction.ExtentReport;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSetup {
	
	public static WebDriver webDriverInitialize()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	public static void webDriverWrapUp(WebDriver driver,ExtentReport report)
	{
		driver.close();
		report.endTest();
	}

}
