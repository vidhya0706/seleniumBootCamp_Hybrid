package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A1_LoginPage extends ProjectSpecificMethods {
	
	public A1_LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
 

	public A1_LoginPage enterUsername() throws IOException {
		Properties prop= new Properties();
		FileInputStream file = new FileInputStream(new File("./src/main/resources/AppConfig.properties"));
		prop.load(file);
		String username =prop.getProperty("username");
		//driver.findElement(By.id(prop_lang.getProperty("Login_id"))).sendKeys(username);
		type(locateElement("id",prop_lang.getProperty("Login_id")),username);
		//type(locateElement("id", "username"), username);
		return this;
		
	}
    
	public A1_LoginPage enterPasssword() throws IOException {
		Properties prop= new Properties();
		FileInputStream file = new FileInputStream(new File("./src/main/resources/AppConfig.properties"));
		prop.load(file);
		String password = prop.getProperty("password");
		//driver.findElement(By.id(prop_lang.getProperty("Password_id"))).sendKeys("India$4321");
		type(locateElement("id",prop_lang.getProperty("Password_id")),password);
        return this;
	}
	
    public A2_HomePage clickLogin() {
    	//driver.findElement(By.xpath(prop_lang.getProperty("xpath_Submit"))).click();
    	click(locateElement("xpath",prop_lang.getProperty("xpath_Submit")));
        return new A2_HomePage(driver);
	}

}
