package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A4_ViewOpportunity extends ProjectSpecificMethods {
	
	public A4_ViewOpportunity(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public A4_ViewOpportunity verifyOpportunity(String name) {
		 //String OppName= driver.findElement(By.xpath(prop_lang.getProperty("xpath_verifycreatedopportunity"))).getText();
		 String OppName= getTheActualText(locateElement("xpath",prop_lang.getProperty("xpath_verifycreatedopportunity")));
		 System.out.println(OppName);
		  
		  
		  if(OppName.contains(name))
		  {
			System.out.println("Opportunity is created");  
		  }
		  else {
			  System.out.println("Opportunity is not created");
		  }
		  return this;


	}
	
	public A4_ViewOpportunity verifyEditedOpportunity() {
		//String OppName= driver.findElement(By.xpath(prop_lang.getProperty("xpath_verifyeditedopportunity"))).getText();
		String OppName= getTheActualText(locateElement("xpath",prop_lang.getProperty("xpath_verifyeditedopportunity")));
		System.out.println(OppName);
		if(OppName.contains("Perception Analysis"))
		  {
			System.out.println("Opportunity is Edited");  
		  }
		  else {
			  System.out.println("Opportunity is not edited");
		  }
		return this;

	}
	
	public A4_ViewOpportunity verifyDeletedOpportunity(String name1) {
		//String Name= driver.findElement(By.xpath(prop_lang.getProperty("xpath_verifydeletedopportunity"))).getText();
		String Name= getTheActualText(locateElement("xpath",prop_lang.getProperty("xpath_verifydeletedopportunity")));
		System.out.println(Name);
		if(Name.contains(name1))
		  {
			System.out.println("Opportunity is not deleted");  
		  }
		  else {
			  System.out.println("Opportunity is deleted");
		  }
		return this;

	}
}
