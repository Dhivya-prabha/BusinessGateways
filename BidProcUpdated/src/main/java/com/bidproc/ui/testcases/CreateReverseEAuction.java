package com.bidproc.ui.testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bidproc.ui.pages.HomePage;
import com.bidproc.ui.pages.LoginPage;
import com.framework.testng.api.base.BidProcMethods;
import com.framework.testng.api.base.RetryEngine;

public class CreateReverseEAuction extends BidProcMethods {

	@BeforeTest
	void setReportDetails() {
		testcaseName = "Create Reverse eAuction";
		testDescription = "Create Reverse eAuction";
		authors = "Kiruthivasan";
		category = "Smoke";
		excelFileName = "CreateReverseEAuction";
	}

	@Test(retryAnalyzer = RetryEngine.class,dataProvider = "fetchData")
	public void createReverseEAution(String pTitle, String aTitle,String desc,String method, 
			 String currency,String decPlaces, String location,
			 String startPrice,String incPrice,String revPrice,
			 String extntTime, String extntTimeBy, String extendedTime) throws InterruptedException, FileNotFoundException {
		
		generateProjectAndAuctionIds();
	
		new LoginPage()
		.login("auctioner")
		.moveToEAuction()
		.clickCreateEAuction()
		.enterProjectID(projectId)
		.enterProjectTitle(pTitle+projectId)
		.enterEAuctionReferenceNo(auctionRef)
		.enterEAuctionTitle(aTitle+auctionRef)
		.enterEAuctionDecription(desc+projectId)
		.chooseEAuctionMethod(method)
		.clickbaseCurrency(currency)
		.clickAllowedDecimalPlaces(decPlaces)
		.enterProductLocation(location)
		.clickNext()
		.enterStartPrice(startPrice)
		.enterIncrementPrice(incPrice)
		.enterReversePrice(revPrice)
		.chooseExtendedTime(extntTime)
		.chooseExtendedTimeBy(extntTimeBy)
		.enterExtendedTimes(extendedTime)
		.clickNext()
		.clickNext()
		.enterBiderEndDate()
		.enterAuctionStartDate()
		.enterAuctionEndDate()
		.clickSave()
		.verifyEAuctionCreated();
		
	}
}
