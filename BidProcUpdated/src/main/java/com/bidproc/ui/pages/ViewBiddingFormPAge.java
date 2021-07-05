package com.bidproc.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;

public class ViewBiddingFormPAge extends BidProcMethods {

	//@FindBy(how = How.ID, using = "governingColumn")
	//private WebElement elem;

	public ViewBiddingFormPAge selectEndPage() {

		pause(3000);

		selectDropDownUsingIndex(locateElement(Locators.ID, "governingColumn"), 2);
		/*
		 * Select selm = new Select(locateElement(Locators.ID, "governingColumn"));
		 * selm.selectByIndex(2);
		 */
		reportStep("The Select option was clicked successfully", "pass");
		pause(3000);
		return this;

	}
	
	
	//@FindBy(how = How.XPATH, using = "//textarea")
	//private WebElement prodvalue;

	public ViewBiddingFormPAge typeProdValue(String value) {
		pause(3000);
		clearAndType((locateElement(Locators.XPATH, "//textarea")), value);
		reportStep("Value entered successfully", "pass");
		
		return this;
	}
	public ViewBiddingFormPAge tyepQtyValue(String value) {
		pause(3000);
		clearAndType((locateElement(Locators.XPATH, "//input[@placeholder='All Numbers']")), value);
		reportStep("Value entered successfully", "pass");
		
		return this;
	}
	

	//@FindBy(how = How.ID, using = "//input[@placeholder='All Numbers']")
	//private WebElement saveform;

	public ViewBiddingFormPAge saveForm() {
		pause(3000);
		clickUsingJs(locateElement(Locators.ID, "btnSubmitForm"));

		return this;
	}

	//@FindBy(how = How.XPATH, using = "//button[text()='OK']")
	//private WebElement clickOK;

	public EAuctionMasterSheetPage clickOK() {
		pause(3000);
		clickUsingJs(locateElement(Locators.XPATH, "//button[text()='OK']"));

		return new EAuctionMasterSheetPage();
	}

}
