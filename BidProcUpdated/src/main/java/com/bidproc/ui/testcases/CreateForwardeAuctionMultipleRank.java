package com.bidproc.ui.testcases;

import java.io.FileNotFoundException;
import java.time.LocalDate;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bidproc.ui.pages.HomePage;
import com.bidproc.ui.pages.LoginPage;
import com.framework.testng.api.base.BidProcMethods;
import com.framework.testng.api.base.RetryEngine;

public class CreateForwardeAuctionMultipleRank extends BidProcMethods  {
	
	@BeforeTest
	void setReportDetails() {
		testcaseName = "Create New Forward eAuction - Multiple Rank";
		testDescription = "Create New Forward eAuction - Multiple Rank";
		authors = "Kiruthivasan";
		category = "Smoke";
		excelFileName = "CreateForwardeAuctionMultipleRank";
	}

	@Test(retryAnalyzer = RetryEngine.class,dataProvider = "fetchData")
	void createAndVerifyForwardeAuctionMultipleRank(String pTitle, String aTitle,String desc,String variant,String method, 
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
		.clickForwardEAuctionList()
		.clickSearch()
		.enterSearchValue(auctionRef)
		.ClickSearchButton()
		.verifyForwardEAuctionInList(aTitle+auctionRef);

}

}
