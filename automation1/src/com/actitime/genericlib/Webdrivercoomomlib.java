package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import 	org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdrivercoomomlib {
/**
 * implicit wait
 */
public void waitforpageload()
{
Baseclass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
}
/**
 * 
 * @param WE
 */
public void WaitforElementPresent(WebElement WE)
{
	WebDriverWait wait=new WebDriverWait(Baseclass.driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(WE));
}
public void Select(WebElement WE,String text)
{
Select sel=new Select(WE);
sel.selectByVisibleText(text);

	
}
public void select(WebElement WE,int index)
{
	Select s=new Select(WE);
	s.selectByIndex(index);
	
}
}
