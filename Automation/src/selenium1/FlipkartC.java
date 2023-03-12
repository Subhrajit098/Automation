package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartC 
{
	ChromeDriver driver;
public static void main(String[] args) throws InterruptedException 
 {
	FlipkartC fc=new FlipkartC();
	fc.launchBrowser();
	fc.login();
	fc.compare();
 }

     public void launchBrowser() 
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
 		driver=new ChromeDriver();
 		driver.manage().window().maximize();
    
    }
    public void login() 
    {
    	driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
    }
    public void compare() throws InterruptedException 
    {

    driver.findElement(By.name("q")).sendKeys("iphonex");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("[type='submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//span[text()='Add to Compare'])[1]")).click();
    driver.findElement(By.xpath("(//span[text()='Add to Compare'])[last()]")).click();
    }
    
}
