package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiddenclkpopup {

	public static void main(String[] args) throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.makemytrip.com");
	Thread.sleep(1000);
	int count=0;
	driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	Thread.sleep(1000);
	String x = ("(//div[text()='January 2020']/../../..//p[text()='11'])[2]");
	Thread.sleep(2000);
	String y = ("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']");
	Thread.sleep(2000);
	while(count<12)
	{
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(x));
			break;
		}
		catch(Exception e)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath(y));
		}
		
	}
	driver.close();
	
	

	}

}
