package selenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/Selenium/dropdown.html");
		WebElement movies=driver.findElement(By.id("movies"));
		Select s=new Select(movies);
		s.selectByIndex(1);
		s.selectByVisibleText("K.G.F");
		s.selectByVisibleText(" BalungaToka");
		s.deselectByVisibleText(" Damaan");
		Thread.sleep(2000);
		s.deselectAll();
		
}
}
