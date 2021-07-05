package com.bidproc.ui.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;

public class LoginPage extends BidProcMethods {
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.ID, using = "j_username")
	private WebElement enterEmailID;

	public LoginPage typeUserName(String username) {
		clearAndType(enterEmailID, username);
		reportStep("The UserName :" + username + " entered Successfully at login page", "pass");
		return this;
	}

	@FindBy(how = How.ID, using = "j_password")
	private WebElement enterPassword;

	public LoginPage typePassword(String password) {
		clearAndType(enterPassword, password);
		reportStep("The Password :" + password + " entered Successfully at login page", "pass");
		return this;
	}

	@FindBy(how = How.NAME, using = "submit")
	private WebElement submit;

	public HomePage clickSubmit() {
		click(submit);
		reportStep("The submit button was clicked successfully at login page", "pass");
		return new HomePage();
	}

	public HomePage login(String userType) {

		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
		} catch (Exception e) {
		}
		if (userType.equalsIgnoreCase("auctioner")) {
			return typeUserName(prop.getProperty("username")).typePassword(prop.getProperty("password")).clickSubmit();
		} else if (userType.equalsIgnoreCase("bidder")) {
			return typeUserName(prop.getProperty("userNameBidder")).typePassword(prop.getProperty("passwordBidder"))
					.clickSubmit();
		}

		return new HomePage();
	}

	public EAuctionMasterSheetPage clickScheduledEAuction() {
		pause(3000);
		clickUsingJs(locateElement(Locators.XPATH, "//th[text()='eAuction ID']/following::a[1]"));
		switchToWindow(1);
		reportStep("Successfully clicked on the Scheduled EAuction", "");
		return new EAuctionMasterSheetPage();
	}

}
