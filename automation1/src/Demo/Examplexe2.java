package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Examplexe2 {

	public static void main(String[] args) throws Exception {
		 
		    WebDriver driver=new FirefoxDriver();
		    driver.get("http://localhost/login.do");
		     String expectedresult = "Customer with such name already exists";
		    Example2 e=new Example2(driver);
		    PageFactory.initElements(driver, e);
		    Thread.sleep(1000);
		      e.setuser("admin","manager","Nandini"); 
		      Thread.sleep(1000);
		    
		      String Actualresult=driver.findElement(By.xpath("//div[text()='Customer with such name already exists']")).getText();
		   // System.out.println(Actualresult);
		      if(expectedresult.equals(Actualresult))
		    {
		    	System.out.println("pass");
		    }
		    else
		    {
		    	System.out.println("fail");
		    }
		    Thread.sleep(2000);
		    driver.close();


	}
}


