package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E://Demo8.html");
		WebElement listbox = driver.findElement(By.name("BOOKS"));
		Select select=new Select(listbox);
		select.selectByIndex(1);
		select.selectByValue("html");
		select.selectByVisibleText("MOBILE COMPUTING");
		Thread.sleep(1000);
		select.deselectByIndex(1);
		Thread.sleep(1000);
		select.deselectByValue("html");
		Thread.sleep(1000);
		select.deselectByVisibleText("MOBILE COMPUTING");
		Thread.sleep(1000);
		driver.close();
		

	}

}
