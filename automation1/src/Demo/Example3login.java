package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Example3login {
	@FindBy(id="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pstb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnbtn;
	
public Example3login(WebDriver driver)
{

	
}
public void setuser(String username,String password) throws Exception
{
	untb.sendKeys(username);
	pstb.sendKeys(password);                      
	lgnbtn.click();
	Thread.sleep(2000);
}
}