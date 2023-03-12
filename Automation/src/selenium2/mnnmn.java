package selenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mnnmn 
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
	
	boolean t=true;
    while(t)
    {
    driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-prev')]")).click();
    WebElement month=driver.findElement(By.className("ui-datepicker-title"));
    String mymonth=month.getText();
    if(mymonth.equals("May 1999"))
    {
    	t=false;
    }
    }
    driver.findElement(By.xpath("//a[@data-date='05']")).click();
 
}
}
