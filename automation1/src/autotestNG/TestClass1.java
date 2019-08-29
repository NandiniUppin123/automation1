package autotestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(autotestNG.ListenerClass.class)
public class TestClass1 {
@Test
public void screenshot()
{
	Reporter.log("testcase1",true);
	Assert.fail();
}
}
