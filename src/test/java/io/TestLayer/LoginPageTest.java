package io.TestLayer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.BaseLayer.BaseClass;
import io.PageLayer.Loginpage;
import io.UtilsLayer.TakesScreenShot1;

public class LoginPageTest  extends BaseClass{
	Loginpage loginpage;
	
	
	
	@BeforeClass
	public void setUp() {
		BaseClass.initilization();
	}
	
	@Test
	public void validateLoginFunctionality() throws Throwable {
		loginpage= new Loginpage();
		loginpage.typeUserName(prop.getProperty("username"));
		loginpage.typePassword(prop.getProperty("password"));
		loginpage.click();
		
		//TakesScreenShot1 loginpage = new  TakesScreenShot1();
	    loginpage.screenshot();
	    
		
	}
	

}
