package com.framework.testng.api.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.internal.IResultListener2;

import com.aventstack.extentreports.Status;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Browser;
import com.framework.selenium.api.design.Element;
import com.framework.utils.DataLibrary;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class BidProcMethods extends SeleniumBase implements IResultListener2 {

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}
	
	public Properties prop;

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
		startApp(prop.getProperty("browser"), Boolean.valueOf(prop.getProperty("headless")), prop.getProperty("url"));
		setNode();

	}

	
	  @AfterMethod(alwaysRun = true) 
	  public void afterMethod() { 
		  close(); 
		  }
	 

	
	/*
	 * @AfterSuite(alwaysRun = true) public void afterSuite() throws IOException {
	 * Runtime.getRuntime().exec("TASKKILL /F /IM chromedriver.exe"); }
	 */

	@Override
	public void onTestSkipped(ITestResult result) {
		if (getTestStatus() != Status.SKIP) {
			if (getTestStatus() != Status.FAIL) {
				setNode();
				reportStep("", "skipped");
			}
		}

	}
	
	
}
