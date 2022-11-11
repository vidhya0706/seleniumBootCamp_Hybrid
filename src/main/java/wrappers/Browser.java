package wrappers;

public interface Browser {

	/**
	 * method to launch browser
	 * @author Vidhya
	 * @return
	 * @param browsername
	 * @param url
	 */
	public void initializeBrowser(String url);
	public void closeBrowser();
	public void explicitWaitStatement(String locator, String locatorValue);
	
}
