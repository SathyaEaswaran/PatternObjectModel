package paypal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class NextPage extends ProjectMethods {

	public NextPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.ID, using = "radio-personal")
	WebElement radio;
	
	
	
	@FindBy(how = How.LINK_TEXT, using = "Next")
	WebElement nextButton;
	
	public SignUpPage radioButton() {
		
		boolean selected = radio.isSelected();
		if(selected) {
			System.out.println("Selected");
		}else {
			click(radio);
		}
		
		click(nextButton);
		return new SignUpPage();
		
	}

}
