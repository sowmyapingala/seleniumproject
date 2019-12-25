package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.RequestDemoForm;

public class Test extends BaseTest{
	
	HomePage homepage;
	RequestDemoForm req;
	WebDriver driver;
	

	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions	    
		driver = BaseTest.driverMethod("https://www.totaralearning.com/");	
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
	
	
	@Given("^lunch the broswer, Enter URL$")
	public void lunch_the_broswer_Enter_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = BaseTest.driverMethod("https://www.totaralearning.com/");
		homepage = new HomePage(driver);
		homepage.cookies();
		req = homepage.clickLink();
	}

	@When("^Fill the form and submit$")
	public void fill_the_form_and_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    req.registration();
	}

	@Then("^Verify request is created$")
	public void verify_request_is_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
