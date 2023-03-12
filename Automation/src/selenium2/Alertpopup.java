package selenium2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.sendKeys("hi alert");
	alt.accept();
	String result=driver.findElement(By.id("result")).getText();
	System.out.println(result);
}
}
