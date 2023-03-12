package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartB 
{
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		FlipkartB fb=new FlipkartB();
		String productname="APPLE iPhone X (Silver, 256 GB)";
		fb.launchbrowser();
		fb.login();
		String price= fb.fetchprice(productname);
		System.out.println(price);
	}
	public void launchbrowser()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void login()
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}
	public String fetchprice(String productname) throws InterruptedException 
	{
		driver.findElement(By.name("q")).sendKeys("iphonex");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
		String price=driver.findElement(By.xpath("//div[text()='"+productname+"']/../../div[2]/div[1]/div[1]/div")).getText();
		return price;
	
	}
	
}
