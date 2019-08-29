package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example3logout {
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement loutbtn;
	

public Example3logout(WebDriver driver)
{
PageFactory.initElements(driver, this);
	
}
public void logout() throws Exception
{
	loutbtn.click();
	Thread.sleep(2000);
}
}
