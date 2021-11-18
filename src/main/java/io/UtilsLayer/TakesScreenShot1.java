package io.UtilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import io.BaseLayer.BaseClass;

public class TakesScreenShot1 extends BaseClass {



	public void takesScreenshot() throws IOException  {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\eclipse-workspace\\Hybrid800000\\Screenshot\\abc.png"));

	}

}
