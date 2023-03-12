package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleA
{
	ChromeDriver driver;
public static void main(String[] args) throws InterruptedException 
{
	GoogleA go=new GoogleA();
	go.launchbrowser();
	go.login();
	go.search();
	go.fetchresult();
	go.close();
}
public void launchbrowser()
{

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
public void login()
{
	driver.get("https://www.google.co.in/");
}
public void search() throws InterruptedException
{
	
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[class='gLFyf']")).sendKeys("IPL");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
	
}
public void fetchresult()
{
String result=driver.findElement(By.id("result-stats")).getText();
System.out.println(result);
}
public void close()
{
	driver.close();
}
}
