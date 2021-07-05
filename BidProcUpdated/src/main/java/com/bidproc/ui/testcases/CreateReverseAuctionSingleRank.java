package com.bidproc.ui.testcases;

import java.io.FileNotFoundException;
import java.time.LocalDate;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bidproc.ui.pages.HomePage;
import com.bidproc.ui.pages.LoginPage;
import com.framework.testng.api.base.BidProcMethods;
import com.framework.testng.api.base.RetryEngine;

public class CreateReverseAuctionSingleRank extends BidProcMethods  {
	
	@BeforeTest
	void setReportDetails() {
		testcaseName = "Create New reverse eAuction - Single Rank";
		testDescription = "Create New reverse eAuction - Single Rank";
		authors = "Kiruthivasan";
		category = "Smoke";
		excelFileName = "CreateReverseAuctionSingleRank";
	}

	@Test(retryAnalyzer = RetryEngine.class)
	void createAndVerifyReverseAuctionSingleRank(String pTitle, String aTitle,String desc,String variant,String method, 
			 String currency,String decPlaces, String location,String multi,
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
		.selecteAuctionVariant(variant)
		.chooseEAuctionMethod(method)
		.clickTypesOfGood()
		.clickbaseCurrency(currency)
		.clickAllowedDecimalPlaces(decPlaces)
		.enterProductLocation(location)
		.clickNext()
    	.selectMultipleItems(multi)
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
		.verifyEAuctionCreated()
		.clickOK()
		.moveToEAuction()
		.clickeAuctionList()
		.clickReverseEAuctionList()
		.clickSearch()
		.enterSearchValue(auctionRef)
		.ClickSearchButton()
		.verifyReverseEAuctionInList("Selenium Automation"+auctionRef);
		
		
		

}

}
