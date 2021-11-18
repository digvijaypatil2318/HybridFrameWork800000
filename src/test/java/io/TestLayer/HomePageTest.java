package io.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.BaseLayer.BaseClass;
import io.PageLayer.HomePage;
import io.UtilsLayer.TakesScreenShot1;

public class HomePageTest extends LoginPageTest {
	
	
	
	
	@Test(priority=5)
	public void validateHomePageFunctionality() throws Throwable {
		HomePage homePage=new HomePage();
		homePage.pimClick();
		homePage.typeEmpname("ganesh");
		homePage.typesupName("pranita");
		homePage.typeEmpid("102");
		homePage.selectEmpStatus();
		homePage.selectOptions();
		homePage.selectEmpInclude();
		homePage.selectTitle();
		homePage.selectSubUnit();
		
		//TakesScreenShot1 homepage = new TakesScreenShot1();
		homePage.screenShot();
	//	homePage.clickOnBuzz();
	}
	
	

}
