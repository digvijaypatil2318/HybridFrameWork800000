package io.BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.UtilsLayer.ListnerClass;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;
	public static FileInputStream fis;
	//public static EventFiringWebDriver e_driver;
	//public static ListnerClass eventListener;

	public BaseClass() {

		prop = new Properties();
		try {
			fis = new FileInputStream(
					"C:\\Users\\DELL\\eclipse-workspace\\Hybrid800000\\src\\main\\java\\io\\ConfigLayer\\orangerHrm.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*e_driver = new EventFiringWebDriver(driver);

		// create object WebEventListener to register with the EventFiringWebDriver
		eventListener = new ListnerClass();

		e_driver.register(eventListener);


	driver = e_driver;
	*/	

	}

	public static void initilization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

}
