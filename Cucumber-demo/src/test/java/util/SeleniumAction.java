package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumAction {
	
	static WebDriver driver;
	SeleniumAction(WebDriver driver){
		this.driver = driver;
	}
	
	public static void setvalue(WebElement ele, String str) {
		try{
			ele.sendKeys(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickCommand(WebElement ele) {
		try {
		ele.click();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public static void takeScreenshotMethod(WebDriver driver,String str) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcePath = ts.getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + str + ".png");
		FileUtils.copyFile(sourcePath, destinationPath);
	}

}
