package selenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragdrop2
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.xpath("//div[contains(@class,'checkbox')]")).click();
	driver.findElement(By.className("delete")).click();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='You are about to delete 14 tasks']")));
	WebElement deletemsg=driver.findElement(By.xpath("//div[text()='You are about to delete 14 tasks']"));
	System.out.println(deletemsg.getText());
	
}
}
