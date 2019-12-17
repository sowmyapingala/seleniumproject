package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;

public class Test {
	
	HomePage homepage;
	WebDriver driver;
	

	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.setProperty("webdriver.chrome.driver", "D:\\Prasanth\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.totaralearning.com/");
		driver.manage().window().maximize();
		
	}

	@When("^user click home logo$")
	public void user_click_home_logo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage = new HomePage(driver);
		homepage.clickImage();
		
	}

	@Then("^Home page is dispalayed$")
	public void home_page_is_dispalayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		String str1 = "Totara Learning - Freedom to Learn";
		
		String str2 = driver.getTitle();
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Pass: " + str2);
		}else {
			System.out.println("Fail: " + str2);
		}
	}
}
