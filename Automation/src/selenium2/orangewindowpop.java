package selenium2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class orangewindowpop 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}
}
