package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//go to amazon website and fetch all the images and print all the image paths.
public class Amazon1 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	List<WebElement>allimage=driver.findElements(By.xpath("//img"));
  
	for(WebElement img:allimage) 
    {
	System.out.println(img.getAttribute("src"));
	
    }
}
}