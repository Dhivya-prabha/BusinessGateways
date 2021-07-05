package com.bidproc.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.testng.api.base.BidProcMethods;

public class PaymentInformationPage extends BidProcMethods {

	public PaymentInformationPage() {
		PageFactory.initElements(getDriver(), this);
	}

	
	@FindBy(how = How.XPATH, using = "//a[@id='paymentDetailsNext']")
	private WebElement paymenntInformationNext ;

	public DateInformation clickNext() {
		click(paymenntInformationNext);
		reportStep("The Next was clicked  Successfully at Payment Options page", "pass");
		return new DateInformation();
	}
	

}
