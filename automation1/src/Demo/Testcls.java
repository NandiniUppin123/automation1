package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcls {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/chk.html");
		Checkbox c=new Checkbox(driver);
		c.setchbox();
		Thread.sleep(2000);
		c.setchbox();
		Thread.sleep(2000);
		driver.close();
	}

}
