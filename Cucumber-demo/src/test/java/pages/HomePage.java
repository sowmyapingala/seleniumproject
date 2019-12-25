package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	HomePage home;
	RequestDemoForm req;
	
	static WebDriver driver;
	
	@FindBy(xpath ="//div[@class='logo logo--primary']") WebElement eleHomeLogo;
	@FindBy(xpath ="//a[contains(text(),'Request a demo')]") WebElement eleRequest;
	@FindBy(xpath = "//button[contains(text(),'OK, I agree')]")
	static WebElement cookie;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage clickImage() {
		
		eleHomeLogo.click();
		
		return this;
		
	}
	
	public RequestDemoForm clickLink() {
		
		eleRequest.click();
		
		return new RequestDemoForm(driver);
		
	}
	public static void cookies(){
		
		try {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(cookie));
		cookie.click();
		}catch (Exception e) {
			e.printStackTrace();	
		}
		
	}
	

	

}
