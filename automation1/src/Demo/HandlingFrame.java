package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrame {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/page1.html");
		driver.findElement(By.id("t1")).sendKeys("admin");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("manager");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.close(); 
		
		

	}

}
