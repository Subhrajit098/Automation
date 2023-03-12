package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class selogoo 
{
	public static void main(String[]args) throws InterruptedException
	{
	//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe" );
	ChromeDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	driver.get("https://www.google.co.in/");
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	driver.navigate().refresh();
	Thread.sleep(10000);
	driver.close();	
	
}
}