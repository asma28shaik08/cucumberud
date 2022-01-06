
package com.testingxpertsdemo.cucumberud;

import io.cucumber.junit.Cucumber;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;
@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})
@CucumberOptions(plugin = {"pretty","html:target/report.html"})
//public class RunCucumberTest extends AbstractTestNGCucumberTests
//{
//	
//}

public class RunCucumberTest extends AbstractTestNGCucumberTests
{
	//public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	@BeforeClass
	public void onStart() 
	{
			String reportPath=System.getProperty("user.dir")+"\\reports\\index.html";
			ExtentSparkReporter report=new ExtentSparkReporter(reportPath);
			report.config().setReportName("Web Automation Results");
			report.config().setDocumentTitle("Test Results");
			extent=new ExtentReports();
			extent.attachReporter(report);
			extent.createTest("Add to Cart Test");

		
	}
	@AfterClass 
	public void onFinish() {
		extent.flush();
	}



}
