package com.bidproc.ui.testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bidproc.ui.pages.HomePage;
import com.bidproc.ui.pages.LoginPage;
import com.framework.testng.api.base.BidProcMethods;
import com.framework.testng.api.base.RetryEngine;

public class CreateBidding extends BidProcMethods {

	@BeforeTest
	void setReportDetails() {
		testcaseName = "CreateBidding";
		testDescription = "CreateBidding";
		authors = "Dhivya";
		category = "Smoke";
		excelFileName = "CreateBidding";
	}

	@Test(retryAnalyzer = RetryEngine.class,dataProvider="fetchData")
	public void createBidding(String formName, String formHeader, String item, String quantity, String unit, String totalUnit,String prodValue, String qntyValue) throws InterruptedException, FileNotFoundException {
		  
		new LoginPage() 
		.login("auctioner")
		.clickPending()
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
	}
}
