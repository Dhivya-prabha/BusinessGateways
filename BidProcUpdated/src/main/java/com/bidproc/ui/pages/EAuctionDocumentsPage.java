package com.bidproc.ui.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;

public class EAuctionDocumentsPage extends BidProcMethods {
	
	public EAuctionDocumentsPage enterDocumentTitle() {
		clearAndType(locateElement(Locators.ID, "txtDocDesc"), "File");
		reportStep("Document title has been added", "pass");
		return this;
	}
	
	public EAuctionDocumentsPage clickBrowseFile() {
		WebElement eleUpload = locateElement(Locators.XPATH, "//font[text()='Browse File']");
		eleUpload.click();
		pause(3000);
		type(eleUpload, "file:///C:/Users/dell/Desktop/git-cheat-sheet-education.pdf");
		reportStep("Browse fil and upload has been done", "pass");
		return this;
	}
	
	public EAuctionDocumentsPage clickUpload() {
		click(locateElement(Locators.ID, "btnUploadDocument"));
		reportStep("Upload button has been clicked successfully", "pass");
		return this;
	}
	
	

}
