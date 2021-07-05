
package com.bidproc.ui.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;

public class ForwardEAuctionListPage extends BidProcMethods {
	public ForwardEAuctionListPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public EAuctionMasterSheetPage clickEAuctionproduct() {
		pause(2000);
		click(locateElement(Locators.XPATH, "//h2[@class='ten-title updatedhead']"));
		reportStep("The first product has been clicked", "pass");
		return new EAuctionMasterSheetPage();
	}
	
	public ForwardEAuctionListPage clickSearch() {

		clickUsingJs(locateElement(Locators.XPATH, "//i[@class='fa fa-search']"));
		reportStep("The Search button clicked successfully at Forward EAuction list page", "pass");
		return this;

	}

	@FindBy(how = How.ID, using = "searchString")
	private WebElement eleSearch;

	public ForwardEAuctionListPage enterSearchValue(String data) {
		moveToElement(eleSearch);
		clearAndType(eleSearch,data);
		reportStep("The eAuction Reference"+data+" was entered successfully at Forward EAuction list page", "pass");
		return this;

	}

	@FindBy(how = How.ID, using = "submitForSearch")
	private WebElement submitSearch;

	public ForwardEAuctionListPage ClickSearchButton() {
		moveToElement(submitSearch);
		clickUsingJs(submitSearch);
		reportStep("The Search button was clicked successfully at Forward eAuction List page", "pass");
		return this;

	}


	public ForwardEAuctionListPage verifyForwardEAuctionInList(String value) {
		pause(4000);
		verifyDisplayed(locateElement(Locators.LINK_TEXT, value));
		
		reportStep("Forward eAuction is displayed successfully in Forward list page", "pass");
		return this;

	}

	//@FindBy(how=How.XPATH, using="(//h2[@class='ten-title updatedhead'])/a[1]")
	//private WebElement selectRecord;

	public EAuctionMasterSheetPage clickRecord() throws FileNotFoundException {
		pause(5000);
		String auctionRefProp = getDataInPropertyFile();
	//	getDriver().navigate().refresh();
		
		System.out.println("auctionRef:" + auctionRefProp );
		System.out.println("Selenium Automation"+auctionRefProp);
		click(locateElement(Locators.XPATH, "//a[contains(text(),'Automation"+auctionRefProp+"')]"));
		reportStep("Successfully clicked on the first record link", "pass");
		return new EAuctionMasterSheetPage();		
	}
	
	

	@FindBy(xpath = "(//a[@class='pull-left awrdtabgs'])[1]") WebElement firstResult;
	public EAuctionMasterSheetPage clickEAuctionFirstRecord() {
		pause(5000);
		getDriver().navigate().refresh();
		//		click(locateElement(Locators.XPATH, "(//a[@class='pull-left awrdtabgs'])[1]"));
		click(firstResult);
		reportStep("The first record has been clicked", "pass");
		return new EAuctionMasterSheetPage();
	}


	public EAuctionMasterSheetPage clickScheduledFirstResult() {
		click(locateElement(Locators.XPATH, "(//h2[@class='ten-title updatedhead'])[1]"));
		reportStep("The first schedulted record has been clicked", "pass");
		return new EAuctionMasterSheetPage();
	}









}
