package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.JavaUtil;
import util.SeleniumAction;

public class RequestDemoForm {
	
	
	WebDriver driver;

	SeleniumAction util;
@FindBy(xpath = "//div[@id='firstname-5b1f094f-3ae0-4e74-9773-5907479e0187']") WebElement eleFirstName;

@FindBy(xpath = "//div[@id='lastname-5b1f094f-3ae0-4e74-9773-5907479e0187']") WebElement eleLastName;

@FindBy(xpath = "//div[@id='company-5b1f094f-3ae0-4e74-9773-5907479e0187']") WebElement eleCompanyName;

@FindBy(xpath = "//div[@id='jobtitle-5b1f094f-3ae0-4e74-9773-5907479e0187']") WebElement eleJobTitle;

@FindBy(xpath = "//sel[@id='country-5b1f094f-3ae0-4e74-9773-5907479e0187']") WebElement eleCountry;

@FindBy(xpath = "//sel[@id='numemployees-5b1f094f-3ae0-4e74-9773-5907479e0187']") WebElement eleCompanySize;

@FindBy(xpath = "//div[@id='phone-5b1f094f-3ae0-4e74-9773-5907479e0187']") WebElement elePhoneNumber;

@FindBy(xpath = "//div[@id='email-5b1f094f-3ae0-4e74-9773-5907479e0187']") WebElement eleEmail;

@FindBy(xpath = "//div[@id='description-5b1f094f-3ae0-4e74-9773-5907479e0187']") WebElement eleDetails;

@FindBy(xpath = "//p[contains(text(),'I agree ')]") WebElement eleIagree;

RequestDemoForm(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void registration() {
        SeleniumAction.setvalue(eleFirstName, JavaUtil.getValueFromProperties("firstname"));
        SeleniumAction.setvalue(eleLastName, JavaUtil.getValueFromProperties("lastname"));
        SeleniumAction.setvalue(eleCompanyName,JavaUtil.getValueFromProperties("companyname") );
        SeleniumAction.setvalue(eleJobTitle, JavaUtil.getValueFromProperties("jobtitle"));
        SeleniumAction.setvalue(eleCountry,JavaUtil.getValueFromProperties ("country"));
        SeleniumAction.setvalue(eleCompanySize,JavaUtil.getValueFromProperties ("companysize"));
        SeleniumAction.setvalue(elePhoneNumber,JavaUtil.getValueFromProperties ("phonenumber"));
        SeleniumAction.setvalue(eleEmail,JavaUtil.getValueFromProperties ("email"));
        SeleniumAction.setvalue(eleDetails, JavaUtil.getValueFromProperties("details"));			
		
}

}	
	
	

