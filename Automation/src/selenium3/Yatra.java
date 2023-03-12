package selenium3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Yatra 
{
public static void main(String[] args) throws InterruptedException, AWTException, IOException 

{
	FileInputStream fis=new FileInputStream("D:\\Selenium\\PROPERTIES FILE\\yatra.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String Url=pobj.getProperty("url");
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
    opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(Url);
	driver.findElement(By.xpath("//span[text()='Buses']")).click();
    driver.findElement(By.id("BE_bus_from_station")).click();
	driver.findElement(By.xpath("//div[@class='viewport']/div/div/li[3]")).click();
	driver.findElement(By.xpath("//div[@class='viewport']/div/div/li[4]")).click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	driver.findElement(By.id("30/12/2022")).click();
	Actions act=new Actions(driver);
	WebElement search=driver.findElement(By.id("BE_bus_search_btn"));
	act.moveToElement(search).perform();
	search.click();
	String result=driver.findElement(By.xpath("//h1[contains(text(),'We have got')]")).getText();
	System.out.println(result);
	
	
}
}
