package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeE 
{
	WebDriver driver;
	public void launchbrowser()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public void login()
	{
		driver.get("https://demo.actitime.com/login.do");
	
		
		WebElement wb=driver.findElement(By.id("keepLoggedInCheckBoxContainer"));
	
		if(wb.isSelected()) 
		 {
	    
	      System.out.println("it is selected");
        }
	   else 
		{
			System.out.println("its not selected");
			wb.click();
		}
}
}





