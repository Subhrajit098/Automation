package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBag 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		String result=driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		System.out.println(result);
		
}
}
