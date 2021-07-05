package com.bidproc.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;

public class EditEAuctionPage extends BidProcMethods {
	
	@FindBy(how = How.ID, using = "txtProjectId")
	private WebElement editProjectID;

	public EditEAuctionPage enterProjectID(String editProjectId) {
		clearAndType(editProjectID, editProjectId);
		reportStep("The ProjectID:" + editProjectId + " edited Successfully at Edit EAuction page", "pass");
		return this;
	}
	
	@FindBy(how = How.ID, using = "txtProjectTitle")
	private WebElement editProjectTitle;

	public EditEAuctionPage enterProjectTitle(String editProjecttitle) {
		clearAndType(editProjectTitle, editProjecttitle);
		reportStep("The projectTitle :" + editProjecttitle + " edited Successfully at Edit EAuction page", "pass");
		return this;
	}
	
	@FindBy(how = How.ID, using = "")
	private WebElement selectExtendTimeReceivedInLast   ;

	public EditEAuctionPage clickbaseCurrency(String timeValue) {
		selectDropDownUsingText(selectExtendTimeReceivedInLast, timeValue);
		reportStep("The ExtendTimeReceivedInLast was clicked  Successfully at Edit EAuction page", "pass");
		return this;
	}
	
	@FindBy(how = How.ID, using = "txtExtendedTimeBy")
	private WebElement selectExtendTimeBy;

	public EditEAuctionPage clickselectExtendTimeBy(String extendTimeValue) {
		selectDropDownUsingText(selectExtendTimeBy, extendTimeValue);
		reportStep("The extend TimeValue was clicked  Successfully at Edit EAuction page", "pass");
		return this;
	}
	
	public EditEAuctionPage clickDateInformation() {
		click(locateElement(Locators.ID, "auctionConfig-date"));
		reportStep("Date Information link has been clicked successfully", "Pass");
		return this;
	}
	
	public EditEAuctionPage clickChangeEndDate() {
		click(locateElement(Locators.ID, "txtAuctionEndDate"));
		pause(4000);
		click(locateElement(Locators.XPATH, "//td[@class='day today']"));
		reportStep("End Date has been clicked successfully", "Pass");
		return this;
	}
	
	public EditEAuctionPage clickUpdate() {
		click(locateElement(Locators.ID, "btnSubmitForm"));
		reportStep("Update button has been clicked successfully", "Pass");
		return this;
	}

}
