package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecutionClass {

	public static void main(String[] args) {
    WebDriver driver=new FirefoxDriver();
    driver.get("http://localhost/login.do");
    LoginPage l=new LoginPage(driver);
    l.setuser("admin","manager");
    driver.close();

	}

}
