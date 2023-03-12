package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeF 
{ 
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		ActitimeF Af=new ActitimeF();
		Af.launchbrowser();
		Af.login();
		Af.Font();
	}
	public void launchbrowser()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void login()
	{
		driver.get("https://demo.actitime.com/login.do");
	}
	public void Font() throws InterruptedException 
	{
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(1000);
	WebElement msg=driver.findElement(By.xpath(" //span[contains(text(),'Please try again.')]"));
	Thread.sleep(2000);
	String Front=msg.getCssValue("font");
	System.out.println(Front);
	String errormsg=msg.getText();
	System.out.println("error msg: "+errormsg);
	//VALIDATION
	if(msg.isDisplayed())
	{
		System.out.println("error msg is displayed");
	}
	else
		System.out.println("error msg is not displayed");
	}
}
