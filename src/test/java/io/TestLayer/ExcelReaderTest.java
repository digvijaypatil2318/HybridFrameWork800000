package io.TestLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.UtilsLayer.ExcelReader;
// <class name="io.TestLayer.ExcelReaderTest"/>
public class ExcelReaderTest {

	@Test(dataProvider = "Instagram")
	public void validateLoginPage(String username, String password) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Hybrid800000\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@DataProvider(name = "Instagram")
	public Object[][] testData() throws Throwable {

		ExcelReader obj = new ExcelReader("C:\\Users\\DELL\\eclipse-workspace\\Hybrid800000\\src\\main\\java\\io\\TestDataLayer\\instaSheet.xlsx");

		int rows= obj.rowcount(0);

		Object[][] data = new Object[rows][2];

		for (int i = 0; i < rows; i++) {
			data[i][0] = obj.getData(0, i, 0);
			data[i][1] = obj.getData(1, i, 1);

		}

		return data;

	}

}
