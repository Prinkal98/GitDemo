package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="WebToCase"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(xpath = "//input[@id='input_14_1']")
	public WebElement contactName;
	@TextType()
	@FindBy(xpath = "//input[@id='input_14_2']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//input[@id='input_14_6']")
	public WebElement phone;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='input_14_4']")
	public WebElement priority;
	@TextType()
	@FindBy(xpath = "//input[@id='input_14_5']")
	public WebElement subject;
	@TextType()
	@FindBy(xpath = "//label[@id='label_14_7_1']")
	public WebElement Preference_Center;
	@ButtonType()
	@FindBy(xpath = "//input[@id='gform_submit_button_14']")
	public WebElement submit;
	@TextType()
	@FindBy(xpath = "//div[@id='gform_confirmation_message_14']")
	public WebElement Thankyou;
			
}
