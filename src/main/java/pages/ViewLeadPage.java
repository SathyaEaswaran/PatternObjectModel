package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	
	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	public WebElement eleFirstName;

	public ViewLeadPage verifyFirstname(String data) {
		verifyPartialText(eleFirstName, data);
			return this;		
		}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	public WebElement eleEdit;
	@And ("Click on Edit Button")
	public EditLeadPage clickOnEditButton() {
		click(eleEdit);
		return new EditLeadPage();
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous")
	public WebElement eleDelButtoon;	
	@Then ("Delete the Created Lead")
		public ViewLeadPage clickOnDeleteButton() {
		click(eleDelButtoon);
		return new ViewLeadPage();
	}
}
