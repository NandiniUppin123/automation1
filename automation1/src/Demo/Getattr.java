package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getattr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		 List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		 for(int i=0;i<alllinks.size();i++) {
			 String linktext = alllinks.get(i).getText();
			 System.out.println(linktext);
		 }
		driver.close();
		
	}
	

}
