package com.bidproc.ui.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;

public class HomePage extends BidProcMethods {
	public HomePage() {
		//		pause(5000);
		PageFactory.initElements(getDriver(), this);
	}

	@Override
	public void executeTheScript(String js, WebElement ele) {
		// TODO Auto-generated method stub
		super.executeTheScript(js, ele);
	}

	@FindBy(how = How.XPATH, using = "(//i[@class='epro icon-RFX'])[1]")
	private WebElement eAuction;

	public HomePage moveToEAuction() {
		pause(3000);
		hoverAndClick(eAuction);
		reportStep("The EAuction button was mouseHovered successfully at Home page", "pass");
		return this;
	}


	@FindBy(how = How.XPATH, using = "//a[text()[normalize-space()='Create eAuction']]")
	private WebElement createEAuction;

	public EAuctionPage clickCreateEAuction() {
		pause(2000);
		clickUsingJs(createEAuction);
		reportStep("The CreatEAuction button was clicked successfully at Home page", "pass");
		return new EAuctionPage();

	}

	@FindBy(how = How.XPATH, using = "//a[text()='eAuction List']")
	private WebElement eAuctionList;

	public HomePage clickeAuctionList() {
		//pause(2000);
		click(eAuctionList);
		reportStep("The EAuctionList was clicked successfully at Home page", "pass");
		return this;

	}

	@FindBy(how = How.LINK_TEXT, using = "Forward eAuction List")
	private WebElement forwardEAuctionList;

	public ForwardEAuctionListPage clickForwardEAuctionList() {
		pause(2000);
		clickUsingJs(forwardEAuctionList);
		reportStep("The ForwardEAuctionList was clicked successfully at Home page", "pass");
		return new ForwardEAuctionListPage();

	}


	@FindBy(how = How.LINK_TEXT, using = "Reverse eAuction List")
	private WebElement reverseEAuctionList;

	public ReverseEAuctionListPage clickReverseEAuctionList() {
		pause(2000);
		clickUsingJs(reverseEAuctionList);
		reportStep("The ReverseEAuctionList was clicked successfully at Home page", "pass");
		return new ReverseEAuctionListPage();

	}



	@FindBy(how = How.ID, using = "forwardActive")
	private WebElement forwardEAuction;

	public HomePage clickforwardEAuction() {

		click(forwardEAuction);
		reportStep("The Forward EAuction button was clicked successfully at home page", "pass");
		return this;

	}

	@FindBy(how = How.ID, using = "reverseActive")
	private WebElement reverseEAuction;

	public HomePage clickReverseEAuction() {

		click(reverseEAuction);
		reportStep("The Reverse EAuction button was clicked successfully at Home page", "pass");
		return this;

	}

	public ForwardEAuctionListPage clickPendingLink() {
		click(locateElement(Locators.XPATH, "//a[@class='countListPending linkFytr']"));
		reportStep("Successfully clicked on the Pending link", "");
		return new ForwardEAuctionListPage();
	}

	@FindBy(how = How.XPATH, using = "//h5[text()='Total Gains (OMR)']")
	private WebElement totalGains ;


	public HomePage getTotalGainsText() {
		pause(3000);
		getElementText(totalGains);		
		reportStep("The totalGains text in Forward EAuction button was printed successfully at Home page", "pass");
		return this;

	}


	@FindBy(how = How.XPATH, using = "//h5[text()='Total Savings (OMR)']")
	private WebElement totalSavings ;


	public HomePage getTotalSavingsText() {
		pause(3000);
		getElementText(totalSavings);		
		reportStep("The TotalSavings text in Reverse EAuction button was printed successfully at Home page", "pass");
		return this;

	}

	@FindBy(how = How.XPATH, using = "//a[@class='countListLive linkFytr']/following::a[@class='countListPending linkFytr']")
	private WebElement pendingEAuction;

	public ForwardEAuctionListPage clickPendingEAuction() {
		pause(4000);
		clickUsingJs(pendingEAuction);
		reportStep("The Pending EAuction button was clicked successfully at Home page", "pass");
		return new ForwardEAuctionListPage();

	}

	public ForwardEAuctionListPage clickPending() {
		pause(3000);
		click(locateElement(Locators.XPATH, "//a[@class='countListPending linkFytr']"));
		reportStep("Successfully clicked on the Pending link", "pass");
		return new ForwardEAuctionListPage();
	}
	
	public ForwardEAuctionListPage clickLive() {
		click(locateElement(Locators.XPATH, "//span[@class='ytr']"));
		reportStep("Successfully clicked on the Link link", "pass");
		return new ForwardEAuctionListPage();
	}

	public HomePage clickScheduled() {
		click(locateElement(Locators.XPATH, "(//span[@id='scheduled'])[1]"));
		reportStep("Successfully clicked on the Scheduled link", "pass");
		//return new ForwardEAuctionListPage();
		return this;
	}

//	Homepage Bidder element
	/*
	 * public ValidateBiddersPage clickBidderResponse() throws FileNotFoundException
	 * { String auctionRefProp = getDataInPropertyFile();
	 * click(locateElement(Locators.XPATH,
	 * "//a[contains(text(),'Automation"+auctionRefProp+"')]"));
	 * reportStep("Successfully clicked on the Scheduled bidder response link",
	 * "pass"); return new ValidateBiddersPage(); }
	 */
/*	public EAuctionMasterSheetPage clickBidderResponse2() {
//		click(locateElement(Locators.XPATH, "//a[@title='Selenium Automation"+auctionRef+"']"));
		click(locateElement(Locators.XPATH, "//a[@title='Selenium Automation']"));
		reportStep("Successfully clicked on the Scheduled link", "pass");
		return new EAuctionMasterSheetPage();
	}*/
	
	public EAuctionMasterSheetPage clickBidderResponse2() throws FileNotFoundException {
		pause(5000);
		String auctionRefProp = getDataInPropertyFile();
	//	getDriver().navigate().refresh();
		
		System.out.println("auctionRef:" + auctionRefProp );
		System.out.println("Selenium Automation"+auctionRefProp);
		click(locateElement(Locators.XPATH, "//a[contains(text(),'Automation"+auctionRefProp+"')]"));
		reportStep("Successfully clicked on the first record link", "pass");
		return new EAuctionMasterSheetPage();		
	}
	
	public ForwardEAuctionListPage clickOnScheduled() {
		click(locateElement(Locators.XPATH, "//span[@id='scheduled']"));
		reportStep("Successfully clicked on Scheduled", "Pass");
		return new ForwardEAuctionListPage();
	}
	
	


}
