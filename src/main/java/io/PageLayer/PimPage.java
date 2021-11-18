package io.PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.BaseLayer.BaseClass;
import io.UtilsLayer.TakesScreenShot1;

public class PimPage extends BaseClass{
	
	
	
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	WebElement addBtn;
	
	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement firstName;
	
	@FindBy(id="middleName")
	WebElement middleName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="employeeId")
	WebElement empId;
	
	
	public PimPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddBtn() {
		addBtn.click();
	}
	
	public void typeFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void typeMiddleName(String mname) {
		  middleName.sendKeys(mname);
	}
	
	public void typeLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void typeEmpId(String eid) {
		empId.sendKeys(eid);
	}
	
	public void screenShot() throws IOException {
		TakesScreenShot1 abc= new TakesScreenShot1();
			abc.takesScreenshot();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
