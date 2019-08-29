package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Executioncls1 {

	public static void main(String[] args) throws Exception {
		    WebDriver driver=new FirefoxDriver();
		    driver.get("http://localhost/login.do");
		    Loginpage1 l=new Loginpage1(driver);
			PageFactory.initElements(driver, l);
			l.setuser("admin1", "manager1");
			Thread.sleep(2000);
			l.setuser("admin", "manager");
			Thread.sleep(2000);
		    driver.close();

	}

}
