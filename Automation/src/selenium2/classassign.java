package selenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class classassign 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");
	WebElement frame=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame);
	
	driver.findElement(By.className("hasDatepicker")).click();
	Actions act=new Actions(driver);
	/*WebElement date=driver.findElement(By.className("hasDatepicker"));
	act.moveToElement(date).perform();
	date.click();
	*/
	
}
}
