package com.bidproc.ui.testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bidproc.ui.pages.HomePage;
import com.bidproc.ui.pages.LoginPage;
import com.framework.testng.api.base.BidProcMethods;
import com.framework.testng.api.base.RetryEngine;

public class CreateBiddingFormula extends BidProcMethods {

	@BeforeTest
	void setReportDetails() {
		testcaseName = "Create Bidding Formula";
		testDescription = "Creaet Bidding Formula";
		authors = "Dhivya";
		category = "Smoke";
	}

	@Test(retryAnalyzer = RetryEngine.class)
	public void runCreateBiddingFormula() throws InterruptedException, FileNotFoundException{

		new LoginPage() 
		.login("auctioner")
		.clickPending()
		.clickRecord()
		.clickBiddingFormula()
		.enterFormName()
		.enterFormHeader()
		.clickSavePreview();
		
		
	}

}
