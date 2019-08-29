package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {
	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement opentsk;

	
	
	public OpenTask(WebDriver driver)
	{

		
	}
	public void setuser() throws Exception
	{
		                    
		opentsk.click();
		Thread.sleep(2000);
	}
	}


