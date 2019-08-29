package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
		@FindBy(id="username")
		private WebElement untb;
		
		@FindBy(name="pwd")
		private WebElement pstb;
		
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement lgnbtn;
		
	public Login(WebDriver driver)
	{

		
	}
	public void setuser(String UN,String PW) throws Exception
	{
		untb.sendKeys(UN);
		pstb.sendKeys(PW);                      
		lgnbtn.click();
		Thread.sleep(2000);
	}
	}


