package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement untb;
	private WebElement pstb;              //Dec
	private WebElement lgnbtn;

	public LoginPage(WebDriver driver) {
		untb=driver.findElement(By.id("username"));              //initil
		pstb=driver.findElement(By.name("pwd"));
		lgnbtn=driver.findElement(By.xpath("//div[text()='Login]"));
	}
		
		public void setuser(String username,String password)
		{
			untb.sendKeys(username);
			pstb.sendKeys(password);                       //util
			lgnbtn.click();
	}
}
