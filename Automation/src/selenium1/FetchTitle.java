package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitle 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String title =driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
	}
	}
