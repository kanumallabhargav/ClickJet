package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter 
{
	static ExtentReports extent;
	public static ExtentReports getReport()
	{
		String operatingSystem = System.getProperty("os");
		if(operatingSystem.equalsIgnoreCase("mac"))
		{
		String path = System.getProperty("user.dir")+"/reports/index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("clickJet Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "kanumb");
		}
		else if(operatingSystem.equalsIgnoreCase("windows"))
		{
			String path = System.getProperty("user.dir")+"\\reports\\index.html";
			ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			reporter.config().setReportName("clickJet Automation Results");
			reporter.config().setDocumentTitle("Test Results");
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "kanumb");
		}
		return extent;
	}
}
