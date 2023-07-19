package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="TablePAge"                                
     , summary=""
     , relativeUrl=""
     , connection="W3Schools"
     )             
public class TablePAge {

	@PageRow()
	public static class Table1 {
	
	@TextType()
	@FindBy(xpath = "//td[1]")
	public WebElement company;
	
	@TextType()
	@FindBy(xpath = "//td[2]")
	public WebElement contact;
	
	@TextType()
	@FindBy(xpath = "//td[3]")
	public WebElement country;
	}

	@FindBy(xpath = "(//table[@id='customers'])//tr")
	@PageTable(firstRowContainsHeaders = false, row = Table1.class)
	public List<Table1> table1;
			
}
