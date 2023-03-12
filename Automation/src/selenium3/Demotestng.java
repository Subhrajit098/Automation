package selenium3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demotestng 
{
	@Test
	public void checkassert() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");
     String actualtitle="Datepicker | jQuery UI";
     String exptitle=driver.getTitle();
     Assert.assertEquals(actualtitle,exptitle );
     System.out.println("pass");
}
}
