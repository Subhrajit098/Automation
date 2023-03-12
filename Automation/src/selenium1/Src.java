package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Src 
{  
	WebDriver driver;
	public static void main(String[] args) 
	{
		Src sr=new Src();
		sr.launchbrowser();
		sr.login();
		sr.scr();
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
	public  void scr() 
	{
	WebElement camera=driver.findElement(By.cssSelector("[alt='Camera search']"));
    String srcvalue=camera.getAttribute("src");
    System.out.println(srcvalue);
	}
}
