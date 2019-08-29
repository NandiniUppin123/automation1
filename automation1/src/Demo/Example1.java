package Demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nandini.uppin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("8296402629");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='emp-info roboto-thin-text']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Update Resume']")).sendKeys("‪E:\\Nandini Uppin\\nandini_resume  (1).docx");
		driver.quit();
		
		

	}

}
