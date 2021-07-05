package com.bidproc.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;

public class EAuctionProcessPage extends BidProcMethods {

	public EAuctionProcessPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public EAuctionProcessPage selectMultipleItems(String applicable) {
		selectDropDownUsingText(locateElement(Locators.ID, "selIsPartialFillingAllowed"), applicable);
		reportStep("The eAuctionDescription :" + applicable + " entered Successfully at EAuction page", "pass");
		return this;
	}
	
	@FindBy(how = How.ID, using = "txtStartPrice")
	private WebElement startPrice;

	public EAuctionProcessPage enterStartPrice(String price) {
		clearAndType(startPrice, price);
		reportStep("The Start Price :" + price + " entered Successfully at EAuction Process page", "pass");
		return this;
	}
	
	@FindBy(how = How.ID, using = "txtIncrementDecrementVal")
	private WebElement incrementPrice;

	public EAuctionProcessPage enterIncrementPrice(String price) {
		clearAndType(incrementPrice, price);
		reportStep("The Increment Price :" + price + " entered Successfully at EAuction Process page", "pass");
		return this;
	}

	@FindBy(how = How.ID, using = "txtAuctionRevPrice")
	private WebElement revPrice;

	public EAuctionProcessPage enterReversePrice(String price) {
		clearAndType(revPrice, price);
		reportStep("The Reverse Price :" + price + " entered Successfully at EAuction Process page", "pass");
		return this;
	}
	
	@FindBy(how = How.ID, using = "txtExtendedTime")
	private WebElement selectExtendedTime ;

	public EAuctionProcessPage chooseExtendedTime(String time) {
		selectDropDownUsingText(selectExtendedTime, time);
		reportStep("The extended time "+time+" was selected successfully at EAuction process page", "pass");
		return this;
	}
	
	@FindBy(how = How.ID, using = "txtExtendedTimeBy")
	private WebElement selectExtendedTimeBy ;

	public EAuctionProcessPage chooseExtendedTimeBy(String time) {
		selectDropDownUsingText(selectExtendedTimeBy, time);
		reportStep("The extended time By "+time+" was selected successfully at EAuction process page", "pass");
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "txtNoOfExtension")
	private WebElement extendedTimes;

	public EAuctionProcessPage enterExtendedTimes(String times) {
		clearAndType(extendedTimes, times);
		reportStep("The extended times :" + times + " entered Successfully at EAuction Process page", "pass");
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//a[@id='configAuctionNext']")
	private WebElement processNext ;

	public PaymentInformationPage clickNext() {
		clickUsingJs(processNext);
		reportStep("The Next was clicked  Successfully at EAuction Process page", "pass");
		return new PaymentInformationPage();
	}
	

}
