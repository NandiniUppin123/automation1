package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Color {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		int expectedheight = 32;
		String expfont ="14px";
		 String colour = driver.findElement(By.id("username")).getCssValue("color");
		 System.out.println(colour);
		 String actfont = driver.findElement(By.id("username")).getCssValue("font-size");
		 
		 if(expfont.equals(actfont)) {
			System.out.println(actfont); 
		 }
		 String family = driver.findElement(By.id("username")).getCssValue("font-family");
		 System.out.println(family);
		 int actheight = driver.findElement(By.id("username")).getSize().getHeight();
		 if(actheight==expectedheight) {
			 System.out.println("pass");
		 }
		 else {
			 System.out.println("fail");
		 }
		 System.out.println(actheight);
		 int width = driver.findElement(By.id("username")).getSize().getWidth();
		 System.out.println(width);
		 Point location = driver.findElement(By.id("username")).getLocation();
		 System.out.println(location.getX());
	   	driver.close();
		

	}

}
