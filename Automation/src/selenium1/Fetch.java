package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(5000);//here we used thread.sleep becoz of syncronizing problem means loading time differ from web page and eclipse 
	driver.findElement(By.name("btnK")).click();
	 String title=driver.getTitle();
	 System.out.println(title);
	 
}
}
