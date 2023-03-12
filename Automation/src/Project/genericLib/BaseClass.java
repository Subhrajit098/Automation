package Project.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
public	WebDriver driver;
public	DataUtility du=new DataUtility();
public	CommonUtility cu=new CommonUtility();
public  static WebDriver ListenerDriver;
	@BeforeClass
public void launchBrowser() 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	ListenerDriver=driver;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@BeforeMethod
public void login() throws IOException 
{
	driver.get(du.getDataFromProperties("url"));
	driver.findElement(By.id("username")).sendKeys(du.getDataFromProperties("username"));
	driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("password"));
	driver.findElement(By.id("loginButton")).click();
}
	@AfterMethod
public void logout() throws InterruptedException
{
		Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
}
	@AfterClass
public void closeBrowser()
{
	driver.close();
}
}
