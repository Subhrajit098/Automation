package selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra_com 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.yatra.com/");
	Thread.sleep(5000);
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	String title=driver.getTitle();
	Thread.sleep(5000);
	System.out.println(title);
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.manage().window().fullscreen();
	//extra
	driver.manage().window().minimize();
	driver.get("https://www.amazon.in/");
	driver.manage().window().setSize(new Dimension(400,600));
	Thread.sleep(5000);
	driver.manage().window().setPosition(new Point(300,500));
	
}
}
