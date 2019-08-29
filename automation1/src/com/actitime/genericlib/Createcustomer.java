package com.actitime.genericlib;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
/**
 * 
 * @author KOLA
 *
 */
import org.testng.annotations.Test;
@Listeners(com.actitime.genericlib.Listenerclass.class)
public class Createcustomer extends Baseclass{
	//public static void main(string [] args)

	@Test
	public void Creatcusttest() throws Exception {
		

		Filelib f=new Filelib();
		Webdrivercoomomlib wlib= new Webdrivercoomomlib();
	//	String URL = f.getproprtydata("url");
//		String UN = f.getproprtydata("username");
	//	String PW = f.getproprtydata("password");
       String custname = f.getExceldata("createcustomer",1,0);
        // driver=new FirefoxDriver();
          //wlib.waitforpageload();
       // driver.get(URL);
        //driver.findElement(By.name("username")).sendKeys(UN);
        //driver.findElement(By.name("pwd")).sendKeys(PW);
        //driver.findElement(By.xpath("//div[text()='Login ']")).click();
        //System.out.println(custname);
     //Thread.sleep(4000);
   //  WebDriverWait wait = new WebDriverWait(driver, 60);
     //wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
     
     //System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[@class='content tasks']")).click();
        driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
      driver.findElement(By.xpath("//div[@id='ext-comp-1002']")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys(custname);
		driver.findElement(By.xpath("(//span[text()='Create Customer'])[1]")).click();
		
	//	driver.close();
	}
       @Test
       public void Edituser()
       {
    	   Reporter.log("Edituser",true);
    	   Assert.fail();
       }
       
       @Test
       public void Deleteuser()
       {
    	   Reporter.log("Deleteuser",true);
    	   Assert.fail();
       }
}

//}