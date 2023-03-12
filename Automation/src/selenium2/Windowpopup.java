package selenium2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowpopup 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.naukri.com/");
	WebElement job=driver.findElement(By.cssSelector("[title='Search Jobs']"));
	Actions act=new Actions(driver);
	act.moveToElement(job).perform();// moving to job webelement
	driver.findElement(By.cssSelector("[title='IT jobs']")).click();
	String mainid=	driver.getWindowHandle();
	driver.findElement(By.linkText("Java Developer")).click();
	
    System.out.println(mainid);
    Set<String> allid=driver.getWindowHandles();
    for(String id:allid) {
    	if(!(mainid.equals(id)))
    	{
    		driver.switchTo().window(id);
    		System.out.println(id);// new window session id it will fetch
    	}
    }
	
	String msg=driver.findElement(By.xpath("//h2[text()='Jobs you might be interested in']")).getText();
	System.out.println(msg);
	driver.close();// here child window will close
	driver.switchTo().window(mainid);// if we did't use switch to (),here  then driver will close and not moving back to the main page
	System.out.println(mainid);// main page session id it will fetch
	
	String title=driver.getTitle();// main page title will page
	System.out.println(title);
	
}
}
