package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.SeleniumAction;

public class RequestDemoForm {

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


public void register() {
	util.setvalue(eleFirstName, "Fita");
	
}




}