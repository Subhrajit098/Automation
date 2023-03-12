package selenium2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//go to https://selenium08.blogspot.com/2019/11/selenium-iframe.html , then click on free mock test, 
//then click on insurance ,take the screenshot[insurance xam mock test free], after taking screen shot
//close the window then fetch the title of the main page and close the main page.
public class framepop 
{

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.switchTo().frame("iframe_a");
		WebElement a=driver.findElement(By.linkText("Free Mock Tests"));
		Actions act=new Actions(driver);
		act.moveToElement(a).perform();
		act.click().perform();
		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!(mainid.equals(id)))
			{
				driver.switchTo().window(id);
			}
			
		}
		driver.findElement(By.linkText("Insurance")).click();
		WebElement sc=driver.findElement(By.xpath("//h1[text()='Insurance Exam Mock Test Series | FREE Online Tests']"));
	    File src=sc.getScreenshotAs(OutputType.FILE);
	    File tag=new File("./screenshot/insurance.png");
	    FileUtils.copyFile(src, tag);
	    driver.close();
	    driver.switchTo().window(mainid);
	    System.out.println(driver.getTitle());
	    driver.close();
	}
}
