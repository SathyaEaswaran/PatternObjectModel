package paypal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignUpPage extends ProjectMethods{

	public SignUpPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how = How.ID, using = "country")
	WebElement country;

	public SignUpPage countrySelect(String data) {
		selectDropDownUsingText(country, "India");
		return this;
	}

	@FindBy(how = How.ID, using = "email")
	WebElement emailId; 
	public SignUpPage enterEmailId(String data) {
		type(emailId, data);
		return this;

	}


	@FindBy(how = How.ID, using = "password")
	WebElement pawsd; 


	public SignUpPage enterPassword(String data) {
		type(pawsd, data);
		return this;
	}

	@FindBy(how = How.ID, using = "confirmPassword")
	WebElement reEnterPassword; 
	public SignUpPage reEnterPassword(String data) {
		type(reEnterPassword, data);
		return this;
	}
}