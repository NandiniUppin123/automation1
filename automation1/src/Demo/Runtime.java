package Demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Runtime {

	public static void main(String[] args) {
		 WebDriver driver=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name:GC/FF/IE");
		String browser = sc.next();
		if(browser.equals("FF"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("GC"))
		{
			driver=new ChromeDriver();
		}
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}


