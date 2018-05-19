package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_EditLead";
		testDescription="Edit Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Abi";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String ftName,String eName ) {
		
		 new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
	//	.verifyLoggedName(vName)
	//	.clickLogOut()
		.clickCRMSFA()
	    .clickOnLeads()
	    .clickOnFindLead()
	    .typeFirstName(ftName)
	    .clickOnFindLeadsbutton()
	    .clickOnFirstLeadID()
	    .clickOnEditButton()
	    .editFirstName(eName)
	    .clickUpdateButton();
	    
	    
	    
	    
	}

}
