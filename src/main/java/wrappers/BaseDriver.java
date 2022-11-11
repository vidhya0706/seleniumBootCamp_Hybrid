package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver implements Browser,Element{
	
	public static RemoteWebDriver driver;
	public static JavascriptExecutor executor;
	public static WebDriverWait wait;
	public static ChromeOptions options;

	public void initializeBrowser(String url){
	
		  //System.setProperty("webdriver.chrome.drive", "./drivers/chromedriver");
		  WebDriverManager.chromedriver().setup(); options = new ChromeOptions();
		  options.addArguments("--disable-notifications"); 
		  driver = new ChromeDriver(options);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		  executor =(JavascriptExecutor)driver; 
		  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		  driver.navigate().to(url);
		  driver.manage().window().maximize();
	}

	public void closeBrowser() {
		driver.close();
		
	}

	public void click(WebElement ele) {
		ele.click();
		
	}

	public void type(WebElement ele, String text) {
		ele.sendKeys(text);
		
	}

	public void clickElementUsingJavaScript(WebElement ele) {
		executor.executeScript("arguments[0].click();", ele);
		
	}

	public WebElement locateElement(String locator, String value) {
		String loc = locator.toLowerCase();
		switch (loc)
		{
		    case "id":
			    return driver.findElement(By.id(value));
			case "xpath":
				return driver.findElement(By.xpath(value));
	
		}
		return null;
	}
	public void explicitWaitStatement(String locator, String locatorValue)
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		String loc = locator.toLowerCase();
		switch (loc)
		{
		    case "id":
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
			case "xpath":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
		}
	}

	@Override
	public void clearAndTypeText(WebElement ele, String text) {
		ele.clear();
		ele.sendKeys(text);
		
	}


	@Override
	public String getTheActualText(WebElement ele) {
		return ele.getText();
	}


}
