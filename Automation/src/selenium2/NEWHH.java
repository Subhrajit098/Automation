package selenium2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// GO TO ACTITIME ,CLICK ON SETTINGS THEN CLICK ON TYPE OF WORKS THEN CLICK ON CREAT TYPE OF WORK THEN PROVIDE SOME NAME,THAN CLICK ON CANCEL, 
//AFTER THAT FETCH THE MSG FROM ALERT POPOF ,CLICK ON CANCEL, TAKE THE SCRREN SHOT OF CREATE NEW TYPE OF WORK 
public class NEWHH
{
public static void main(String[] args) throws IOException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
	driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button_settings ')]")).click();
	driver.findElement(By.linkText("Types of Work")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	driver.findElement(By.cssSelector("[name='name']")).sendKeys("vivek");
	driver.findElement(By.cssSelector("[onclick='handleCancel();']")).click();
	Alert alt=driver.switchTo().alert();
	String altmsg=alt.getText();
	System.out.println(altmsg);
	alt.dismiss();
	WebElement ts=driver.findElement(By.xpath("//table[@class='leftAligned']/tbody/tr/td"));
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File("./actitime/typework.png");
	FileUtils.copyFile(src, trg);
}
}
