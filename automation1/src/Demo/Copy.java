package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Copy {

	public static void main(String[] args) throws Exception {
		

	WebDriver driver=new FirefoxDriver();
	driver.get("file:///E://Demo6.html");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.CONTROL + "ac");
	driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys(Keys.CONTROL + "v");
	Thread.sleep(2000);
	driver.close();


}
}
