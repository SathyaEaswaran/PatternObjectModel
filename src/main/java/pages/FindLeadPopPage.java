package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPopPage extends ProjectMethods {
	
	public FindLeadPopPage() {
		PageFactory.initElements(driver,this);
	}
	
	// passing FirstName
	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	 WebElement eleFirstName;	
	
	public FindLeadPopPage typeFirstName(String data) {
		type(eleFirstName,data);
		return this;
	}
	
	// passing From Lead ID
	
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	 WebElement eleFromLeadID;
	
	public FindLeadPopPage typeFromLeadID(String data) {
		type(eleFromLeadID,data);
		return this;
	}
	
	//clicking on FindLeads Button
	
		@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
		WebElement eleFindLeadsButton;	
		
		public FindLeadPopPage clickOnFindLeadsbutton() {
			click(eleFindLeadsButton);
			return this;
		}		
		
		//click on FirstResult ID	
		
		@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
		WebElement eleClickLeadID;
		
		public MergeLeadsPage clickOnFirstLeadID() {
			click(eleClickLeadID);
			switchToWindow(0);
			return new MergeLeadsPage();
		}
		
		// passing To Lead ID		
		
		@FindBy(how=How.XPATH,using="//input[@name='id']")
		 WebElement eleToLeadID;
		
		public FindLeadPopPage typeToLeadID(String data) {
			type(eleToLeadID,data);
			return this;
		}
		
		
		
				
		
	
}
