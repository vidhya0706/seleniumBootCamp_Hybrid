package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A3_OpportunityPage extends ProjectSpecificMethods{
	
	
	 public A3_OpportunityPage(RemoteWebDriver driver) 
	 { 
		 this.driver=driver; 
	 }
	 
	
	public A3_OpportunityPage clickNewOpportunity() {
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_clickNewOpportunity"))).click();
		click(locateElement("xpath",prop_lang.getProperty("xpath_clickNewOpportunity")));
	    return this;
	}
	
	public A3_OpportunityPage enterOpportunityName(String name) {
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_enteropportunityname"))).sendKeys(name);
		type(locateElement("xpath",prop_lang.getProperty("xpath_enteropportunityname")), name);
        return this;
	}
	
	public A3_OpportunityPage enterDate() throws InterruptedException {
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_clickenterDate"))).click();
		click(locateElement("xpath",prop_lang.getProperty("xpath_clickenterDate")));
//		WebElement element3=driver.findElement(By.xpath(prop_lang.getProperty("xpath_selectastoday")));
//		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
//		executor3.executeScript("arguments[0].click();", element3);
    clickElementUsingJavaScript(locateElement("xpath",prop_lang.getProperty("xpath_selectastoday")));
		Thread.sleep(2000);
        return this;
	}
	
	public A3_OpportunityPage enterStage() {
		WebElement element4=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", element4);
   // clickElementUsingJavaScript(locateElement("xpath","//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]"));	

		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_selectneedanalysis"))).click();
    click(locateElement("xpath",prop_lang.getProperty("xpath_selectneedanalysis")));
        return this;
	}
	
	public A4_ViewOpportunity clickSave() throws InterruptedException {
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_clicksaveoppurtunity"))).click();
		click(locateElement("xpath",prop_lang.getProperty("xpath_clicksaveoppurtunity")));	
	    Thread.sleep(2000);
	    return new A4_ViewOpportunity(driver);

	}
	
	public A3_OpportunityPage searchByOpportunityName(String name) throws InterruptedException {
		
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_searchbyopportunityname"))).sendKeys(name +Keys.ENTER);
		type(locateElement("xpath",prop_lang.getProperty("xpath_searchbyopportunityname")),name +Keys.ENTER);	
		Thread.sleep(2000);
		return this;

	}
	
	public A3_OpportunityPage clickDropDown() {
//		WebElement element3 = driver.findElement(By.xpath(prop_lang.getProperty("xpath_clickdropdown")));
//		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
//		executor3.executeScript("arguments[0].click();", element3);
		clickElementUsingJavaScript(locateElement("xpath",prop_lang.getProperty("xpath_clickdropdown")));	
		return this;
		
	}
	
	public A3_OpportunityPage clickEdit() {
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_clickeditopportunity"))).click();
		click(locateElement("xpath",prop_lang.getProperty("xpath_clickeditopportunity")));		
		return this;

	}
	public  A3_OpportunityPage editTomorrowDate() {
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_clicktomorrowdate"))).click();
	click(locateElement("xpath",prop_lang.getProperty("xpath_clicktomorrowdate")));	
		
//	WebElement element4=driver.findElement(By.xpath(prop_lang.getProperty("xpath_selecttomorrowdate")));
//	JavascriptExecutor executor4 = (JavascriptExecutor)driver;
//	executor4.executeScript("arguments[0].click();", element4);
	clickElementUsingJavaScript(locateElement("xpath",prop_lang.getProperty("xpath_selecttomorrowdate")));
		return this;

	}
	
	public  A3_OpportunityPage editStage() {
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_clickstage"))).click();
		click(locateElement("xpath",prop_lang.getProperty("xpath_clickstage")));	
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_clickstage1"))).click();
		click(locateElement("xpath",prop_lang.getProperty("xpath_clickstage1")));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return this;
	}
	
	public A3_OpportunityPage selectDeliverstate() {
//		WebElement element6=driver.findElement(By.xpath(prop_lang.getProperty("xpath_clicldeliverstate")));
//		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
//		executor6.executeScript("arguments[0].click();", element6);
		clickElementUsingJavaScript(locateElement("xpath",prop_lang.getProperty("xpath_clicldeliverstate")));
		
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_clickInprogress"))).click();
		click(locateElement("xpath",prop_lang.getProperty("xpath_clickInprogress")));	
		return this;

	}
	public A3_OpportunityPage enterDescription(String description) {
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_enterdescription"))).sendKeys(description);
		type(locateElement("xpath",prop_lang.getProperty("xpath_enterdescription")),description);
     return this;
	}
	
	public A4_ViewOpportunity clickSaveForEditedOpportunity() {
		
//		WebElement element5=driver.findElement(By.xpath(prop_lang.getProperty("xpath_clicksaveforeditedopportunity")));
//		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
//		executor5.executeScript("arguments[0].click();", element5);
		clickElementUsingJavaScript(locateElement("xpath",prop_lang.getProperty("xpath_clicksaveforeditedopportunity")));	
      return new A4_ViewOpportunity(driver);
	}
	
	public A3_OpportunityPage clickDelete() {
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_clickdeleteopportunity"))).click();
		click(locateElement("xpath",prop_lang.getProperty("xpath_clickdeleteopportunity")));		
		return this;
	
	}
	public A4_ViewOpportunity deleteOpportunity() {
		//driver.findElement(By.xpath(prop_lang.getProperty("xpath_confirmdeleteopp"))).click();
		click(locateElement("xpath",prop_lang.getProperty("xpath_confirmdeleteopp")));	
		return new A4_ViewOpportunity(driver);
	
	}
	
	


}
