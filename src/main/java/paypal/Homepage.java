package paypal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Homepage extends ProjectMethods {
	
	public Homepage() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.ID,using="signup-button")
	 WebElement signup;
	
	public NextPage ClickSignup() {
		click(signup);
    return new NextPage();	

}
}
