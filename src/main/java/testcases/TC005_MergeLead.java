package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="Merge Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Kavin";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String FLeadID,String TLeadID) {
		
		 new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()	
		.clickCRMSFA()
	    .clickOnLeads()	    
	    .clickOnMergeLead()	    
	    .clickOnFromLeadIcon()
	    .typeFromLeadID(""+FLeadID)    
		.clickOnFindLeadsbutton()
		.clickOnFirstLeadID()		
		.clickOnToLeadIcon()
	    .typeToLeadID(""+TLeadID)    
		.clickOnFindLeadsbutton()
		.clickOnFirstLeadID()
		.clickOnMergeButton();
		
	    }
	
	

}
