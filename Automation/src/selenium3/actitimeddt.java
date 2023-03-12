package selenium3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class actitimeddt 
{
	public static void main(String[] args) throws IOException {
		
	FileInputStream fis=new FileInputStream("D:\\Selenium\\PROPERTIES FILE\\acti.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String Url=pobj.getProperty("url");
	String Username=pobj.getProperty("username");
	String Password=pobj.getProperty("password");
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
    opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(Url);
	driver.findElement(By.id("username")).sendKeys(Username);
	driver.findElement(By.name("pwd")).sendKeys(Password);
	driver.findElement(By.id("loginButton")).click();
}
}
