package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E://Demo3.html");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("qsider");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("jspider");
		Thread.sleep(2000);
		driver.close();

	}

}
