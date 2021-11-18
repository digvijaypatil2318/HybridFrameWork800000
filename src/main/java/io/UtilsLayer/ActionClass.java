package io.UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.BaseLayer.BaseClass;

public class ActionClass extends BaseClass {
	
	
	
	public void clickonBtn(WebElement wb) {
	Actions act = new Actions(driver);
	act.click(wb).build().perform();
	}
	
	public void scrollDown(WebElement wb) {
		Actions act = new  Actions(driver);
		act.contextClick(wb).build().perform();
	}
	
	
	public void doubleClick(WebElement wb) {
		Actions act = new Actions(driver);
		act.doubleClick(wb).build().perform();
	}

}
