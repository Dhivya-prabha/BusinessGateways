
package com.bidproc.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;

public class ReverseEAuctionListPage extends BidProcMethods {
	public ReverseEAuctionListPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public EAuctionMasterSheetPage clickEAuctionproduct() {
		pause(2000);
		click(locateElement(Locators.XPATH, "//h2[@class='ten-title updatedhead']"));
		reportStep("The first product has been clicked", "pass");
		
		return new EAuctionMasterSheetPage();

	}
	
	@FindBy(how = How.ID, using = "searchString")
	private WebElement eleSearch;
	
	public ReverseEAuctionListPage enterSearchValue(String data) {
		moveToElement(eleSearch);
		clearAndType(eleSearch,data);
		reportStep("The eAuction Reference"+data+" was entered successfully at Reverse EAuction list page", "pass");
		return this;
				
	}
	
	@FindBy(how = How.ID, using = "submitForSearch")
	private WebElement submitSearch;
	
	public ReverseEAuctionListPage ClickSearchButton() {
		moveToElement(submitSearch);
		clickUsingJs(submitSearch);
		reportStep("The Search button was clicked successfully at Reverse eAuction List page", "pass");
		return this;
				
	}
	
public ReverseEAuctionListPage clickSearch() {
		
		clickUsingJs(locateElement(Locators.XPATH, "//i[@class='fa fa-search']"));
		reportStep("The Search button clicked successfully at Reverse EAuction list page", "pass");
		return this;
				
	}
	public ReverseEAuctionListPage verifyReverseEAuctionInList(String value) {
		pause(4000);
		verifyDisplayed(locateElement(Locators.LINK_TEXT, value));
		reportStep("Reverse eAuction is displayed successfully in Reverse eAuction list page", "pass");
		return this;

	}

}
