package advanceselenium;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vtiger 
{
public static void main(String[] args) throws InterruptedException {
	Random r=new Random();
	int num=r.nextInt(1000);
	String Actualorgname="vivekenterprises";
	Actualorgname=Actualorgname+num;
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("//a[text()='Organizations'][1]")).click();
	driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys("vivek");
	WebElement dropdown=driver.findElement(By.id("bas_searchfield"));
	Select s=new Select(dropdown);
	s.selectByVisibleText("Organization Name");
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	driver.findElement(By.name("accountname")).sendKeys(Actualorgname);
	driver.findElement(By.xpath("//input[@class='crmbutton small save'][1]")).click();
	driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();
	Thread.sleep(3000);
	Alert alt=driver.switchTo().alert();
	alt.accept();
	//driver.findElement(By.xpath("//td[contains (@onmouseover,'fnDropDownUser')][1]")).click();
}
}





