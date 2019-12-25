package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
static WebDriver driver;
	public static WebDriver driverMethod(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.totaralearning.com/");
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
}
