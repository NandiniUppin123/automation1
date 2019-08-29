package com.actitime.genericlib;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.actitime.genericlib.Listenerclass.class)
public class Edituser {
@Test
public void testEdituser()
{
	Reporter.log("Edituser",true);
	Assert.fail();
}
}
