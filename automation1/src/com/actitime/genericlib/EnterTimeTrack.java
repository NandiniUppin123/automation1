package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterTimeTrack {
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement Task;


public EnterTimeTrack(WebDriver driver)
{

	
}
public void setuser() throws Exception
{
	                    
	Task.click();
	Thread.sleep(2000);
}
}
