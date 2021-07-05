package com.framework.selenium.api.base;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverInstance  {

	private static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<RemoteWebDriver>();
	private static final ThreadLocal<WebDriverWait> wait = new  ThreadLocal<WebDriverWait>();

	public void setWait() {
		wait.set(new WebDriverWait(getDriver(), 30));
	}

	public WebDriverWait getWait() {
		return wait.get();
	}

	public void setDriver(String browser, boolean headless) {		
		switch (browser) {
		case "chrome":
		//	LoggingPreferences logPreferences = new LoggingPreferences();
		//	logPreferences.enable(LogType.BROWSER, Level.ALL);
		//	Map<String, Object> prefs = new HashMap<String, Object>();
		//	prefs.put("download.default_directory",  System.getProperty("user.dir")+ File.separator + "download");
			ChromeOptions options = new ChromeOptions();
		//	options.setExperimentalOption("prefs", prefs);
			options.setHeadless(headless);
			options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
	//		options.setCapability(CapabilityType.LOGGING_PREFS, logPreferences);
			options.setPageLoadStrategy(PageLoadStrategy.NONE); 
			options.addArguments("--start-maximized"); 
			options.addArguments("--test-type"); 
			options.addArguments("--no-sandbox");
			options.addArguments("--ignore-certificate-errors");
			options.addArguments("--disable-popup-blocking"); 
			options.addArguments("--disable-default-apps"); 
			options.addArguments("--disable-extensions-file-access-check");
			options.addArguments("--incognito");
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-gpu");
			remoteWebdriver.set(new ChromeDriver(options));
			break;
		case "firefox":
			FirefoxOptions firefoxoptions = new FirefoxOptions();
			firefoxoptions.setHeadless(headless);
			remoteWebdriver.set(new FirefoxDriver(firefoxoptions));
			break;
		case "ie":
			remoteWebdriver.set(new InternetExplorerDriver());
		default:
			break;
		}
	}
	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}
	
}
