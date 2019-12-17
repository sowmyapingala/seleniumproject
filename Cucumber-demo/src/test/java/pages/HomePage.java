package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	HomePage obj;
	
	WebDriver driver;
	
	@FindBy(xpath ="//div[@class='logo logo--primary']") WebElement eleHomeLogo;
	
	
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage clickImage() {
		
		eleHomeLogo.click();
		
		return obj =  new HomePage(driver);
		
	}
	

	

}
