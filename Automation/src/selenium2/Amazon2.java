package selenium2;
                                    //screenshot of amazon.in (present in top left corner (amazon.in webelement )
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement amazon=driver.findElement(By.id("nav-logo-sprites"));
	File src=amazon.getScreenshotAs(OutputType.FILE);
	File trg=new File("./Screenshot/amazonin.png");
	FileUtils.copyFile(src, trg);
	
}
}




