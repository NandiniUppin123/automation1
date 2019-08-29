package autotestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void createuser()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		String Expectedtitle = "actime-login";
		String Actualtitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		
		//assert.assertEquals(Actualtitle, Expectedtitle);
		Reporter.log("exit",true);
		driver.close();
	
}
}