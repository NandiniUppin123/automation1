package autotestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerClass implements ITestListener

{


@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	

}

@Override
public void onTestFailure(ITestResult result) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
	TakesScreenshot edriver=(TakesScreenshot)driver;
	File src=edriver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screnshot/ss.png");
	try
	{
		FileUtils.copyFile(src, dest);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}
