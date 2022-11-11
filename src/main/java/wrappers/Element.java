package wrappers;

import org.openqa.selenium.WebElement;

public interface Element {

	public void click(WebElement ele);
	public void type(WebElement ele, String text);
	public void clickElementUsingJavaScript(WebElement ele);
	public WebElement locateElement(String locator, String value);
    public void clearAndTypeText(WebElement ele, String text);
	

	
	public String getTheActualText(WebElement ele);
	
	public void explicitWaitStatement(String locator, String locatorValue);
}
