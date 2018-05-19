package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_CreateLead";
		testDescription="Creating a New Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Abarna";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String cmpName,String fName,String lName ) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
	//	.verifyLoggedName(vName)
	//	.clickLogOut()
		.clickCRMSFA()
	    .clickOnLeads()
	    .clickOnCreateLead()
	    .typeCompanyName(cmpName)
	    .typeFirstName(fName)
	    .typeLastName(lName)
	    .createSubmit();
	}

}
