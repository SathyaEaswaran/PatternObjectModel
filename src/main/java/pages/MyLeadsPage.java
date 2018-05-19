package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	public WebElement eleCreateLead;

	@And("Click Create Lead")
	public CreateLead clickOnCreateLead(){
		click(eleCreateLead);
		return new CreateLead();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	public WebElement eleFindLead;
	
	public FindLeadsPage clickOnFindLead() {
	click(eleFindLead);
	return new FindLeadsPage();
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	public WebElement eleMergeLeadButton;
	
	public MergeLeadsPage clickOnMergeLead() {
		click(eleMergeLeadButton);
		return new MergeLeadsPage();
	}

}
