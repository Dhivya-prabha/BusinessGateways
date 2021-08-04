package com.bidproc.ui.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bidproc.ui.pages.EAuctionMasterSheetPage;
import com.bidproc.ui.pages.LoginPage;
import com.framework.testng.api.base.BidProcMethods;
import com.framework.testng.api.base.RetryEngine;

public class CancelScheduledFwdEAuction extends BidProcMethods {

	@BeforeTest
	void setReportDetails() {
		testcaseName = "CancelScheduledFwdEAuction";
		testDescription = "CancelScheduledEAuction";
		authors = "Dhivya";
		category = "Smoke";
	}

	@Test(retryAnalyzer = RetryEngine.class)
	public void cancelScheduledEAuction() throws InterruptedException{

		new LoginPage() 
		.login("auctioner")
		.clickScheduled();
		
		new EAuctionMasterSheetPage()
		.clickCanceleAuction()
		.confirmCanceleAuction()
		.enterRemarks();
		
	
	

}


}
