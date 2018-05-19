package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {
	
	public FindLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	// passing FirstName
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	 WebElement eleFirstName;	
	
	public FindLeadsPage typeFirstName(String data) {
		type(eleFirstName,data);
		return this;
	}
	
	//clicking on FindLeads Button
	
		@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
		WebElement eleFindLeadsButton;	
		
		public FindLeadsPage clickOnFindLeadsbutton() {
			click(eleFindLeadsButton);
			return this;
		}		
		
		//click on FirstResult ID
		
		
		@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
		WebElement eleClickLeadID;
		
		public ViewLeadPage clickOnFirstLeadID() {
			click(eleClickLeadID);
			return new ViewLeadPage();
		}
		
		
		//To Pick first data ToLead
		
				@FindBy(how=How.XPATH,using="//a[@class='linktext'][1]")
				public WebElement eleToLeadData;
				
				public MergeLeadsPage clickOnToLeadData() {
					click(eleToLeadData);
					return new MergeLeadsPage();
				}
				
			//  pass the To Lead ID
				
				@FindBy(how=How.XPATH,using="//input[@name='id']")
				 WebElement eleToLeadID;
				
				public FindLeadPopPage typeToLeadID(String data) {
					
					type(eleToLeadID,data);
					return new FindLeadPopPage();
				}


			
				
				
				
		
	
}
