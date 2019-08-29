package com.actitime.genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {

	public static WebDriver driver;
Filelib f=new Filelib();
	Webdrivercoomomlib wlib= new Webdrivercoomomlib();

	@BeforeClass
	public void open(){
		{
			Reporter.log("open",true);
			driver=new FirefoxDriver();
	}
	}
	
@BeforeMethod
	public void Login() throws Exception
	{
		String URL = f.getproprtydata("url");
	String UN = f.getproprtydata("username");
		String PW = f.getproprtydata("password");
       String custname = f.getExceldata("createcustomer",1,0);
     Reporter.log("Login",true);
        driver.get(URL);
        driver.findElement(By.name("username")).sendKeys(UN);
       driver.findElement(By.name("pwd")).sendKeys(PW);
       driver.findElement(By.xpath("//div[text()='Login ']")).click();
       
	}
	@AfterMethod
	public void Logout()
{
		driver.findElement(By.xpath("//a[text()='Logout']"));
	Reporter.log("Logout",true);
}
	
	@AfterClass
	public void close()
{
	driver.close();
		Reporter.log("close",true);
	}
	
	}

