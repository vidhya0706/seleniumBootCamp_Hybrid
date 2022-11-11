package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.A1_LoginPage;

public class DeleteOpportunity extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setdata() {
		 excelfilename= "./data/deleteOpp.xlsx";
	}

	@Test(dataProvider="sendData")
	public void runDeleteOpportunity(String name1) throws InterruptedException, IOException {
		
		new A1_LoginPage(driver)
		.enterUsername()
		.enterPasssword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.enterSales()
		.clickSales()
		.clickOpportunity()
		.searchByOpportunityName(name1)
		.clickDropDown()
		.clickDelete()
		.deleteOpportunity()
		.verifyDeletedOpportunity(name1);

	}
}
