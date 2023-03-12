package selenium1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeD 
{
	ChromeDriver driver; 
public static void main(String[] args) throws InterruptedException 
{
	Random R=new Random();
	int num=R.nextInt(5000);
	String actualcustomer_name="vivek";
	actualcustomer_name=actualcustomer_name+num;
	ActitimeD ac=new ActitimeD();
	ac.lunchBrowser();
	ac.login();
	Thread.sleep(1000);
	String expcustomername=ac.coustmeraddition(actualcustomer_name);
	System.out.println(expcustomername);
	if(expcustomername.equals(actualcustomer_name))
	{
		System.out.println("test case passed");
		
	}
	else {
	System.out.println("test case failed");
	}
	
	ac.close();
}

	public void lunchBrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
	}
	public void login()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
		driver.findElement(By.id("loginButton")).click();
	}
	public String coustmeraddition(String actualcustomer_name) throws InterruptedException 
	{
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[class='title ellipsis']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("inputNameField")).sendKeys(actualcustomer_name);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("hi my name is vivek");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(1000);
		String expcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		return expcustomername;
		
	}
	public void close()
	{
		driver.close();
	}
	
	
}

