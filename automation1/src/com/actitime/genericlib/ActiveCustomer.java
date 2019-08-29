package com.actitime.genericlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveCustomer {
	@FindBy(xpath="//div[@id='ext-comp-1002']")
	private WebElement createcust;
	
	@FindBy(xpath="//input[@id='customerLightBox_nameField']")
	private WebElement customer;
	
	@FindBy(xpath="(//span[text()='Create Customer'])[1]")
	private WebElement created;
	
	
	public void setuser(String custname) throws Exception
	{
		                    
		createcust.click();
		customer.sendKeys(custname);
		created.click();
		Thread.sleep(2000);
	}
	}



