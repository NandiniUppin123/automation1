package autotestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
@BeforeSuite
public void m1()
{
	Reporter.log("m1",true);
	}


@AfterSuite
public void m2()
{
	Reporter.log("m2",true);
	}


@BeforeMethod
	public void m7()
	{
	Reporter.log("m7",true);
	}


@AfterMethod
public void m8()
{
	Reporter.log("m8",true);
	}


@BeforeTest
public void m3()
{
Reporter.log("m3",true);	
}


@AfterTest
public void m4()
{
Reporter.log("m4",true);	
}


@BeforeClass
public void m5()
{
Reporter.log("m5",true);	
}


@AfterClass
public void m6()
{
Reporter.log("m6",true);	
}

}
