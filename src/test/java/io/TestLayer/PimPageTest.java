package io.TestLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import io.BaseLayer.BaseClass;
import io.PageLayer.PimPage;

public class PimPageTest extends HomePageTest  {
	
	
	
	@Test(priority=6)
	public void validatePimPage() throws IOException {
		PimPage pimPage = new PimPage();
		pimPage.clickOnAddBtn();
		pimPage.typeFirstName("digvijay");
		pimPage.typeMiddleName("Ranveer");
		pimPage.typeLastName("patil");
		pimPage.typeEmpId("1233");
		pimPage.screenShot();
		
	}
	
	

	public void tearDown() {
		driver.close();
	}
	

}
