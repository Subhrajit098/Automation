package selenium2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame2 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.xpath("//font[text()='Free Mock Tests']")).click();
		driver.switchTo().parentFrame();
		 String mainnid=driver.getWindowHandle();
		 Set<String> allid=driver.getWindowHandles();
		 for(String id:allid) 
		 {
		if(!(mainnid.equals(id)))
		{
		driver.switchTo().window(id);	
		}
		 }
		WebElement insu=driver.findElement(By.linkText("//a[text()='Insurance']"));
		Actions act=new Actions(driver);
		act.moveToElement(insu).perform();
		insu.click();
		WebElement free=driver.findElement(By.xpath("//h1[contains(text(),'FREE Online Tests')]"));
		File src=free.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/google.png");
		FileUtils.copyFile(src, trg);
}
}