package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utilities.ExtentReporter;

public class Listeners extends Base implements ITestListener
{
	ExtentReports extent = ExtentReporter.getReport();
	ExtentTest test;

	public void onFinish(ITestContext arg0) 
	{
		extent.flush();
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) 
	{
		//get reusable info
		String methodName = result.getMethod().getMethodName();
		
		//log results to extentReporter
		test.fail(result.getThrowable());
		try 
		{
			@SuppressWarnings("unused")
			WebDriver driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		//getScreenshot on failure
		Screenshot scrnshtObject = new Screenshot();
		try 
		{
			scrnshtObject.getScreenShot(methodName, driver);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) 
	{
		test.skip(result.getThrowable());
	}

	public void onTestStart(ITestResult result) 
	{
		test = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult arg0) 
	{
		test.log(Status.PASS, "Test Case Passed");
	}
}
