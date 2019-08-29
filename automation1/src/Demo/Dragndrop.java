package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Actions action=new Actions(driver);
		WebElement source1 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		Thread.sleep(4000);
		WebElement target1 = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(2000);
		action.dragAndDrop(source1, target1).perform();
		Thread.sleep(1000);
		driver.close();

	}

}
