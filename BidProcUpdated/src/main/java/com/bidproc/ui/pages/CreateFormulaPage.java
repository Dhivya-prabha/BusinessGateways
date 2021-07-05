package com.bidproc.ui.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BidProcMethods;

public class CreateFormulaPage extends BidProcMethods{
	
	public CreateFormulaPage selectFormulaColumn() {
		WebElement formulaDD = locateElement(Locators.XPATH, "//span[contains(text(),'Select Formula Column')]");
		pause(3000);
		hoverAndClick(formulaDD);
		pause(2000);
		WebElement clickValue = locateElement(Locators.XPATH, "//span[contains(text(),'BOX')]");
		hoverAndClick(clickValue);
		reportStep("Select the value for dropdown", "Pass");
		return this;
	}
	
	public CreateFormulaPage enterFormName() {
		clearAndType(locateElement(Locators.ID, "FormName"), "TC01");
		reportStep("Enter the Form Name", "Pass");
		return this;
	}
	
	public CreateFormulaPage enterFormHeader() {
		clearAndType(locateElement(Locators.ID, "FromHeader"), "Heading");
		reportStep("Enter the Form Header", "Pass");
		return this;
	}
	
	public CreateFormulaPage enterUnit() {
		clearAndType(locateElement(Locators.XPATH, "//input[@class='form-control']"), "2");
		reportStep("Enter the Unit", "Pass");
		return this;
	}

	public CreateFormulaPage enterOMR() {
		clearAndType(locateElement(Locators.XPATH, "(//input[@class='form-control'])[2]"), "2");
		reportStep("Enter the OMR", "Pass");
		return this;
	}
	
	public CreateFormulaPage enterBoxFormula() {
		clearAndType(locateElement(Locators.XPATH, "//input[@title='BOX']"), "3");
		reportStep("Enter the Box Formula", "Pass");
		return this;
	}
	
	public CreateFormulaPage clickSaveFormula() {
		click(locateElement(Locators.ID, "btnSubmitForm"));
		reportStep("Click save formula", "Pass");
		return this;
	}
	
	public CreateFormulaPage clickPublishButton() {
		click(locateElement(Locators.ID, "approve"));
		reportStep("Click Publish", "Pass");
		return this;
	}
	
	public CreateFormulaPage clickSavePreview() {
		click(locateElement(Locators.ID, "btnSubmitForm"));
		reportStep("Click Save & Preview", "Pass");
		return this;
	}
	
	
	
}
