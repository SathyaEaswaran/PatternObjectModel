package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	public WebElement eleCmpName;
	@And("Enter CompanyName as (.*)")
	public CreateLead typeCompanyName(String data) {
       type(eleCmpName,data);
	   return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	public WebElement eleFirstName;
	@And("Enter FirstName as (.*)")
	public CreateLead typeFirstName(String data) {
		type(eleFirstName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	public WebElement eleLastName;
	@And("Enter LastName as (.*)")
	public CreateLead typeLastName(String data) {
		type(eleLastName,data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	public WebElement elecreate;
	@And("Click on CreateLead Button")
	public ViewLeadPage createSubmit() {
		click(elecreate);
		return new ViewLeadPage();		
	}
	
}
