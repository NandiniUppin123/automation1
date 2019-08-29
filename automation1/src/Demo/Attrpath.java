package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attrpath {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E://Demo5.html");
		driver.findElement(By.xpath("//input[@type='text' AND @value='A']"));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.DELETE);

	}

}
