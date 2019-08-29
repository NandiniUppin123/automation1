package autotestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass {
	@BeforeSuite
	public void openapp()
	{
		Reporter.log("openapp",true);
	}

	@AfterSuite
	public void closeapp()
	{
		Reporter.log("closeapp",true);
}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
	@Test(priority=2)
	public void edituser()
	{
		Reporter.log("edituser",true);
	}
	
	@Test(priority=1)
	public void createuser()
	{
		Reporter.log("createuser",true);
	}
	
	@Test
	public void deleteuser()
	{
		Reporter.log("deleteuser",true);
	}
	
	
	
}



