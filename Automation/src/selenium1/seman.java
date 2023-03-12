package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seman 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	WebElement no=driver.findElement(By.id("username"));
	boolean b=no.isEnabled();
	System.out.println(b);
if(no.isEnabled()) 
{
	System.out.println("yes its enabled");
}
else
	System.out.println("not enabled");
}
}
