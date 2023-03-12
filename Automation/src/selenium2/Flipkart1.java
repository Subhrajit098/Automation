package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

                          //go to flipkart search for iphone x and print productname and price as it is
public class Flipkart1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
	Thread.sleep(3000);
    List<WebElement>productname=driver.findElements(By.xpath("//div[@class='MIXNux']/following-sibling::div[1]/div[1]/div[contains(text(),'APPLE iPhone X')]"));
    
    for(WebElement Product:productname)
    {
     String pn= Product.getText();
    // driver.findElement(By.xpath("//div[text()='"+pn"]]"))
    }
}
}
