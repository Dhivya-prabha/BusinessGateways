package com.bidproc.ui.testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bidproc.ui.pages.HomePage;
import com.bidproc.ui.pages.LoginPage;
import com.framework.testng.api.base.BidProcMethods;
import com.framework.testng.api.base.RetryEngine;

public class CreateBiddingReverseAuction extends BidProcMethods {

	@BeforeTest
	void setReportDetails() {
		testcaseName = "CreateBiddingReverseAuction";
		testDescription = "CreateBidding";
		authors = "Dhivya";
		category = "Smoke";
		excelFileName = "CreateBiddingReverseAuction";
	}

	@Test(retryAnalyzer = RetryEngine.class,dataProvider="fetchData")
	public void createBidding(String formName, String formHeader, String item, String quantity, String unit, String totalUnit,String prodValue, String qntyValue) throws InterruptedException, FileNotFoundException{
		
		  
		new LoginPage() 
		.login("auctioner")
		.clickReverseEAuction()
		.clickPendingLink()
		.clickRecord()
		.clickBidding()
		.enterFormName(formName)
		.enterFormHeader(formHeader)
		.enterItem(item)
		.enterQuantity(quantity)
		.enterUnit(unit)
		.enterTotalUntit(totalUnit)
		.savePreview()
		.selectEndPage()
		.typeProdValue(prodValue)
		.tyepQtyValue(qntyValue)
		.saveForm()
		.clickOK()
		.clicHome();
		
generateProjectAndAuctionIds(); 
		
		new HomePage()
		.moveToEAuction()
		.clickCreateEAuction()
		.enterProjectID(projectId)
		.enterProjectTitle("Automation"+projectId)
		.enterEAuctionReferenceNo(auctionRef)
		.enterEAuctionTitle("Selenium Automation"+auctionRef)
		.enterEAuctionDecription("Automation"+projectId)
		.chooseEAuctionMethod("Reverse")
		.clickbaseCurrency("26")
		.clickAllowedDecimalPlaces("2")
		.enterProductLocation("USA")
		.clickNext()
		.enterStartPrice("15")
		.enterIncrementPrice("2")
		.enterReversePrice("10")
		.chooseExtendedTime("2")
		.chooseExtendedTimeBy("2")
		.enterExtendedTimes("2")
		.clickNext()
		.clickNext()
		.enterBiderEndDate()
		.enterAuctionStartDate()
		.enterAuctionEndDate()
		.clickSave()
		.verifyEAuctionCreated()
		.clickOK();
	}
}
