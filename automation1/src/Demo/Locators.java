package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("gb_70")).click();
		driver.navigate().back();
		driver.findElement(By.className("gb_e")).click();
		driver.navigate().back();
		driver.findElement(By.name("q")).sendKeys("qspider");
		driver.navigate().back();
		driver.findElement(By.linkText("Images")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Gm")).click();
		driver.close();

	}

}
