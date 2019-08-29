package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Logout {
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement loutbtn;
	

public Logout(WebDriver driver)
{

	
}
public void logout() throws Exception
{
	loutbtn.click();
	Thread.sleep(2000);
}
}



