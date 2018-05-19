package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	
	public MergeLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	// click on From Lead Icon
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/fieldlookup.gif']")
	public WebElement eleFromLeadID;
	
	public FindLeadPopPage clickOnFromLeadIcon() {
		click(eleFromLeadID);
		switchToWindow(1);
		return new FindLeadPopPage();
	}
	//Click on To Lead Icon
		
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	public WebElement eleToLeadID;
	
	public FindLeadsPage clickOnToLeadIcon() {
		click(eleToLeadID);
		switchToWindow(1);
		return new FindLeadsPage();
	}	
	
	// To Click on Merge Button
	
	@FindBy(how=How.XPATH,using="//a[text()='Merge']")
	public WebElement eleMergeButton;
	
	public ViewLeadPage clickOnMergeButton() {
		click(eleMergeButton);
		acceptAlert();
		return new ViewLeadPage();
	}

	  
	

}
