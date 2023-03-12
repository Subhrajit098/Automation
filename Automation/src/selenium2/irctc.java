package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class irctc 
{
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-Notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.className("search_btn")).click();
	
	
}
}
