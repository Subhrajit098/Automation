package selenium1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Go to orange HRM -Click all the website will be there in  face book , Twitter, linked in - keep the linked in tab open and close all the other tabs
public class OrangeA 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]")).click();
		//driver.close();
		Set<String> allid=driver.getWindowHandles();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.);
	   Thread.sleep(2000);
       for(String id:allid) 
       {
    	driver.switchTo().window(id);
    	String title=driver.getTitle();
    	System.out.println(title);
        //Thread.sleep(1000);  	
    	   if(!title.equals("OrangeHRM | LinkedIn")) 
    	   {
    		driver.close();	
           }
    	   
        }
 
   }

}
