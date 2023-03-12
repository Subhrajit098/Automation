package selenium2;
// go the url and provide your date of birth in the date text field.

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dateofbirth
{
public static void main(String[] args) throws InterruptedException  
   {

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");
	driver.switchTo().frame(0);
	driver.findElement(By.className("hasDatepicker")).click();
	String year=driver.findElement(By.className("ui-datepicker-year")).getText();
	String month=driver.findElement(By.className("ui-datepicker-month")).getText();
	
	String my_month="May",my_year="1999";
	
	while(!(month.equals(my_month) && year.equals(my_year)))
	{
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
		month=driver.findElement(By.className("ui-datepicker-month")).getText();//here we reinitialize the month so that it will able to compare the condition after one loop
		year=driver.findElement(By.className("ui-datepicker-year")).getText();// here we reinitialize the year  "                        "                   "
	
	}
	driver.findElement(By.linkText("9")).click();

}
}
