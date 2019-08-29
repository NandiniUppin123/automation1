package Demo;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.naukri.com/");
	EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
	File src = edriver.getScreenshotAs(OutputType.FILE);
	File dst = new File("./ScreenShot/ss.png");
	
	}

}
