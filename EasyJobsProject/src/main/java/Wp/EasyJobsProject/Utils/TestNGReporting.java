package Wp.EasyJobsProject.Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGReporting  implements ITestListener{
	
private WebDriver driver =null;
	
	public void onStart(ITestContext result)
	{
		System.out.println("Test Execution Has Started : " + result.getName());
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Has Started : " + result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test has been Successfull : " + result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Has been Failed  : " + result.getName());
		driver = DriverManager.driver;
		
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desfile = new File("E:\\Selenium\\selenium.png");
		try {
			FileHandler.copy(scrfile, desfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot has been taken !!!");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Has been Skipped : " + result.getName());
	}
	public void onFinish(ITestContext result)
	{
		System.out.println("Test Execution Has Finished : " + result.getName());
	}

}
