package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime 
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//for username webelement
	By usernameLoc=By.id("username");
	WebElement username=driver.findElement(usernameLoc);
	username.sendKeys("admin");
	//for paswordweb element
	By passwordLoc=By.name("pwd");
	WebElement password=driver.findElement(passwordLoc);
	password.sendKeys("manager");
	

	
}
}
