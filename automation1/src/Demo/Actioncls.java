package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Actioncls {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Actions a=new 	Actions(driver);
		  WebElement recuiter = driver.findElement(By.xpath("//div[text()='Recruiters']"));
		  a.moveToElement(recuiter).perform();
		  driver.findElement(By.xpath("//a[text()='Browse All Recruiters']")).click();
		  driver.quit();
		
		

	}

}
