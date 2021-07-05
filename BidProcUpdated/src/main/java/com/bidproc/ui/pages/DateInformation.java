package com.bidproc.ui.pages;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;

public class DateInformation extends BidProcMethods {
	
	int today = 0;
	
	public DateInformation() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.ID, using = "txtDocumentEndDate")
	private WebElement biderEndDate;
	public DateInformation enterBiderEndDate() {
		click(biderEndDate);
		pause(2000);
		WebElement ele = locateElement(Locators.XPATH,"//td[contains(@class,'today')]");
		String currentDate = getElementText(ele);
		today = Integer.parseInt(currentDate);
		
		WebElement locateElement = locateElement(Locators.XPATH, "//td[contains(@class,'today')]/following::td[1]");
		click(locateElement);
		
		reportStep("The Bider End date entered Successfully at Date Information page", "pass");
		return this;
	}
	
	//@FindBy(how = How.ID, using = "txtAuctionStartDate")
	// private WebElement auctionStartDate;

	public DateInformation enterAuctionStartDate() {
		click(Locators.ID, "txtAuctionStartDate");
		pause(2000);
		
		WebElement eleStartDate = locateElement(Locators.XPATH,"//td[contains(@class,'today')]/following::td[2]");
	//	String attribute = getAttribute(eleStartDate, "class");
		click(eleStartDate);
		
		
		pause(1000);
	
		click(Locators.XPATH, "(//div[@id='#auction-paymentdtls'])[2]");
		
		reportStep("The Auction Start date entered Successfully at Date Information page", "pass");
		return this;
	}
	
//	@FindBy(how = How.ID, using = "txtAuctionEndDate")
	//private WebElement auctionEndDate;

	public DateInformation enterAuctionEndDate() {
		click(Locators.ID, "txtAuctionEndDate");
		pause(2000);
		WebElement eleEndDate = locateElement(Locators.XPATH,"//td[contains(@class,'today')]/following::td[3]");
	//	String attribute = getAttribute(eleEndDate, "class");
		
		click(eleEndDate);
	
		reportStep("The Auction End date entered Successfully at Date Information page", "pass");
		return this;
	}
	
	public DateInformation clickSave() {	
		clickUsingJs(locateElement(Locators.ID, "btnSubmitForm"));
		reportStep("The Save was clicked Successfully at Date Information page", "pass");
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//p[text()='eAuction created successfully']")
	private WebElement successMsg ;
	
	public DateInformation verifyEAuctionCreated() {
		verifyDisplayed(successMsg);
		reportStep("eAuction created successfullye", "pass");
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='OK']")
	private WebElement eleOK ;

	public HomePage clickOK() {
		click(eleOK);
		reportStep("The OK was clicked Successfully at Date Information page", "pass");
		return new HomePage(); 
	}

	@FindBy(how = How.XPATH, using = "(//button[text()='Save as Draft'])[last()]")
	private WebElement SaveAsDraft ;

	public DateInformation clickSaveAsDraft() {
		click(SaveAsDraft);
		reportStep("The SaveAsDraft was clicked  Successfully at Data Information page", "pass");
		return this;
	}
	
	public DateInformation verifyMandatoryFieldsAlert() {
		verifyDisplayed(locateElement(Locators.XPATH, "//p[text()='Fill the Mandatory fields: ']"));
		reportStep("Mandatory Fields Alert is displayed successfully", "pass");
		return this;

	}
	
	public EAuctionMasterSheetPage typeRemarks() {
		type(locateElement(Locators.ID, "rtfRemarks"), "Remarks for transaction");
		reportStep("Successfully clicked Ready to Publish", "pass");
		return new EAuctionMasterSheetPage();
	}
	
	public DateInformation clickYes2() {
		click(locateElement(Locators.XPATH, "//button[text()='Yes']"));
		reportStep("Successfully clicked Ready to Publish", "pass");
		return new DateInformation();
	}
	
	
}
