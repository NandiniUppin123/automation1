package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E://Demo3.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("qspder");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("jspider");
		driver.close();
		

	}

}
