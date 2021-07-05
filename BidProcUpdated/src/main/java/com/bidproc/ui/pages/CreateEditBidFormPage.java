package com.bidproc.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.testng.api.base.BidProcMethods;

public class CreateEditBidFormPage extends BidProcMethods{

	public CreateEditBidFormPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(how=How.ID, using="FormName")
	private WebElement enterFormName;
	
	public CreateEditBidFormPage enterFormName(String formname) {
		
		clearAndType(enterFormName, formname);
		
		return this;
	}
	@FindBy(how=How.ID, using="FromHeader")
	private WebElement enterFormHeader;
	
	public CreateEditBidFormPage enterFormHeader(String fromHeader) {
		
		clearAndType(enterFormHeader, fromHeader);
		
		return this;
	}

	@FindBy(how=How.XPATH, using="(//textarea[@title='Column Header'])[1]")
	private WebElement enterItem;
public CreateEditBidFormPage enterItem(String item) {
		
		clearAndType(enterItem, item);
		
		return this;
	}
	
	@FindBy(how=How.XPATH, using="(//textarea[@title='Column Header'])[2]")
	private WebElement enterqty;
	
public CreateEditBidFormPage enterQuantity(String qnty) {
		
		clearAndType(enterqty, qnty);
		
		return this;
	}
	
	@FindBy(how=How.XPATH, using="(//textarea[@title='Column Header'])[3]")
	private WebElement enterunit;
public CreateEditBidFormPage enterUnit(String ut) {
		
		clearAndType(enterunit, ut);
		
		return this;
	}
	@FindBy(how=How.XPATH, using="(//textarea[@title='Column Header'])[4]")
	private WebElement enterrate;
public CreateEditBidFormPage enterTotalUntit(String rt ) {
		
		clearAndType(enterrate, rt);
		
		return this;
	}

@FindBy(how=How.XPATH, using="//button[@type='submit']")
private WebElement save;
public ViewBiddingFormPAge savePreview(){
	
	click(save);
	
	
	
	return new ViewBiddingFormPAge();
	
	
}

}

