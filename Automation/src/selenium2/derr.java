package selenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class derr 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");	
	driver.switchTo().frame(0);
	driver.findElement(By.id("datepicker")).click();
	WebElement dob=driver.findElement(By.id("datepicker"));
	dob.sendKeys("09/05/1999",Keys.ESCAPE);
	dob.getText();
	System.out.println();
}
}
