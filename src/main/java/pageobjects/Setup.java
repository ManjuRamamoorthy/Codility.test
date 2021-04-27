package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

	public static WebDriver driver = null;

	public static void initiateChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir").toString() + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void quitChromeDriver() {
		driver.close();
		driver.quit();
	}

}
