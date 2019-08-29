package Demo;





import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextmn {

	public static void main(String[] args) throws Exception { 
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Actions action =new Actions(driver);
		WebElement rec = driver.findElement(By.xpath("//div[text()='Recruiters']"));
		action.moveToElement(rec).perform();;
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		driver.quit();

	}

}
