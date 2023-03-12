package selenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gmail 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		Actions act=new Actions(driver);
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		act.moveToElement(gmail).perform();
		act.contextClick(gmail).perform();
		gmail.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
}
}