package io.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.BaseLayer.BaseClass;
import io.UtilsLayer.ActionClass;
import io.UtilsLayer.TakesScreenShot1;

public class Loginpage extends BaseClass{
	
	
	
	
	@FindBy(xpath="//*[@id=\"txtUsername\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"txtPassword\"]")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement btnlick;
	
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void typeUserName(String uname) {
		username.sendKeys(uname);
	}
	
	public void typePassword(String pass) {
		password.sendKeys(pass);
	}
	
	
	public void click() {
	ActionClass act =  new ActionClass();
	act.clickonBtn(btnlick);
	}
	
	public void screenshot() throws Throwable {
		TakesScreenShot1 abc = new TakesScreenShot1();
		abc.takesScreenshot();
	}
	
	

}
