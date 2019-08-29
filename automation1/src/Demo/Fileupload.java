package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/demo10.html");
		driver.findElement(By.id("cv")).sendKeys("E:\\CITI.txt");

	}

}
