package wrappers;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Browser {

	/**
	 * method to launch browser
	 * @author Vidhya
	 * @return
	 * @param browsername
	 * @param url
	 * @throws FileNotFoundException 
	 * @throws IOException 
	 */
	public void initializeBrowser(String url) throws FileNotFoundException, IOException;
	public void closeBrowser();
	public void explicitWaitStatement(String locator, String locatorValue);
	
}
