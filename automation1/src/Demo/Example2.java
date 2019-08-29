package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Example2 {
	@FindBy(id="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pstb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnbtn;
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tsbtn;
	
	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement pclink;
	
	@FindBy(xpath="//div[@id='ext-comp-1002']")
	private WebElement createcust;
	
	@FindBy(xpath="//input[@id='customerLightBox_nameField']")
	private WebElement name;
	
	@FindBy(xpath="(//span[text()='Create Customer'])[1]")
	private WebElement custcreated;
	
	
	
	public Example2(WebDriver driver)
	{
	
		
	}
	public void setuser(String username,String password,String customername) throws Exception
	{
		untb.sendKeys(username);
		pstb.sendKeys(password);                       //util
		lgnbtn.click();
		Thread.sleep(2000);
		tsbtn.click();
		Thread.sleep(2000);
	    pclink.click();
	    Thread.sleep(2000);
		createcust.click();
		Thread.sleep(2000);
	    name.sendKeys(customername);
	    Thread.sleep(2000);
		custcreated.click();
		

	}
}
