package io.PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.BaseLayer.BaseClass;
import io.UtilsLayer.ActionClass;
import io.UtilsLayer.HandleDropDown;
import io.UtilsLayer.TakesScreenShot1;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/b")
	WebElement pimBtnClick;

	@FindBy(xpath = "//*[@id=\"empsearch_employee_name_empName\"]")
	WebElement empName;

	@FindBy(xpath = "//*[@id=\"empsearch_id\"]")
	WebElement empId;

	@FindBy(xpath = "//*[@id=\"empsearch_supervisor_name\"]")
	WebElement supName;

	@FindBy(xpath = "//select[@id='empsearch_employee_status']")
	WebElement empStat;

	@FindBy(id = "empsearch_termination")
	WebElement empIncl;

	@FindBy(xpath = "//*[@id=\"empsearch_job_title\"]")
	WebElement empTitle;

	@FindBy(id = "empsearch_sub_unit")
	WebElement subUnit;
	
	@FindBy(xpath="//*[@id=\"menu_buzz_viewBuzz\"]/b")
	WebElement buzzBtnClick;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void pimClick() {
		ActionClass act = new ActionClass();
		act.clickonBtn(pimBtnClick);
	}

	public void typeEmpname(String ename) {
		empName.sendKeys(ename);
	}

	public void typeEmpid(String eId) {
		empId.sendKeys(eId);
	}

	public void typesupName(String sname) {
		supName.sendKeys(sname);
	}

	public void selectEmpStatus() {
		HandleDropDown hd = new HandleDropDown();
		hd.selectByVisibleText(empStat, "Freelance");
	}
	
	public void selectOptions() {
		HandleDropDown hd = new HandleDropDown();
		hd.selectgetOptions(empStat);
	}
	
	public void selectEmpInclude() {
		HandleDropDown hd = new HandleDropDown();
		hd.selectByindex(empIncl, 0);
	}
	
	public void selectTitle() {
		HandleDropDown hd = new HandleDropDown();
		hd.selectByVisibleText(empTitle, "IT Manager");
	}
	
	public void selectSubUnit() {
		HandleDropDown hd = new HandleDropDown();
		hd.selectByindex(subUnit, 1);
	}
	
	public void screenShot() throws Throwable {
		TakesScreenShot1 ts = new  TakesScreenShot1();
		ts.takesScreenshot();
	}
	
	
	
	
	

}
