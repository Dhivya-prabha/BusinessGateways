package com.bidproc.ui.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;


public class EAuctionMasterSheetPage extends BidProcMethods {


	@FindBy(how = How.XPATH, using = "(//div[text()[normalize-space()='eAuction Notice']]/following::a)[1]")
	private WebElement editButton;

	public EAuctionMasterSheetPage clickedit() { 

		click(editButton);
		reportStep("The Edit Button was clicked successfully at Home page", "pass");
		return this;

	}
	
	public EAuctionMasterSheetPage enterSuspendRemarks() {
		pause(3000);
	
		click(locateElement(Locators.ID,"auctionstopremark"));
		type(locateElement(Locators.ID, "auctionstopremark"), "Due to Covid E Auction Cancelled");
		reportStep("Entered Remarks Successfully at EAuctionMasterSheetPage", "pass");
		pause(5000);
		return this;
	}
	
	public EAuctionMasterSheetPage clickSuspendeAuction() {
		click(locateElement(Locators.PARTIAL_LINKTEXT, "Suspend eAuction"));
		reportStep("Suspend eAuction button has been clicked successfully", "pass");
		return this;
	}
	
	public EAuctionMasterSheetPage clickPostMessage() {
		click(locateElement(Locators.PARTIAL_LINKTEXT, "Post Message"));
		reportStep("Post Message eAuction button has been clicked successfully", "pass");
		return this;
	}

	public EAuctionMasterSheetPage clickCanceleAuction() {
		click(locateElement(Locators.PARTIAL_LINKTEXT, "Cancel eAuction"));
		pause(5000);
		reportStep("CanceleAuction button has been clicked successfully", "pass");
		return this;
	}

	public EAuctionMasterSheetPage confirmCanceleAuction() {
		pause(2000);
		clickUsingJs(locateElement(Locators.ID,"popup_ok"));
		reportStep("Clicked Submit Successfully at ExtendTimeLinePage", "pass");

		return this;
	}

	public EAuctionMasterSheetPage enterRemarks() {
		pause(3000);
		switchToFrame(0);
		click(locateElement(Locators.XPATH,"//body[contains(@class, 'form-control')]"));
		type(locateElement(Locators.XPATH, "//body[contains(@class, 'form-control')]"), "Due to Covid E Auction Cancelled");
		reportStep("Entered Remarks Successfully at EAuctionMasterSheetPage", "pass");
		pause(5000);
		return this;
	}

	//@FindBy (how=How.XPATH, using="//i[@class=' epro icon-pending']")
	//	private WebElement clickCreateBid;

	public CreateEditBidFormPage clickBidding() {
		pause(5000);
		clickUsingJs(locateElement(Locators.XPATH, "(//i[@class=' epro icon-pending'])[1]"));
		//click(clickCreateBid);
		reportStep("The CreateBid was clicked successfully at form page", "pass");
		pause(5000);
		return new CreateEditBidFormPage();
	}



	@FindBy(how = How.XPATH, using = "//i[@class='fas fa fa-home']")
	private WebElement clickHome;

	public HomePage clicHome() { 
		pause(3000);
		clickUsingJs(locateElement(Locators.XPATH, "//i[@class='fas fa fa-home']"));
		reportStep("The Home Button was clicked successfully", "pass");
		return new HomePage();

	}

	public EditEAuctionPage clickEdit() {
		click(locateElement(Locators.XPATH, "(//a[contains(text(),'Edit')])[2]"));
		reportStep("The Edit Button was clicked successfully", "pass");
		return new EditEAuctionPage();
	}

	public EAuctionDocumentsPage clickUploadDocument() {
		click(locateElement(Locators.LINK_TEXT, "Upload Document"));
		reportStep("The Upload Document Button was clicked successfully", "pass");
		return new EAuctionDocumentsPage();
	}

	public CreateFormulaPage clickBiddingFormula() {
		WebElement ele = locateElement(Locators.XPATH, "//div[@id='statusForPublishTender']//a");
		executeTheScript("arguments[0].scrollIntoView();", ele);
		clickUsingJs(locateElement(Locators.XPATH, "//div[@id='statusForPublishTender']//a"));
		reportStep("Create formula has been clicked successfully", "pass");
		return new CreateFormulaPage();
	}

	/*
	 * public ValidateBidders clickValidateBidders() {
	 * click(locateElement(Locators.ID, "mapBidderWithTermAndCondition"));
	 * reportStep("Validate Bidders has been clicked successfully", "pass"); return
	 * new ValidateBiddersPage();
	 * 
	 * }
	 */

