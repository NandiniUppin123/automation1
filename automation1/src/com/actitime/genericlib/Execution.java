package com.actitime.genericlib;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Demo.Example3login;

public class Execution extends Baseclass{

	public static void main(String[] args) throws Exception {
		Login l=new Login(driver);
		PageFactory.initElements(driver, l);
		Filelib f=new Filelib();
		Webdrivercoomomlib wlib= new Webdrivercoomomlib();
		
        String URL = f.getproprtydata("url");
         String UN=f.getproprtydata("username");
        String PW= f.getproprtydata("password");
       String custname=f.getExceldata("createcustomer",1,0);

       l.setuser(UN, PW);
       Logout l1=new Logout(driver);
       l1.logout();
       
       
       
       
       

	}

}
