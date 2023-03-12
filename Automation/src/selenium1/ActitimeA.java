package selenium1;
                    
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ActitimeA 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("[name='remember']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#loginButton")).click();
	Thread.sleep(1000);
	String title=driver.getTitle();
	System.out.println(title);
	
	}
}
