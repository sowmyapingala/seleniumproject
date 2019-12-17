package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumAction {
	
	WebDriver driver;
	SeleniumAction(WebDriver driver){
		this.driver = driver;
	}
	
	public void setvalue(WebElement ele, String str) {
		try{
			ele.sendKeys(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickCommand(WebElement ele) {
		try {
		ele.click();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}

}
