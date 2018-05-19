package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_Delete";
		testDescription="Delete Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Kavin";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String FName) {
		
		 new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()	
		.clickCRMSFA()
	    .clickOnLeads()	
	    .clickOnFindLead()
	    .typeFirstName(FName)
	    .clickOnFindLeadsbutton()
	    .clickOnFirstLeadID()
	    .clickOnDeleteButton();
	   
	  }

}
