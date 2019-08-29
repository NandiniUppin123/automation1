package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	@FindBy(id="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pstb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnbtn;
	
	public Loginpage1(WebDriver driver)
	{
	
		
	}
	public void setuser(String username,String password)
	{
		untb.sendKeys(username);
		pstb.sendKeys(password);                       //util
		lgnbtn.click();
		untb.clear();
		pstb.clear();
}
}
