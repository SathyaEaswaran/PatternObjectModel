package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import paypal.Homepage;
import wdMethods.ProjectMethods;

public class PayPal extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="PayPal";
		testDescription="PayPAl Login";
		testNodes="Leads";
		category="Sanity";
		authors="Sathya";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void Homepage(String email,String password,String confirmPassword) {
	
	new Homepage()
	   .ClickSignup()
	   .radioButton()
	   .enterEmailId(email)
	   .enterPassword(password)
	   .reEnterPassword(confirmPassword);
	    }

}
