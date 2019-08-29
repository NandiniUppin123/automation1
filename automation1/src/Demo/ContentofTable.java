package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContentofTable {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(1000);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	 List<WebElement> alllinks = driver.findElements(By.xpath("//td"));
		 for(int i=0;i<alllinks.size();i++) {
			 String linktext = alllinks.get(i).getText();
			 System.out.println(linktext);
			 Thread.sleep(2000);
		 }
		driver.close();
		
	}

}
