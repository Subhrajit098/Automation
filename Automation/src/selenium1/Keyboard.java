package selenium1;         // perform login action only by inspecting username field.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard 
{
	public static void main(String[] args) throws InterruptedException 
	{
		

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(1000);
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
}
}

//screenshot of amazon.in (present in top left corner (amazon.in webelement )
// go selenium webpage and take the screenshot of entire webpage
   