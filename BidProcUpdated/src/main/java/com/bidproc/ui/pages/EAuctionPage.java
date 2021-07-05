package com.bidproc.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;

public class EAuctionPage extends BidProcMethods {

	public EAuctionPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.ID, using = "txtProjectId")
	private WebElement projectID;

	public EAuctionPage enterProjectID(String projectId) {
		clearAndType(projectID, projectId);
		
		System.out.println(projectId);
		
		reportStep("The ProjectID:" + projectId + " entered Successfully at EAuction page", "pass");
		return this;
	}

	@FindBy(how = How.ID, using = "txtProjectTitle")
	private WebElement projectTitle;

	public EAuctionPage enterProjectTitle(String projecttitle) {
		clearAndType(projectTitle, projecttitle);
		reportStep("The projectTitle :" + projecttitle + " entered Successfully at EAuction page", "pass");
		return this;
	}

	@FindBy(how = How.ID, using = "txtAuctionNo")
	private WebElement eAuctionReferenveNo;

	public EAuctionPage enterEAuctionReferenceNo(String referenceNo) {
		clearAndType(eAuctionReferenveNo, referenceNo);
		
		System.out.println(referenceNo);
		
		reportStep("The eAuctionReferenveNo :" + referenceNo + " entered Successfully at EAuction page", "pass");
		return this;
	}

	@FindBy(how = How.ID, using = "txtBriefScope")
	private WebElement eAuctionTitle;

	public EAuctionPage enterEAuctionTitle(String eAuctiontitle) {
		clearAndType(eAuctionTitle, eAuctiontitle);
		reportStep("The eAuctionTitle :" + eAuctiontitle + " entered Successfully at EAuction page", "pass");
		return this;
	}

	@FindBy(how = How.ID, using = "txtauctiondetails")
	private WebElement eAuctionDescription;

	public EAuctionPage enterEAuctionDecription(String eAuctionDeatils) {
		clearAndType(eAuctionDescription, eAuctionDeatils);
		reportStep("The eAuctionDescription :" + eAuctionDeatils + " entered Successfully at EAuction page", "pass");
		return this;
	}
	
	public EAuctionPage selecteAuctionVariant(String eAuctionVariant) {
		selectDropDownUsingText(locateElement(Locators.ID, "rdoAuctionVariant"), eAuctionVariant);
		reportStep("The eAuctionDescription :" + eAuctionVariant + " entered Successfully at EAuction page", "pass");
		return this;
	}
	

	
	
	@FindBy(how = How.XPATH, using = "//input[@name='goodstype'] ")
	private WebElement typesOfGoods ;

	public EAuctionPage clickTypesOfGood() {
		click(typesOfGoods);
		reportStep("The Types of Good was clicked  Successfully at EAuction page", "pass");
		return this;
	}
	
	@FindBy(how = How.ID, using = "optBaseCurrency")
	private WebElement selectBaseCurrency  ;

	public EAuctionPage clickbaseCurrency(String currencyValue) {
		selectDropDownUsingValue(selectBaseCurrency, currencyValue);
		reportStep("The USDCurrency was clicked  Successfully at EAuction page", "pass");
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "optDecimalVal")
	private WebElement allowedDecimalPlaces  ;

	public EAuctionPage clickAllowedDecimalPlaces(String decimalValue) {
		selectDropDownUsingText(allowedDecimalPlaces, decimalValue);
		reportStep("The allowedDecimalPlaces was clicked  Successfully at EAuction page", "pass");
		return this;
	} 
		
	
	@FindBy(how = How.ID, using = "txtProductLoc")
	private WebElement productLocation;

	public EAuctionPage enterProductLocation(String productlocation) {
		clearAndType(productLocation, productlocation);
		reportStep("The productLocation :" + productlocation + " entered Successfully at EAuction page", "pass");
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "txtDocumentEndDate")
	private WebElement bidderResponseDateTime;

	public EAuctionPage enterbidderResponseDateTime(String responseDateTime) {

		chooseDate(bidderResponseDateTime, responseDateTime);
		
		reportStep("The productLocation :" + responseDateTime + " entered Successfully at EAuction page", "pass");
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "txtAuctionStartDate")
	private WebElement eAuctionStartDateTime;

	public EAuctionPage enterEAuctionStartDateTime(String startDateTime) {
		chooseDate(eAuctionStartDateTime, startDateTime);
		reportStep("The EAuctionStartDateTime :" + startDateTime + " entered Successfully at EAuction page", "pass");
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "txtAuctionEndDate")
	private WebElement eAuctionEndDateTime;

	public EAuctionPage enterEAuctionEndDateTime(String endDateTime) {
		chooseDate(eAuctionEndDateTime, endDateTime);
		reportStep("The EAuctionEndDateTime :" + endDateTime + " entered Successfully at EAuction page", "pass");
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='Cancel']]/following-sibling::button")
	private WebElement SaveAsDraft ;

	public EAuctionPage clickSaveAsDraft() {
		click(SaveAsDraft);
		reportStep("The SaveAsDraft was clicked  Successfully at EAuction page", "pass");
		return this;
	}
	
	@FindBy(how = How.ID, using = "rdoAuctionMethod")
	private WebElement selectEAuctionMethod ;

	public EAuctionPage chooseEAuctionMethod(String eAuctionMethod) {
		selectDropDownUsingText(selectEAuctionMethod, eAuctionMethod);
		reportStep("The eAuctionMethod was clicked  Successfully at EAuction page", "pass");
		return this;
	}
	
	
	@FindBy(how = How.XPATH, using = "//a[@id='auctionBasicDetailsNext']")
	private WebElement basicNext ;

	public EAuctionProcessPage clickNext() {
		clickUsingJs(basicNext);
		reportStep("The Next was clicked  Successfully at EAuction page", "pass");
		return new EAuctionProcessPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
