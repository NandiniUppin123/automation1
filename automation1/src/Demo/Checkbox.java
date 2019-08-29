package Demo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox {

	@FindBy(xpath="//input[type='checkbox']")
	private List<WebElement> allchkbx;
	
	public Checkbox(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void setchbox() {
		for(int i=0;i<allchkbx.size();i++) {
			System.out.println(allchkbx.size());
			allchkbx.get(i).click();
		}
	}
	
	
}
