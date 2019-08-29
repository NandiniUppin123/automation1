package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosugg {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> allsuggestion = driver.findElements(By.xpath("//span[contains(.,'java')]"));

		for(int i=0;i<allsuggestion.size();i++) {
			String text = allsuggestion.get(i).getText();
			System.out.println(text);
				}
		Thread.sleep(1000);
	allsuggestion.get(1).click();
	Thread.sleep(1000);
		driver.close();
		}

	}