	public EAuctionMasterSheetPage getAuctionRefNum() {
		auctionRef = getElementText(locateElement(Locators.XPATH, "//span[contains(text(),'eAuction Reference No')]/following-sibling::div"));
		prop.setProperty("auctionReferNum", auctionRef);
		reportStep("Read the eAuction ID", "pass");
		return this;
	}

	public EAuctionMasterSheetPage clickInterestToParticipate() {
		click(locateElement(Locators.XPATH, "//button[text()[normalize-space()='Interested to Participate in This eAuction']]"));
		reportStep("Validate Bidders has been clicked successfully", "pass");
		return this;
	}

	public EAuctionMasterSheetPage clickCheckBox() {
		click(locateElement(Locators.XPATH, "//label[@for='chkTerms']"));
		reportStep("Validate Bidders has been clicked successfully", "pass");
		return this;
	}

	public EAuctionMasterSheetPage clickAgree() {
		click(locateElement(Locators.ID,"btnIAgree"));
		reportStep("Clicked successfully on Agree", "pass");
		return this;
	}

	public EAuctionMasterSheetPage clickYes() {
		click(locateElement(Locators.XPATH,"(//input[@id='popup_ok'])[1]"));
		reportStep("Clicked successfully on Agree", "pass");
		return this;
	}

	public EAuctionMasterSheetPage clickOk() {
		click(locateElement(Locators.XPATH, "//button[text()='OK']"));
		reportStep("Clicked successfully on Agree", "pass");
		return this;
	}

	public EAuctionMasterSheetPage verifyEAuctionDescription() {
		verifyDisplayed(locateElement(Locators.XPATH, "(//div[contains(text(),'eAuction description')]/following-sibling::div//div[1]/div)[1]"));
		reportStep("Successfully verified E Auction Description", "pass");
		return this;
	}

	public EAuctionMasterSheetPage verifyBidderType() {
		verifyDisplayed(locateElement(Locators.XPATH, "//div[contains(text(),'Bidder Type')]/following-sibling::div"));
		reportStep("Successfully verified E Auction Description", "pass");
		return this;
	}

	public EAuctionMasterSheetPage verifyMultipleLineItems() {
		verifyDisplayed(locateElement(Locators.XPATH, "//div[text()='Multiple Line-Items']/following-sibling::div[contains(text(),'Applicable')]"));
		reportStep("Successfully verified Multiple Line Items", "pass");
		return this;
	}

	public EAuctionMasterSheetPage verifyResultSharing() {
		verifyDisplayed(locateElement(Locators.XPATH, "//div[text()='Result Sharing With Bidder']/following-sibling::div"));
		reportStep("Successfully verified Result Sharing", "pass");
		return this;
	}


	public DateInformation clickReadyToPublish() {
		click(locateElement(Locators.LINK_TEXT, "Ready to Publish"));
		reportStep("Successfully clicked Ready to Publish", "pass");
		return new DateInformation();
	}


	public DateInformation clickYes2() {
		click(locateElement(Locators.XPATH, "//button[text()='Yes']"));
		reportStep("Successfully clicked Ready to Publish", "pass");
		return new DateInformation();
	}

	public CreateBiddingFormPage clickCreateBiddingForm() {
		click(locateElement(Locators.XPATH, "//div[@class='form-group padd-center']//a"));
		reportStep("Succrssfully clicked on Create Bidding Form", "Pass");
		return new CreateBiddingFormPage();
	}

	public EAuctionMasterSheetPage enterMessage() {
		pause(3000);
		switchToFrame(0);
		click(locateElement(Locators.XPATH,"// body[contains(@class,'form-control')]"));
		type(locateElement(Locators.XPATH, "// body[contains(@class,'form-control')]"), "Bidding Started");
		defaultContent();

		reportStep("Entered Remarks Successfully at EAuctionMasterSheetPage", "pass");
		pause(5000);
		return this;
	}

	public EAuctionMasterSheetPage postMessage() {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,500)");
		click(locateElement(Locators.XPATH, "//button[text()='Post']"));
		reportStep("Post Button clicked successfully", "pass");
		return this;
	}

	public EAuctionMasterSheetPage confirmPost() {

		click(locateElement(Locators.XPATH, "//button[text()='Yes']"));
		reportStep("Message Posted successfully", "pass");
		return this;

	}
	
	public EAuctionMasterSheetPage clickOkPromptBox() {

		click(locateElement(Locators.XPATH, "//button[text()='OK']"));
		reportStep("OK Button clicked successfully", "pass");
		return this;

	}




}
