 package io.UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	
	
	
	public void selectByVisibleText(WebElement wb,String text) {
		Select sel = new Select(wb);
		sel.selectByVisibleText(text);	
	}
	
	public void selectByindex(WebElement wb,int index) {
		Select sel = new Select(wb);
		sel.selectByIndex(index);
	}
	
	public void selectByvalue(WebElement wb,String value) {
		Select sel = new  Select(wb);
		sel.selectByValue(value);
	}
	
	public void selectgetOptions(WebElement wb) {
		Select sel = new Select(wb);
	List<WebElement> ls=	sel.getOptions();
	for(WebElement abc:ls)
	{
		String a=abc.getText();
		System.out.println(a);
	}
	}
	
	
	
	public void selectgetSelectOption(WebElement wb) {
		Select sel = new Select(wb);
	WebElement wc =	sel.getFirstSelectedOption();
	System.out.println(wc);
		
	}
	
	
	
	

}
