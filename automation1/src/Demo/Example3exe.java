package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Example3exe {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Example3login l=new Example3login(driver);
		PageFactory.initElements(driver, l);
		l.setuser("admin","manager");
		Thread.sleep(2000);
		Example3logout l1=new Example3logout(driver);
		//PageFactory.initElements(driver, l1);
	l1.logout();
		Thread.sleep(2000);
		driver.close();

	}

}
